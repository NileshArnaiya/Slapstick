package com.pratap.gplaystore.adapters;

/**
 * Created by pratap.kesaboyina on 24-12-2014.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pratap.gplaystore.ComedyYoutube;
import com.pratap.gplaystore.Main2Activity;
import com.pratap.gplaystore.TwoThousandShows;
import com.pratap.gplaystore.VinesComedy;
import com.pratap.gplaystore.YoutubeArtists;
import com.pratap.gplaystore.models.SectionDataModel;

import java.util.ArrayList;

import crystal.labs.instavines.R;

public class RecyclerViewDataAdapter extends RecyclerView.Adapter<RecyclerViewDataAdapter.ItemRowHolder> {

    private ArrayList<SectionDataModel> dataList;
    private Context mContext;

    public RecyclerViewDataAdapter(Context context, ArrayList<SectionDataModel> dataList) {
        this.dataList = dataList;
        this.mContext = context;
    }

    @Override
    public ItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ItemRowHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(ItemRowHolder itemRowHolder, int position) {
        final String sectionName = dataList.get(position).getHeaderTitle();
        itemRowHolder.itemTitle.setText(sectionName);
        itemRowHolder.recycler_view_list.setHasFixedSize(true);
        itemRowHolder.recycler_view_list.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        itemRowHolder.recycler_view_list.setAdapter(new SectionListDataAdapter(mContext, dataList.get(position).getAllItemsInSection()));
        itemRowHolder.recycler_view_list.setNestedScrollingEnabled(false);

       /*  itemRowHolder.recycler_view_list.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                    case MotionEvent.ACTION_UP:
                        //Allow ScrollView to intercept touch events once again.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }
                // Handle RecyclerView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });*/

        itemRowHolder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), " " + sectionName, Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(mContext, Main2Activity.class);
//                mContext.startActivity(i);
                if (sectionName.equalsIgnoreCase("Popular Channels")){
                    Intent i2 = new Intent(mContext, YoutubeArtists.class);
                    mContext.startActivity(i2);
                }
                if (sectionName.equalsIgnoreCase("90's Cartoons")){
                    Intent i2 = new Intent(mContext, Main2Activity.class);
                    mContext.startActivity(i2);
                }
                if (sectionName.equalsIgnoreCase("Funny Cartoons")){
                    Intent i2 = new Intent(mContext, TwoThousandShows.class);
                    mContext.startActivity(i2);
                }
                if (sectionName.equalsIgnoreCase("Youtube Comedy")){
                    Intent i2 = new Intent(mContext, ComedyYoutube.class);
                    mContext.startActivity(i2);
                }
                if (sectionName.equalsIgnoreCase("Vine Artists")){
                    Intent i2 = new Intent(mContext, VinesComedy.class);
                    mContext.startActivity(i2);
                }



            }
        });

    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    class ItemRowHolder extends RecyclerView.ViewHolder {

        TextView itemTitle;
        RecyclerView recycler_view_list;
        Button btnMore;

        ItemRowHolder(View view) {
            super(view);
            this.itemTitle = (TextView) view.findViewById(R.id.itemTitle);
            this.recycler_view_list = (RecyclerView) view.findViewById(R.id.recycler_view_list);
            this.btnMore = (Button) view.findViewById(R.id.btnMore);

            if (itemTitle.equals("Mr.Bean")){
                Log.d("good","one");
            }

        }

    }

}