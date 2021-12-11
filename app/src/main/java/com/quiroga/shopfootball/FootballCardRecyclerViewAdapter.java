package com.quiroga.shopfootball;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.quiroga.shopfootball.network.FootballEntry;
import com.quiroga.shopfootball.network.ImageRequester;

import java.util.List;

public class FootballCardRecyclerViewAdapter extends RecyclerView.Adapter<FootballCardViewHolder> {
    private List<FootballEntry> footballList;
    private ImageRequester imageRequester;
    private View layoutView;

    FootballCardRecyclerViewAdapter(List<FootballEntry> footballList){
        this.footballList = footballList;
        imageRequester = ImageRequester.getInstance();
    }

    @NonNull
    @Override
    public FootballCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View LayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.football_card, parent, false);
        return new FootballCardViewHolder(layoutView);
    }

    @Override
    public  void onBindViewHolder(@NonNull FootballCardViewHolder holder, int position) {
        if(footballList != null & position < footballList.size()) {
            FootballEntry football = footballList.get(position);
            holder.footballTitle.setText(football.title);
            holder.footballPrecio.setText(football.price);
            imageRequester.setImageFromUrl(holder.footballImage, football.url);
        }
    }
    @Override
    public  int getItemCount() {
        return footballList.size();
    }
}
