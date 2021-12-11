package com.quiroga.shopfootball;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;

public class FootballCardViewHolder extends RecyclerView.ViewHolder{
    public NetworkImageView footballImage;
    public TextView footballTitle;
    public TextView footballPrecio;

    public FootballCardViewHolder(@NonNull View itemView){
        super(itemView);
        footballImage = itemView.findViewById(R.id.football_image);
        footballTitle = itemView.findViewById(R.id.football_title);
        footballPrecio = itemView.findViewById(R.id.football_price);
    }
}
