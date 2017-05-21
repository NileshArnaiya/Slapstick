package com.pratap.gplaystore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import crystal.labs.instavines.R;

/**
 * Created by NgocTri on 10/22/2016.
 */

public class ListViewAdapter extends ArrayAdapter<Product> {

    ArrayList<Product> products;

    ListViewAdapter(Context context, int resource, List<Product> objects) {
        super(context, resource, objects);
        products = (ArrayList<Product>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (null == convertView) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.detailed_list_item, parent, false);
        }
        Product product = products.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
        TextView txtDescription = (TextView) convertView.findViewById(R.id.txtDescription);

        Glide.with(parent.getContext()).load(product.getImageId()).placeholder(R.drawable.color_drawable).into(img);
        txtDescription.setText(product.getDescription());
        return convertView;
    }


}
