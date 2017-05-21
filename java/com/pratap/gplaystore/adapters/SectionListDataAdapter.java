package com.pratap.gplaystore.adapters;

/**
 * Created by pratap.kesaboyina on 24-12-2014.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pratap.gplaystore.models.SingleItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import crystal.labs.instavines.R;
import crystal.labs.instavines.activity.Alxjames;


public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;
    private Context mContext;

    public SectionListDataAdapter(Context context, ArrayList<SingleItemModel> itemsList) {
        this.itemsList = itemsList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        return new SingleItemRowHolder(LayoutInflater.from(mContext).inflate(R.layout.list_single_card, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int i) {
        SingleItemModel singleItem = itemsList.get(i);
        holder.tvTitle.setText(singleItem.getName());
        Picasso.with(mContext).load(singleItem.getUrl()).placeholder(R.drawable.color_drawable).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    class SingleItemRowHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView itemImage;

        SingleItemRowHolder(View view) {
            super(view);
            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(v.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();
                    if (tvTitle.getText().toString().equalsIgnoreCase("Mr.Bean")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PL4DD5A409693EA67E");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Laurel and hardy")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLEU9iel12F0_Yc6WG3aQbGzyeI7lO4inm");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Scooby Doo")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLHo-IIm0ajO2Tw2W-32OR8fqmgmi9xoc3");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Looney Tunes")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLTfICmEzxkQQzr6mCL2KuBMe_ZvOlRY5O");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Shinchan")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLcMYioSNb8OBYS6ikybluhLweVKWyc3is");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Doraemon")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLcMYioSNb8OBYS6ikybluhLweVKWyc3is");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Courage the cowardly dog")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PL9-H6wVhzTNFRqSg3g6PL7pZQjjWzt5sa");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("tom and jerry")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLDm2Q2wd5YakvyufX8KH6ZPFb1is9dhTR");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("bb ki vines")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PUqwUrj10mAEsqezcItqvwEw");
                        mContext.startActivity(i);
                    }

                    if (tvTitle.getText().toString().equalsIgnoreCase("aib")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUzUYuC_9XdUUdrnyLii8WYg");
                        mContext.startActivity(i);
                    }

                    if (tvTitle.getText().toString().equalsIgnoreCase("kenny sebastian")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUj22tfcQrWG7EMEKS0qLeEg");
                        mContext.startActivity(i);
                    }

                    if (tvTitle.getText().toString().equalsIgnoreCase("carryminati")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUj22tfcQrWG7EMEKS0qLeEg");
                        mContext.startActivity(i);
                    }

                    if (tvTitle.getText().toString().equalsIgnoreCase("impractical jokers")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","PLZxWJ6CTr63bL1Vc2qB6zyG_Gad4hpB9K");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("the viral fever")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUNJcSUSzUeFm8W9P7UUlSeQ");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("eic")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUpU9EZn1Ll9kPpSuBsn4VyA");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("sng comedy")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UU6xOVUMstTf08rUgOFbyPEA");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Zach King")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUq8DICunczvLuJJq414110A");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("Cameron Dallas")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUUKxWDTKylMaLjbNe3pOpCg");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("king bach")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UUIvGs1yGop7dDESN8r3f8Rg");
                        mContext.startActivity(i);
                    }
                    if (tvTitle.getText().toString().equalsIgnoreCase("rudy mancuso")){
                        Intent i = new Intent(mContext.getApplicationContext(), Alxjames.class);
                        i.putExtra("mrbean","UU5jkXpfnBhlDjqh0ir5FsIQ");
                        mContext.startActivity(i);
                    }
                }
            });

            itemImage = (ImageView) view.findViewById(R.id.itemImage);
        }

    }

}