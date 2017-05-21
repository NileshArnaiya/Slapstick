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

public class VinesComedy extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ListView listView;
    MaterialSearchView searchView;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2main);
        final ArrayList<ListItem> listData = getListData();
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
         drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(
                VinesComedy.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
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
        listView = (ListView) findViewById(R.id.custom_list);
        listView.setAdapter(new CustomListAdapter(VinesComedy.this, listData));
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem newsData = (ListItem) listView.getItemAtPosition(position);

                if (newsData.getHeadline().equalsIgnoreCase("Zach King")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUq8DICunczvLuJJq414110A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("King Bach")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUIvGs1yGop7dDESN8r3f8Rg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("Bhuvan Bam")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "PUqwUrj10mAEsqezcItqvwEw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("rudy mancuso")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU5jkXpfnBhlDjqh0ir5FsIQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("Ashish Chanchlani")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU7eHZXheF8nVOfwB2PEslMw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("curtislepore")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUsgMB2AZAPurPKT9HdoQmiA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("nash grier")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UURiMBJf62RzwEHK28bUf4vg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("thomas sanders")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU80Z-cIOdR6upfnrPJ8Q00A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("matthew espinosa")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUIVtfot7s0TeGMDMQjBVp9A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("anwar jibawi")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUEr55381WIqO1w_IzgcI5DQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("hannah stocking")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUkS8bfIrm38QCSQeOqRxR4A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("alx james")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU0qjcilrxtf1HSVh3wlXfrA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("inanna sarkis")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUR4RidHeLYLLFIgM5XycBXw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("harsh beniwal")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUVmEbEQUGXHVm-O9pqa3JWg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("christian delgrosso")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUBEf6WIIYKa0l6m-1A-2Q6w");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("lele pons")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUi9cDo6239RAzPpBZO9y5SA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("liza koshy")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUxSz6JVYmzVhtkraHWZC7HQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("cameron dallas")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUUKxWDTKylMaLjbNe3pOpCg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("jake paul")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUcgVECVN4OKV6DH1jLkqmcA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("amanda cerny")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUbyGK5QKd3z0POnjEQ8jdtg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("juanpa zurita")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUUo7T81zvCqpPhfsPb_kajA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("kc james")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUJGkZkJtCvuNK7fc3ZJeQ7g");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("brittany furlan")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUsxN0GZ8MHeVbMkXlhrbXGw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("eric dunn")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUO6pYGHqfTTJcEiPfkbEQ2Q");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("logan paul")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUbwMZHCMpBiOWfYLBOH-9Qw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("lance stewart")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU6-NBhOCP8DJqnpZE4TNE-A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("brent rivera")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU56D-IHcUvLVFTX_8NpQMXg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("destorm power")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUyMbSEhV3uamzZNBp16Ykpg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("david lopez")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUuanFncsQWzKrmyxB5CXs5A");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("TheBestVines")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUi_V-NWe_nqsj5AlT3SIN_g");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("AlotVines")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUJzXOglovnHQAdrJtqwnPZg");
                    startActivity(i);

                }

                if (newsData.getHeadline().equalsIgnoreCase("Vinessquad")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUe1vfuVZw2_caJdhDfr665g");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("best viners")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUGbooUxbbC-YmRXCNQ96Ycw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("covines")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UU4WNEEzWfK0fJJxxjQ4EYeg");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("life awesome")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUc2wpI97rT7TZGkhnylYgDA");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("danny gonzalez")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUSUf5_EPEfl4zlBKZHkZdmw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("darius benson")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUp207INWXuK1fmmnVdX0bfw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("eh bee family")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUtZAaljDNIsIAIhwYYzvEiw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("lenarr young")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "UUrA2bqOHwjX1DxgP9CaVJzw");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("meechonmars")) {
                    Intent i = new Intent(VinesComedy.this, Alxjames.class);
                    i.putExtra("mrbean", "PUvEc3Cuw9ItF13-JcGDTBjA");
                    startActivity(i);

                }


            }
        });
//        setSupportActionBar(toolbar);

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

        searchView.setSuggestions(getResources().getStringArray(R.array.vines_title));
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
                CustomListAdapter cus = new CustomListAdapter(VinesComedy.this, listData);
                cus.filter(newText);
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                searchView.setHint("Search Your Favorite Viners");
                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic
            }
        });


    }

    private ArrayList<ListItem> getListData() {
        ArrayList<ListItem> listMockData = new ArrayList<ListItem>();
        String[] images = getResources().getStringArray(R.array.vines_img);
        String[] headlines = getResources().getStringArray(R.array.vines_title);
        String[] descriptions = getResources().getStringArray(R.array.vines_desc);

        for (int i = 0; i < images.length; i++) {
            ListItem newsData = new ListItem();
            newsData.setUrl(images[i]);
            newsData.setHeadline(headlines[i]);
            newsData.setReporterName(descriptions[i]);
            listMockData.add(newsData);
        }
        return listMockData;
    }

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
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_funny) {
            // Handle the camera action
            Intent i = new Intent(VinesComedy.this, TwoThousandShows.class);
            startActivity(i);
        } else if (id == R.id.nav_cartoons) {
            Intent i = new Intent(VinesComedy.this, Main2Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_comedy) {
            Intent i = new Intent(VinesComedy.this, YoutubeArtists.class);
            startActivity(i);
        } else if (id == R.id.nav_channels) {
            Intent i = new Intent(VinesComedy.this, ComedyYoutube.class);
            startActivity(i);
        } else if (id == R.id.nav_viners) {
            Intent i = new Intent(VinesComedy.this, VinesComedy.class);
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
