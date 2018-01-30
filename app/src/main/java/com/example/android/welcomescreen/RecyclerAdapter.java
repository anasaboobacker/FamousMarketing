package com.example.android.welcomescreen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Anas on 29-01-2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private String[] categories = {"category 1" , "category 2" , "category 3", "category 4", "catergory 5"} ;

    private int[] images = {R.drawable.famouspen , R.drawable.famouspen , R.drawable.famouspen ,R.drawable.famouspen ,
            R.drawable.famouspen} ;



    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem ;
        public ImageView itemImage ;
        public TextView itemText ;

        public ViewHolder(View itemView){
            super(itemView) ;
            itemImage = (ImageView) itemView.findViewById(R.id.category_image);
            itemText = (TextView) itemView.findViewById(R.id.category_name) ;



        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup , int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_category, viewGroup , false) ;
        ViewHolder viewHolder = new ViewHolder(v) ;
        return viewHolder ;

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder , int i){
        viewHolder.itemText.setText(categories[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {return categories.length ;}
}
