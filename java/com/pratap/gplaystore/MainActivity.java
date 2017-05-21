package com.pratap.gplaystore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pratap.gplaystore.adapters.RecyclerViewDataAdapter;
import com.pratap.gplaystore.models.SectionDataModel;
import com.pratap.gplaystore.models.SingleItemModel;

import java.util.ArrayList;

import crystal.labs.instavines.R;

public class MainActivity extends AppCompatActivity {

//    private Toolbar toolbar;


    ArrayList<SectionDataModel> allSampleData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        toolbar = (Toolbar) findViewById(R.id.toolbar);

        allSampleData = new ArrayList<SectionDataModel>();

//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//            toolbar.setTitle("Insta Vines");
//
//        }


        createDummyData();


        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);

        my_recycler_view.setHasFixedSize(true);

        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(this, allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);


    }

    public void createDummyData() {
        for (int i = 0; i <= 4; i++) {
            String[] vineArtists = {"Funny Cartoons", "90's Cartoons", "Popular Channels", "Youtube Comedy", "Vine artists"};
            String[] brother = {"Mr.Bean", "Shinchan", "BB ki Vines", "Impractical Jokers", "Zach King"};
            String[] brother2 = {"Laurel and Hardy", "Doraemon", "AIB", "The Viral Fever", "Cameron Dallas"};
            String[] brother3 = {"Scooby Doo", "Courage the cowardly dog", "Kenny Sebastian ", "EIC", "King Bach"};
            String[] brother4 = {"Looney Tunes", "Tom and Jerry", "CarryMinati", "Sng Comedy", "Rudy Mancuso"};

            SectionDataModel dm = new SectionDataModel();
            dm.setHeaderTitle(vineArtists[i]);


            ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
//            for (int j = 0; j <= 4; j++) {
            String[] urls = {"https://i.ytimg.com/vi/2biELn3uGAo/maxresdefault.jpg","https://i.ytimg.com/vi/UbAZVebhxdk/hqdefault.jpg","http://image3.mouthshut.com/images/imagesp/925839995s.jpg","https://i.ytimg.com/vi/3LWfTg1IFyU/hqdefault.jpg?custom=true&w=246&h=138&stc=true&jpg444=true&jpgq=90&sp=68&sigh=AtTBtisyTIBkJcbkHvxmVEiaRd8","http://www.zachkingvine.com/wp-content/uploads/2014/01/zach-king-vine.png"};
            String[] urls2 = {"https://i.ytimg.com/vi/_iPw5yf78Uc/maxresdefault.jpg","http://www.worldblaze.in/wp-content/uploads/2015/03/Doraemon.jpg","http://ste.india.com/sites/default/files/2015/03/19/336886-aib.jpg","https://yt3.ggpht.com/-YXJx9IxofWg/AAAAAAAAAAI/AAAAAAAAAAA/X2iQbpe_z0U/s176-c-k-no-mo-rj-c0xffffff/photo.jpg","https://i.ytimg.com/vi/kE8nXeecXwg/maxresdefault.jpg"};
            String[] urls3 = {"https://s-media-cache-ak0.pinimg.com/originals/a5/e7/96/a5e7968af34e9e254c79ef4b8112de60.jpg","http://www.cartoonson.com/_resources/Cartoons/show/7/image/555x418/courage-the-cowardly-dog-show.jpg","https://yt3.ggpht.com/-sh_ncbmoSyo/AAAAAAAAAAI/AAAAAAAAAAA/1XAis4KrJ9c/s176-c-k-no-mo-rj-c0xffffff/photo.jpg","https://yt3.ggpht.com/-ck2LMbPX_fE/AAAAAAAAAAI/AAAAAAAAAAA/Au_D5F4yLcU/s900-c-k-no-mo-rj-c0xffffff/photo.jpg","http://www.tubefilter.com/wp-content/uploads/2016/06/king-bach-superman.jpg"};
            String[] urls4 = {"http://www.toonbarn.com/wordpress/wp-content/uploads/2011/11/looney.jpg","https://zellox.com/wp-content/uploads/2016/02/tom-and-jerry-cartoon.jpg","https://yt3.ggpht.com/-MczKppo_8TQ/AAAAAAAAAAI/AAAAAAAAAAA/MLb_qfmgpsE/s900-c-k-no-mo-rj-c0xffffff/photo.jpg","https://pbs.twimg.com/media/CLPExW8WIAAkhd5.jpg","http://payload187.cargocollective.com/1/10/345832/6054840/Screen-Shot-2014-08-07-at-4.02.15-PM.png"};

            singleItem.add(0, new SingleItemModel(brother[i], urls[i]));
            singleItem.add(1, new SingleItemModel(brother2[i],urls2[i]));
            singleItem.add(2, new SingleItemModel(brother3[i], urls3[i]));
            singleItem.add(3, new SingleItemModel(brother4[i], urls4[i]));


//            singleItem.add(1,new SingleItemModel("yay","ur;"));
//            singleItem.add(2,new SingleItemModel("wow","ur;"));

//            for (int j = 0; j <= 4; j++) {
//                singleItem.add(new SingleItemModel(brother[j], "URL " + j));
//            }

            dm.setAllItemsInSection(singleItem);
            allSampleData.add(dm);
        }
    }
}
