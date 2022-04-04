package com.example.medicalappdemo.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicalappdemo.activity.DoctorListActivity;
import com.example.medicalappdemo.activity.HomeActivity;
import com.example.medicalappdemo.R;
import com.example.medicalappdemo.models.HomeDataModel;

import java.util.ArrayList;


public class MyGridAdapter extends RecyclerView.Adapter<MyGridAdapter.ViewHolder> {
    private final ArrayList<HomeDataModel> listdata;
    private final HomeActivity homeActivity;

    // RecyclerView recyclerView;
    public MyGridAdapter(ArrayList<HomeDataModel> listdata, HomeActivity homeActivity) {
        this.listdata = listdata;
        this.homeActivity = homeActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.grid_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.textView.setText(listdata.get(Position).getSubTitle());
        holder.imageView.setImageResource(listdata.get(Position).getImagePath());
        holder.card_view.setCardBackgroundColor((Color.parseColor(listdata.get(Position).getColor())));
        //holder.textViewSub.setText(listdata.get(Position).getSubTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(homeActivity, DoctorListActivity.class);
                homeActivity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;
        public CardView card_view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.TextView);
            this.imageView = itemView.findViewById(R.id.image);
            this.card_view = itemView.findViewById(R.id.card_view);
        }
    }
}