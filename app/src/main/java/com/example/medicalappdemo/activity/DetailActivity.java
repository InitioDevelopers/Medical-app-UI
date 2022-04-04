package com.example.medicalappdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.medicalappdemo.R;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        try {
            TextView textViewDoctorName=findViewById(R.id.textviewDoctorName);
            TextView textViewSub=findViewById(R.id.textviewSubTitle);
            TextView textViewNumb=findViewById(R.id.textViewNumber);
            RatingBar ratingBar=findViewById(R.id.ratingBar);
            String name=getIntent().getExtras().getString("name");
            String subTitle=getIntent().getExtras().getString("subTitle");
            float rate=getIntent().getExtras().getFloat("rate");
            textViewDoctorName.setText(name);
            textViewSub.setText(subTitle);
            ratingBar.setRating(rate);
            textViewNumb.setText(String.valueOf(rate));
        }catch (Exception e){
            e.printStackTrace();
        }
        ImageView imageViewBack = findViewById(R.id.buttonBack);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, DoctorListActivity.class);
                startActivity(intent);
            }
        });
    }

}