package com.example.medicalappdemo.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.medicalappdemo.activity.DetailActivity;
import com.example.medicalappdemo.activity.DoctorListActivity;
import com.example.medicalappdemo.R;
import com.example.medicalappdemo.models.DoctorDataModel;

import java.security.AccessController;
import java.util.ArrayList;


public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private ArrayList<DoctorDataModel> listdata;
    private DoctorListActivity doctorListActivity;
    // RecyclerView recyclerView;
    public MyListAdapter(ArrayList<DoctorDataModel> listdata, DoctorListActivity doctorListActivity) {
        this.listdata = listdata;
        this.doctorListActivity = doctorListActivity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        DoctorDataModel mdata = listdata.get(Position);
        holder.textView.setText(listdata.get(Position).getName());
        holder.textViewSub.setText(listdata.get(Position).getSubTitle());
        holder.imageView.setImageResource(listdata.get(Position).getImagePath());
        holder.textViewNumb.setText(String.valueOf(listdata.get(Position).getRate()));
        holder.ratingBar.setRating(listdata.get(Position).getRate());
        //holder.textViewSub.setText(listdata.get(Position).getSubTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(doctorListActivity, DetailActivity.class);


                        i.putExtra("name",mdata.getName());
                        i.putExtra("subTitle",mdata.getSubTitle());
                        i.putExtra("rate",mdata.getRate());
                doctorListActivity.startActivity(i);
                    }
                });
            }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView textViewSub;
        public ImageView imageView;
        public TextView textViewNumb;
        public RatingBar ratingBar;
        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.TextViewList);
            this.textViewSub = (TextView) itemView.findViewById(R.id.TextViewSub);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageList);
            this.textViewNumb = (TextView) itemView.findViewById(R.id.textViewNumber);
            this.ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);


        }
    }
}