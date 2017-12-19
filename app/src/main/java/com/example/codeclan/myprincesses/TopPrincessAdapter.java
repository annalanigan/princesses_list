package com.example.codeclan.myprincesses;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by annalanigan on 19/12/2017.
 */

class TopPrincessAdapter extends ArrayAdapter<Princess>{


    public TopPrincessAdapter(Context context, ArrayList<Princess> list) {
        super(context, 0,list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.princess_item, parent, false);
        }

        Princess currentPrincess = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.rank);
        ranking.setText(currentPrincess.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.princess);
        name.setText(currentPrincess.getName());

        TextView movie = (TextView) listItemView.findViewById(R.id.movie);
        movie.setText(currentPrincess.getMovie());

        ImageView image = (ImageView) listItemView.findViewById(R.id.princess_image);
        Drawable drawable  = Drawable.createFromPath(currentPrincess.getImage());
        image.setImageDrawable(drawable);

        listItemView.setTag(currentPrincess);

        return listItemView;

    }
}
