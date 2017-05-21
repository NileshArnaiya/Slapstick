package crystal.labs.instavines.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAuthIOException;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Channel;
import com.google.api.services.youtube.model.ChannelListResponse;

import java.io.IOException;
import java.util.List;

import crystal.labs.instavines.util.Constants;

public class GetUsernameTask extends AsyncTask<Void, Void, String> {

    private static final int REQUEST_AUTHORIZATION = 55664;
    private final HttpTransport transport = AndroidHttp.newCompatibleTransport();
    private final JsonFactory jsonFactory = new GsonFactory();
    private final Activity mActivity;
    private final InterfaceAsyncTask mListener;
    private final GoogleAccountCredential mCredential;

    public GetUsernameTask(Activity activity, GoogleAccountCredential credential, InterfaceAsyncTask listener) {
        this.mActivity = activity;
        this.mCredential = credential;
        this.mListener = listener;
    }

    /**
     * Executes the asynchronous job. This runs when you call execute()
     * on the AsyncTask instance.
     */
    @Override
    protected String doInBackground(Void... params) {
        try {
            String token = fetchToken();
            if (token != null) {
                Log.e("Token", token);
                return token;
            }
        } catch (IOException e) {
            // The fetchToken() method handles Google-specific exceptions,
            // so this indicates something went wrong at a higher level.
            // TIP: Check for network connectivity before starting the AsyncTask.
        }
        return null;
    }

    /**
     * Gets an authentication token from Google and handles any
     * GoogleAuthException that may occur.
     */
    private String fetchToken() throws IOException {
        try {
            YouTube youtube = new YouTube.Builder(transport, jsonFactory,
                    mCredential).setApplicationName(Constants.APP_NAME)
                    .build();
            ChannelListResponse clr = youtube.channels()
                    .list("contentDetails").setMine(true).execute();

            /* It's important to have at least one youtube channel associated with
            the logged in google account (on the device) otherwise channelsList will be empty */

            List<Channel> channelsList = clr.getItems();

            if (channelsList != null && channelsList.size() != 0) {

                /* Here we get the liked videos (by the user) playlist ID using getLikes() method
                 but you can also use getWatchHistory(), getWatchLater(), getFavorites(), and getUploads()
                 methods depending on your requirement */

                String playlistId = channelsList.get(0).getContentDetails().getRelatedPlaylists().getLikes();

                if (playlistId != null) {
                    return mCredential.getToken() + " " + playlistId;
                }
            }

            return mCredential.getToken();
        } catch (UserRecoverableAuthIOException userRecoverableException) {
            // GooglePlayServices.apk is either old, disabled, or not present
            // so we need to show the user some UI in the activity to recover.
            mActivity.startActivityForResult(userRecoverableException.getIntent(), REQUEST_AUTHORIZATION);
        } catch (GoogleAuthIOException fatalException) {
            // Some other type of unrecoverable exception has occurred.
            // Report and log the error as appropriate for your app.
        } catch (GoogleAuthException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        if (!isCancelled())
            mListener.onTokenReceived(result);
    }

    public interface InterfaceAsyncTask {

        void onTokenReceived(String result);

    }

}