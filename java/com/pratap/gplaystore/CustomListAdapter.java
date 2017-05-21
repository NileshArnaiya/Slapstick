package com.pratap.gplaystore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import crystal.labs.instavines.R;

public class CustomListAdapter extends BaseAdapter {
    private List<ListItem> listData = null;
    private LayoutInflater layoutInflater;
    private ArrayList<ListItem> arraylist;


    public CustomListAdapter(Context context, List<ListItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
        this.arraylist = new ArrayList<ListItem>();
        this.arraylist.addAll(listData);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_row_layout, null);
            holder = new ViewHolder();
            holder.headlineView = (TextView) convertView.findViewById(R.id.title);
            holder.reporterNameView = (TextView) convertView.findViewById(R.id.reporter);
//            holder.reportedDateView = (TextView) convertView.findViewById(R.id.date);
            holder.imageView = (ImageView) convertView.findViewById(R.id.thumbImage);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ListItem newsItem = listData.get(position);
        holder.headlineView.setText(newsItem.getHeadline());
        holder.reporterNameView.setText("" + newsItem.getReporterName());
//        holder.reportedDateView.setText(newsItem.getDate());

        if (holder.imageView != null) {
            new ImageDownloaderTask(holder.imageView).execute(newsItem.getUrl());
        }

        return convertView;
    }


    static class ViewHolder {
        TextView headlineView;
        TextView reporterNameView;
        //        TextView reportedDateView;
        ImageView imageView;
    }

    public void filter(String charText) {
        listData.clear();
        if (charText.length() == 0) {
            listData.addAll(arraylist);
        } else {
            for (ListItem wp : arraylist) {
                if (wp.getHeadline().toLowerCase()
                        .contains(charText.trim().toLowerCase())) {
                    listData.add(wp);

                }

            }

        }
        notifyDataSetChanged();
    }


}
