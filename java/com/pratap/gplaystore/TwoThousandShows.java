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
import android.widget.Toast;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;

import crystal.labs.instavines.R;

public class TwoThousandShows extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
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
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(
                TwoThousandShows.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
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
//SearchView = (SearchView) findViewById(R.id.search_view);
        listView = (ListView) findViewById(R.id.custom_list);
        listView.setAdapter(new CustomListAdapter(TwoThousandShows.this, listData));
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem newsData = (ListItem) listView.getItemAtPosition(position);
                Toast.makeText(TwoThousandShows.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();

            }
        });



        searchView.setSuggestions(getResources().getStringArray(R.array.twenty_zero_title));
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
                CustomListAdapter cus = new CustomListAdapter(TwoThousandShows.this, listData);
                cus.filter(newText);
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                searchView.setHint("Search Your 2000's shows");
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
        String[] images = getResources().getStringArray(R.array.twenty_zero_img);
        String[] headlines = getResources().getStringArray(R.array.twenty_zero_title);
        String[] descriptions = getResources().getStringArray(R.array.twenty_zero_desc);

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
            Intent i = new Intent(TwoThousandShows.this, TwoThousandShows.class);
            startActivity(i);
        } else if (id == R.id.nav_cartoons) {
            Intent i = new Intent(TwoThousandShows.this, Main2Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_comedy) {
            Intent i = new Intent(TwoThousandShows.this, YoutubeArtists.class);
            startActivity(i);
        } else if (id == R.id.nav_channels) {
            Intent i = new Intent(TwoThousandShows.this, ComedyYoutube.class);
            startActivity(i);
        } else if (id == R.id.nav_viners) {
            Intent i = new Intent(TwoThousandShows.this, VinesComedy.class);
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

