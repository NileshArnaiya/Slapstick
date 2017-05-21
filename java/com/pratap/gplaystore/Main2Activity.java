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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;

import crystal.labs.instavines.R;
import crystal.labs.instavines.activity.Alxjames;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
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
                Main2Activity.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
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
        listView.setAdapter(new CustomListAdapter(Main2Activity.this, listData));
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem newsData = (ListItem) listView.getItemAtPosition(position);
                // Toast.makeText(Main2Activity.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
                if (newsData.getHeadline().equalsIgnoreCase("tiny toon adventures")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "PLtU-G54rk0tnNqzR4k8EzwBuL9zU-kWDc");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("bobby's world")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "PLIgggo0m8qgPD2O5qQx7A7A6IOGx3ueh0");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("batman: the animated series")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "PLTfICmEzxkQRtUgp_76wPECs8AWm_tLc-");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("south park")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "PLQuogS02r7uxlNhvuhOSBID3dl-ETtoet");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("swat kats: the radical squadron")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("futurama")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("x-men")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("spider-man")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("courage the cowardly dog")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("family guy")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("superman")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("spongebob squarepants")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("king of the hill")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("rugrats")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("beavis and butt-head")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("hey arnold!")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the powerpuff girls")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("animaniacs")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("doug")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("dexter's laboratory")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("daria")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("ed, edd, 'n' eddy")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the ren & stimpy show")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("pinky and the brain")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("rocko's modern life")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("johnny bravo")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("rocket power")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("darkwing duck")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the angry beavers")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("talespin")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("Dr. Katz, Professional therapist")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("space ghost coast to coast")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the critic")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("crayon shin chan")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("pokemon")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("chip 'n' dale rescue rangers")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("Mr. bean")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("tom and jerry")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the pink panther show")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("garfield and friends")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the flintstones")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("teenage mutant ninja turtles")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("recess")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("cow and chicken")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the simpsons")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("samurai jack")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the fresh prince of bel-air")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("mr. dressup")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("dragon ball z")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("bill nye, the science guy")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the muppet show")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("wishbone")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("are you afraid of the dark?")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("mobile suit gundam wing")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("sesame street")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("naruto")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("ducktales")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("toad patrol")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("pee-wee's House")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("tales from the crypt")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the transformers")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the magic school bus")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the bugs bunny and tweety show")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("cardcaptor sakura")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("reboot")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("thundercats")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }           if (newsData.getHeadline().equalsIgnoreCase("the tick")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("wimzie's house")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("stickin' around")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("goosebumps")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("sing me a story with belle")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("sailor moon")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("street fighter ||: v")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("zoboomafoo")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the little lulu show")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the real ghostbusters")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("out of the box")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("freakazoid!")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the busy world of richard scarry")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the new adventures of winnie the pooh")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("adventures of gummi bears")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the adventures of dudley the dragon")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("smart guy")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("all that")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("art attack")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("gullah, gullah island")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("bob and margaret")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("pepper ann")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("pingu")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("beetlejuice")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("alf")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("where's waldo")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("taz-mania")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("the smurfs")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("clarissa explains it all")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("digimon: digital monsters")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("monster rancher")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("aladdin")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("popeye the sailor")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("alvin & the chipmunks")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("bob the builder")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "UUNJcSUSzUeFm8W9P7UUlSeQ");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("noddy")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "PLqTEO1gxHq0yU-J9nTyDvFwiBxuZ_ZGQe");
                    startActivity(i);

                }
                if (newsData.getHeadline().equalsIgnoreCase("oswald")) {
                    Intent i = new Intent(Main2Activity.this, Alxjames.class);
                    i.putExtra("mrbean", "PLGzMSs66Ve6xcnk16S_dsTWBadgEMD8R1");
                    startActivity(i);

                }
            }
        });
        searchView.setSuggestions(getResources().getStringArray(R.array.headline_array));
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
                CustomListAdapter cus = new CustomListAdapter(Main2Activity.this, listData);
                cus.filter(newText);
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                searchView.setHint("Search Your 90's cartoons");
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
//                CustomListAdapter cus = new CustomListAdapter(Main2Activity.this, listData);
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
        String[] images = getResources().getStringArray(R.array.images_array);
        String[] headlines = getResources().getStringArray(R.array.headline_array);
        String[] descriptions = getResources().getStringArray(R.array.descript_array);

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
            Intent i = new Intent(Main2Activity.this, TwoThousandShows.class);
            startActivity(i);
        } else if (id == R.id.nav_cartoons) {
            Intent i = new Intent(Main2Activity.this, Main2Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_comedy) {
            Intent i = new Intent(Main2Activity.this, YoutubeArtists.class);
            startActivity(i);
        } else if (id == R.id.nav_channels) {
            Intent i = new Intent(Main2Activity.this, ComedyYoutube.class);
            startActivity(i);
        } else if (id == R.id.nav_viners) {
            Intent i = new Intent(Main2Activity.this, VinesComedy.class);
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
