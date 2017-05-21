package com.pratap.gplaystore;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;

import crystal.labs.instavines.R;
import crystal.labs.instavines.activity.Alxjames;

public class YoutubeArtists extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //    FloatingSearchView mSearchView;
    ListView listView;
    MaterialSearchView searchView;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2main);
//mSearchView = (FloatingSearchView) findViewById(R.id.floating_search_view);
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        final ArrayList<ListItem> listData = getListData();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(
                YoutubeArtists.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.setHomeAsUpIndicator(R.drawable.ic_menu_camera);
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }
            }
        });
        toggle.syncState();
//
//SearchView = (SearchView) findViewById(R.id.search_view);------------------------------------------------------------------------------
        listView = (ListView) findViewById(R.id.custom_list);
        listView.setAdapter(new CustomListAdapter(YoutubeArtists.this, listData));
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem newsData = (ListItem) listView.getItemAtPosition(position);
                // Toast.makeText(YoutubeArtists.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
                if (newsData.getHeadline().equalsIgnoreCase("aib")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUzUYuC_9XdUUdrnyLii8WYg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the viral fever")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("east india comedy")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUpU9EZn1Ll9kPpSuBsn4VyA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("shudh desi endings")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUF-aIi0zXNwZZucGtWk4pug");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("sng comedy")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UU6xOVUMstTf08rUgOFbyPEA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the timeliners")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUTlnaHHQ75zlDg_fLr7tGEg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("girliyapa")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUdxbhKxr8pyWTx1ExCSmJRw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("funk you")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUrfkB8kEd58c9wWGWsWIwEA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("baap of bakchod")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUyzcUJoFTL32HM2Mfs4z6lw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("aditi mittal")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUvdnX4xRyt3oTW4et446_Ow");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("abish mathew")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "PLlNOc-GhuKgQ-s0KlIwrO0OWAmORQbgc-");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("kenny sebastian")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUzNq9i-DlDDBLjPerVzJW-A");
                    startActivity(i);

                }

                if (newsData.getHeadline().equalsIgnoreCase("carryminati")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUj22tfcQrWG7EMEKS0qLeEg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("daniel fernandes")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUFREM8qDW8rjM-c-75-wrYA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("be younick")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UU7sRFTKIbH4NNpFXmpUAWuA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("screen patti")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNyeSfUfffmJXwA2_tmNG9A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("realshit")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUsSZyyGKf9FdpqDmynjVBcA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("happii-fi")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UU-fTSP7yn4ZTD9EAHDCqq3Q");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("avrpranktv")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUIHdr1oAtGvPeJTmxpQVDfw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("troubleseekerteam")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUXIc6eWL9kukLU-ZbV3biOQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("zakir khan")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUkS7Vxu4PjM99w0Is6idjcg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("funny or die")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUzS3-65Y91JhOxFiM7j6grg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the key of awesome")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUEmCXnbNYz-MOtXi3lZ7W1Q");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("kanan gill")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UU5W8kZaY_u59fwgtjnLrBXA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("round2hell")) {
                    Intent i = new Intent(YoutubeArtists.this, Alxjames.class);
                    i.putExtra("mrbean", "UUt4atlExw8aj3Bm79nv1fig");
                    startActivity(i);

                }



            }
        });


        searchView.setSuggestions(getResources().getStringArray(R.array.youtube_channel_title));
        searchView.setVoiceSearch(true);

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Do some magic
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Do some magic
                CustomListAdapter cus = new CustomListAdapter(YoutubeArtists.this, listData);
                cus.filter(newText);
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                searchView.setHint("Search Your Favorite Channels");
                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic
            }
        });



//        inputSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                String text = inputSearch.getText().toString().toLowerCase(Locale.getDefault());
//                CustomListAdapter customListAdapter = new CustomListAdapter(YoutubeArtists.this,listData);
//                customListAdapter.filter(text);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                String text = inputSearch.getText().toString().toLowerCase(Locale.getDefault());
//                CustomListAdapter customListAdapter = new CustomListAdapter(YoutubeArtists.this,listData);
//                customListAdapter.filter(text);
//            }
//        });
//
//
//        searchView = (MaterialSearchView) findViewById(R.id.search_view);
//        searchView.setSuggestions(getResources().getStringArray(R.array.query_suggestions));
//        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                //Do some magic
//
//                return true;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                //Do some magic
//                CustomListAdapter cus = new CustomListAdapter(YoutubeArtists.this, listData);
//                cus.filter(newText);
//                return false;
//            }
//        });
//
//        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
//            @Override
//            public void onSearchViewShown() {
//                //Do some magic
//            }
//
//            @Override
//            public void onSearchViewClosed() {
//                //Do some magic
//            }
//        });

    }

    private ArrayList<ListItem> getListData() {
        ArrayList<ListItem> listMockData = new ArrayList<ListItem>();
        String[] images = getResources().getStringArray(R.array.youtube_channel_img);
        String[] headlines = getResources().getStringArray(R.array.youtube_channel_title);
        String[] descriptions = getResources().getStringArray(R.array.youtube_channel_description);

        for (int i = 0; i < images.length; i++) {
            ListItem newsData = new ListItem();
            newsData.setUrl(images[i]);
            newsData.setHeadline(headlines[i]);
            newsData.setReporterName(descriptions[i]);
            listMockData.add(newsData);
        }
        return listMockData;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//
//        MenuItem item = menu.findItem(R.id.action_search);
//        searchView.setMenuItem(item);
//
//        return true;
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (searchView.isSearchOpen()) {
//            searchView.closeSearch();
//        } else {
//            super.onBackPressed();
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);


        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (searchView.isSearchOpen()) {
            searchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_funny) {
            // Handle the camera action
            Intent i = new Intent(YoutubeArtists.this, TwoThousandShows.class);
            startActivity(i);
        } else if (id == R.id.nav_cartoons) {
            Intent i = new Intent(YoutubeArtists.this, Main2Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_comedy) {
            Intent i = new Intent(YoutubeArtists.this, YoutubeArtists.class);
            startActivity(i);
        } else if (id == R.id.nav_channels) {
            Intent i = new Intent(YoutubeArtists.this, ComedyYoutube.class);
            startActivity(i);
        } else if (id == R.id.nav_viners) {
            Intent i = new Intent(YoutubeArtists.this, VinesComedy.class);
            startActivity(i);
        }

//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);  // OPEN DRAWER
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}

