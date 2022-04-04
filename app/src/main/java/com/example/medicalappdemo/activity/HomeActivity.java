package com.example.medicalappdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.medicalappdemo.R;
import com.example.medicalappdemo.adapter.MyGridAdapter;
import com.example.medicalappdemo.models.HomeDataModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<HomeDataModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        addData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyGridAdapter adapter = new MyGridAdapter(arrayList, HomeActivity.this);
        recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


    private void addData() {

        HomeDataModel homeDataModel1 =new HomeDataModel();
        homeDataModel1.setId(1);
        homeDataModel1.setSubTitle("Cardiology");
        homeDataModel1.setImagePath(R.drawable.ekg);
        homeDataModel1.setColor("#F1EFF9");
        arrayList.add(homeDataModel1);

        HomeDataModel homeDataModel2 =new HomeDataModel();
        homeDataModel2.setId(2);
        homeDataModel2.setSubTitle("Tooth");
        homeDataModel2.setImagePath(R.drawable.tooth);
        homeDataModel2.setColor("#FFF9F0");
        arrayList.add(homeDataModel2);

        HomeDataModel homeDataModel3 =new HomeDataModel();
        homeDataModel3.setId(3);
        homeDataModel3.setSubTitle("Brain");
        homeDataModel3.setColor("#EEF4FE");
        homeDataModel3.setImagePath(R.drawable.brain);
        arrayList.add(homeDataModel3);



        HomeDataModel homeDataModel4 =new HomeDataModel();
        homeDataModel4.setId(4);
        homeDataModel4.setSubTitle("Eye");
        homeDataModel4.setColor("#EEFCFF");
        homeDataModel4.setImagePath(R.drawable.visibility);
        arrayList.add(homeDataModel4);


        HomeDataModel homeDataModel5 =new HomeDataModel();
        homeDataModel5.setId(5);
        homeDataModel5.setSubTitle("Bellows");
        homeDataModel5.setColor("#FFF1F1");
        homeDataModel5.setImagePath(R.drawable.lungs);
        arrayList.add(homeDataModel5);


        HomeDataModel homeDataModel6 =new HomeDataModel();
        homeDataModel6.setId(6);
        homeDataModel6.setSubTitle("Ear");
        homeDataModel6.setColor("#FFFCDF");
        homeDataModel6.setImagePath(R.drawable.ear);
        arrayList.add(homeDataModel6);


        HomeDataModel homeDataModel7 =new HomeDataModel();
        homeDataModel7.setId(7);
        homeDataModel7.setSubTitle("Nose");
        homeDataModel7.setColor("#FFEEE9");
        homeDataModel7.setImagePath(R.drawable.nose);
        arrayList.add(homeDataModel7);

        HomeDataModel homeDataModel8 =new HomeDataModel();
        homeDataModel8.setId(8);
        homeDataModel8.setSubTitle("Hand");
        homeDataModel8.setColor("#FFFCDF");
        homeDataModel8.setImagePath(R.drawable.hello);
        arrayList.add(homeDataModel8);


        HomeDataModel homeDataModel9 =new HomeDataModel();
        homeDataModel9.setId(9);
        homeDataModel9.setSubTitle("Heart");
        homeDataModel9.setColor("#E3FFF6");
        homeDataModel9.setImagePath(R.drawable.heart);
        arrayList.add(homeDataModel9);


        HomeDataModel homeDataModel10 =new HomeDataModel();
        homeDataModel10.setId(10);
        homeDataModel10.setSubTitle("Leg");
        homeDataModel10.setColor("#FFF3E9");
        homeDataModel10.setImagePath(R.drawable.leg);
        arrayList.add(homeDataModel10);


        HomeDataModel homeDataModel11 =new HomeDataModel();
        homeDataModel11.setId(11);
        homeDataModel11.setSubTitle("Back pain");
        homeDataModel11.setColor("#EEFCFF");
        homeDataModel11.setImagePath(R.drawable.back);
        arrayList.add(homeDataModel11);


        HomeDataModel homeDataModel12 =new HomeDataModel();
        homeDataModel12.setId(12);
        homeDataModel12.setSubTitle("elbows pain");
        homeDataModel12.setColor("#FFEAEF");
        homeDataModel12.setImagePath(R.drawable.cover);
        arrayList.add(homeDataModel12);


    }
}