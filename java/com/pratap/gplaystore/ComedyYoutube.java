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

import crystal.labs.instavines.KapilWebView;
import crystal.labs.instavines.R;
import crystal.labs.instavines.activity.Alxjames;

public class ComedyYoutube extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
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
        final ArrayList<ListItem> listData = getListData();
//
//SearchView = (SearchView) findViewById(R.id.search_view);
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        listView = (ListView) findViewById(R.id.custom_list);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(
                ComedyYoutube.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
        toggle.setDrawerIndicatorEnabled(true);
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

        listView.setAdapter(new CustomListAdapter(ComedyYoutube.this, listData));
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem newsData = (ListItem) listView.getItemAtPosition(position);
               // Toast.makeText(ComedyYoutube.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();


                if (newsData.getHeadline().equalsIgnoreCase("Collegehumor")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUPDXXXJj9nax0fr0Wfc048g");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("impractical jokers")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "PLZxWJ6CTr63bL1Vc2qB6zyG_Gad4hpB9K");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("scoopWhoop")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUx2HcmpB-UZGkMXOCJ4QIVA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("break")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUlmmbesFjIzJAp8NQCtt8dQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("whatever")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UU37PFGlxWgx4tU6SlhPCdCw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("whatever2ND")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUEIC_kfSpKe5NVfAeq1YKAQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("pewdiepie")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UU-lHJZR3Gqxm24_Vd_AJ5Yw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the kapil sharma show")) {
                    Intent i = new Intent(ComedyYoutube.this, KapilWebView.class);
                    i.putExtra("mrbean", "PLrQwDBhnZHYrtOoO8ZlZFa_Rum_-7HmeN");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("how it should have ended")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUHCph-_jLba_9atyCZJPLQQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the warp zone")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUSOkex4abVl14cZ4tLyUYzw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("screen junkies")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUOpcACMWblDls9Z6GERVi1A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("EpicVoiceGuy")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUYfSN5GeI_UgoaA-KUfT1aA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("youtubefanfest")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUhIGU8b4l5cj6i5D9REsqdg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("theodd1sout")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUo8bcnLyZH8tBIH9V1mLgqQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("smosh")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUY30JRSgfhYXA6i6xX1erWg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("shut up cartoons")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UU-T_EdQ6MTufAWnFXa7dnYw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("thedominicshow")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUKcGZgLvLdgD1o3dh7JadkA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("julien bam")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUTXeJ33DzXI2veQpKfrvaYw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("beingindian")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUhAlpEbfW1y9auiBC08ZwGQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("niga higa")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUSAUGyc_xA8uYzaIVG6MESQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("ricegum")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUDo9msNItILnyF_Y2eHaNQg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("buzzfeedvideo")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUpko_-a4wgz2u_DgDgd9fqA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("fbe")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "PU0v-tlzsn0QZwJnkiaUSJVQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("matthewsantoro")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "PUXhSCMRRPyxSoyLSPFxK7VA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("rob dyke")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUYxrnDjNQZIs_aAcdhqSveg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("prankvsprank")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "UUgefQJC5UgbWJHDxBqB4qVg");
                    startActivity(i);

                }

                if (newsData.getHeadline().equalsIgnoreCase("explosmentertainment")) {
                    Intent i = new Intent(ComedyYoutube.this, Alxjames.class);
                    i.putExtra("mrbean", "PUWXCrItCF6ZgXrdozUS-Idw");
                    startActivity(i);

                }

            }
        });

        searchView.setSuggestions(getResources().getStringArray(R.array.youtube_comedy_title));
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
                CustomListAdapter cus = new CustomListAdapter(ComedyYoutube.this, listData);
                cus.filter(newText);
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                searchView.setHint("Search Your Favorite youtubers");
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
        String[] images = getResources().getStringArray(R.array.youtube_comedy_img);
        String[] headlines = getResources().getStringArray(R.array.youtube_comedy_title);
        String[] descriptions = getResources().getStringArray(R.array.youtube_comedy_description);

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
            Intent i = new Intent(ComedyYoutube.this, TwoThousandShows.class);
            startActivity(i);
        } else if (id == R.id.nav_cartoons) {
            Intent i = new Intent(ComedyYoutube.this, Main2Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_comedy) {
            Intent i = new Intent(ComedyYoutube.this, YoutubeArtists.class);
            startActivity(i);
        } else if (id == R.id.nav_channels) {
            Intent i = new Intent(ComedyYoutube.this, ComedyYoutube.class);
            startActivity(i);
        } else if (id == R.id.nav_viners) {
            Intent i = new Intent(ComedyYoutube.this, VinesComedy.class);
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

