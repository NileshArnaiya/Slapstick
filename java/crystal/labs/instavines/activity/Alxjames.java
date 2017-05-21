package crystal.labs.instavines.activity;

import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.common.AccountPicker;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.util.ExponentialBackOff;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import crystal.labs.instavines.CustomApplication;
import crystal.labs.instavines.R;
import crystal.labs.instavines.async.GetUsernameTask;
import crystal.labs.instavines.fragment.VideoListFragment;
import crystal.labs.instavines.fragment.YoutubePlayerFragment;
import crystal.labs.instavines.pojo.PlaylistItem;
import crystal.labs.instavines.pojo.PlaylistResponse;
import crystal.labs.instavines.util.Constants;
import crystal.labs.instavines.util.NetworkUtil;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;
import fr.castorflex.android.smoothprogressbar.SmoothProgressDrawable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Alxjames extends AppCompatActivity implements VideoListFragment.OnItemSelectedListener, View.OnClickListener {

    private static final int REQUEST_CODE_PICK_ACCOUNT = 1000;
    private static final int REQUEST_AUTHORIZATION = 55664;

    private SmoothProgressBar mPocketBar;

    private String nextPageToken;
    private String OAuthToken;
    private int totalResults = 0;

    private String mEmail;
    private String playlistId;

    private VideoListFragment videoListFragment;
    private YoutubePlayerFragment videoPlayerFragment;

    private FloatingActionButton fab;
    private CoordinatorLayout mView;
    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initView();













        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.playlist_dialog_layout, null);
        Intent i = getIntent();
        final EditText etPlaylistId = (EditText) alertLayout.findViewById(R.id.et_playlist_id);
        String anyshow = i.getStringExtra("mrbean");
        etPlaylistId.setText(anyshow);









        if (!TextUtils.isEmpty(etPlaylistId.getText().toString())) {
            playlistId = etPlaylistId.getText().toString().trim();
            getAnyPlaylist();
        }


















        if (savedInstanceState != null) {
            videoListFragment = (VideoListFragment) getSupportFragmentManager().findFragmentByTag(VideoListFragment.class.getSimpleName());
            videoPlayerFragment = (YoutubePlayerFragment) getSupportFragmentManager().findFragmentByTag(YoutubePlayerFragment.class.getSimpleName());
            switchVideoListFragment(videoListFragment, VideoListFragment.class.getSimpleName());
            switchVideoPlayerFragment(videoPlayerFragment, YoutubePlayerFragment.class.getSimpleName());
        } else {
//           pickUserAccount();
            videoListFragment = VideoListFragment.newInstance();
            videoPlayerFragment = YoutubePlayerFragment.newInstance();
            switchVideoListFragment(videoListFragment, VideoListFragment.class.getSimpleName());
            switchVideoPlayerFragment(videoPlayerFragment, YoutubePlayerFragment.class.getSimpleName());
        }
    }

    private void initView() {
        mView = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        mPocketBar = (SmoothProgressBar) findViewById(R.id.pocketProgressBar);
        mPocketBar.setSmoothProgressDrawableCallbacks(new SmoothProgressDrawable.Callbacks() {
            @Override
            public void onStop() {
                mPocketBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onStart() {
                mPocketBar.setVisibility(View.VISIBLE);
            }
        });



        mSnackbar = Snackbar.make(mView, getString(R.string.fetch_token_msg), Snackbar.LENGTH_INDEFINITE);
    }

    private void pickUserAccount() {
        String[] accountTypes = new String[]{"com.google"};
        Intent mIntent = AccountPicker.newChooseAccountIntent(null, null,
                accountTypes, false, null, null, null, null);
        if (mIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(mIntent, REQUEST_CODE_PICK_ACCOUNT);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_PICK_ACCOUNT) {
            // Receiving a result from the AccountPicker
            if (resultCode == RESULT_OK) {
                mEmail = data.getStringExtra(AccountManager.KEY_ACCOUNT_NAME);
                // With the account name acquired, go get the auth token
                //getToken();
            }
        }

        if (requestCode == REQUEST_AUTHORIZATION) {
            if (resultCode == RESULT_OK) {
                //getToken();
            }
        }
    }

    private void getToken() {

        mSnackbar.show();
        if (NetworkUtil.isNetworkAvailable(getApplicationContext())) {
            final GoogleAccountCredential googleCredential = GoogleAccountCredential.usingOAuth2(getApplicationContext(), Arrays.asList(Constants.SCOPES));
            googleCredential.setBackOff(new ExponentialBackOff());
            new GetUsernameTask(this, googleCredential.setSelectedAccountName(mEmail), new GetUsernameTask.InterfaceAsyncTask() {
                @Override
                public void onTokenReceived(String result) {
                    if (result != null) {
                        if (result.contains(" ")) {
                            OAuthToken = "Bearer " + result.split(" ")[0];
                            playlistId = result.split(" ")[1];
                        } else {
                            OAuthToken = "Bearer " + result;
                        }
                        getOauthPlaylist();
                    } else {
                        mSnackbar.setText(getString(R.string.token_error_msg));
                    }
                }
            }).execute();

        } else {
            mSnackbar.setText(getString(R.string.internet_error_msg));
            mSnackbar.setAction("Retry", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSnackbar.dismiss();
                    //getToken();
                }
            });
        }
    }


    private void getOauthPlaylist() {
        mSnackbar.setText(getString(R.string.load_playlist_msg));
        mSnackbar.show();
        Map<String, String> firstFilters = new HashMap<>();
        firstFilters.put("part", "snippet");
        firstFilters.put("maxResults", "50");
        firstFilters.put("playlistId", playlistId);

        mPocketBar.progressiveStart();

        Call<PlaylistResponse> getOauthPlaylist = CustomApplication.getYoutubeClient().getService().getOauthPlaylist(OAuthToken, firstFilters);
        getOauthPlaylist.enqueue(new Callback<PlaylistResponse>() {
            @Override
            public void onResponse(Response<PlaylistResponse> playlistResponse) {
                mPocketBar.progressiveStop();
                mSnackbar.dismiss();
                if (playlistResponse.isSuccess() && playlistResponse.body().getPlaylistItems().size() != 0) {
                    totalResults = playlistResponse.body().getResponsePageInfo().getTotalResults();
                    nextPageToken = playlistResponse.body().getNextPageToken();

                    if (videoListFragment != null) {
                        videoListFragment.loadList(OAuthToken, playlistId, nextPageToken, playlistResponse.body().getPlaylistItems());
                    }

                    if (videoPlayerFragment != null) {
                        videoPlayerFragment.setVideoId(playlistResponse.body().getPlaylistItems().get(0).getItemSnippet().getSnippetResourceId().getVideoId());
                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                mPocketBar.progressiveStop();
                if (t instanceof IOException) {
                    mSnackbar.setText(getString(R.string.internet_error_msg));
                    mSnackbar.setAction("Retry", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mSnackbar.dismiss();
                            getOauthPlaylist();
                        }
                    });
                }
            }
        });
    }

    private void getAnyPlaylist() {

        mSnackbar.setText(getString(R.string.load_playlist_msg));
        mSnackbar.show();

        Map<String, String> firstFilters = new HashMap<>();
        firstFilters.put("part", "snippet");
        firstFilters.put("maxResults", "50");
        firstFilters.put("playlistId", playlistId);
        firstFilters.put("key", Constants.API_KEY);

        mPocketBar.progressiveStart();

        Call<PlaylistResponse> getAnyPlaylist = CustomApplication.getYoutubeClient().getService().getAnyPlaylist(firstFilters);
        getAnyPlaylist.enqueue(new Callback<PlaylistResponse>() {
            @Override
            public void onResponse(Response<PlaylistResponse> playlistResponse) {
                mPocketBar.progressiveStop();
                mSnackbar.dismiss();

                if (playlistResponse.isSuccess() && playlistResponse.body().getPlaylistItems().size() != 0) {
                    totalResults = playlistResponse.body().getResponsePageInfo().getTotalResults();
                    nextPageToken = playlistResponse.body().getNextPageToken();

                    if (videoListFragment != null) {
                        videoListFragment.loadList(null, playlistId, nextPageToken, playlistResponse.body().getPlaylistItems());
                    }

                    if (videoPlayerFragment != null) {
                        videoPlayerFragment.setVideoId(playlistResponse.body().getPlaylistItems().get(0).getItemSnippet().getSnippetResourceId().getVideoId());
                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                mPocketBar.progressiveStop();
                if (t instanceof IOException) {
                    mSnackbar.setText(getString(R.string.internet_error_msg));
                    mSnackbar.setAction("Retry", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mSnackbar.dismiss();
                            getAnyPlaylist();
                        }
                    });
                }
            }
        });
    }

    private void switchVideoPlayerFragment(Fragment mTarget, String tag) {
        if (mTarget != null && !mTarget.isInLayout()) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.video_player_container, mTarget, tag)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        }
    }

    private void switchVideoListFragment(Fragment mTarget, String tag) {
        if (mTarget != null && !mTarget.isInLayout()) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.video_list_container, mTarget, tag)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        }
    }

    @Override
    public void onItemSelected(PlaylistItem playlistItem) {

        if (videoPlayerFragment != null) {
            videoPlayerFragment.setVideoId(playlistItem.getItemSnippet().getSnippetResourceId().getVideoId());
        }
    }

    @Override
    public void onClick(View v) {

    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.fab:
//                fab.hide();
//
//                break;
//        }
//    }



//    public void displayPlaylistDialog() {
//        LayoutInflater inflater = getLayoutInflater();
//        View alertLayout = inflater.inflate(R.layout.playlist_dialog_layout, null);
//        final EditText etPlaylistId = (EditText) alertLayout.findViewById(R.id.et_playlist_id);
//        etPlaylistId.setText("PLrQwDBhnZHYo5qASKSCQdF8sZHSVOrHuE");
//
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        alert.setView(alertLayout);
//        alert.setCancelable(true);
//        alert.setNegativeButton("Cancel", null);
//        alert.setPositiveButton("Fetch", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // code for matching password
//                if (!TextUtils.isEmpty(etPlaylistId.getText().toString())) {
//                    playlistId = etPlaylistId.getText().toString().trim();
//                    getAnyPlaylist();
//                }
//            }
//        });
//        AlertDialog dialog = alert.create();
//        dialog.show();
//    }
}
