package com.example.medicalappdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.medicalappdemo.R;
import com.example.medicalappdemo.adapter.MyListAdapter;
import com.example.medicalappdemo.models.DoctorDataModel;

import java.util.ArrayList;

public class DoctorListActivity extends AppCompatActivity {
    ArrayList<DoctorDataModel> arrayLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_doctor_list);

        ImageView imageViewback = findViewById(R.id.imageBack);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorListActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        addData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewList);
        MyListAdapter adapter = new MyListAdapter(arrayLists, DoctorListActivity.this);
        recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(adapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void addData() {

        DoctorDataModel doctorDataModel1 =new DoctorDataModel();
        doctorDataModel1.setId(1);
        doctorDataModel1.setName("Dr.Ahmod Miya");
        doctorDataModel1.setSubTitle("General Specialist");
        doctorDataModel1.setImagePath(R.drawable.doctora);
        doctorDataModel1.setRate(5f);
        arrayLists.add(doctorDataModel1);

        DoctorDataModel doctorDataModel2 =new DoctorDataModel();
        doctorDataModel2.setId(2);
        doctorDataModel2.setName("Dr.Shelim Ahmed");
        doctorDataModel2.setSubTitle("General Orthodontist");
        doctorDataModel2.setImagePath(R.drawable.doctorb);
        doctorDataModel2.setRate(4.5f);
        arrayLists.add(doctorDataModel2);

        DoctorDataModel doctorDataModel3 =new DoctorDataModel();
        doctorDataModel3.setId(3);
        doctorDataModel3.setName("Dr.Masum Parvej");
        doctorDataModel3.setSubTitle("General Pulmonologist");
        doctorDataModel3.setImagePath(R.drawable.doctorc);
        doctorDataModel3.setRate(5.0f);
        arrayLists.add(doctorDataModel3);

        DoctorDataModel doctorDataModel4 =new DoctorDataModel();
        doctorDataModel4.setId(4);
        doctorDataModel4.setName("Dr.Ripon Ahmed");
        doctorDataModel4.setSubTitle("General Specialist");
        doctorDataModel4.setImagePath(R.drawable.doctord);
        doctorDataModel4.setRate(3.5f);
        arrayLists.add(doctorDataModel4);

        DoctorDataModel doctorDataModel5 =new DoctorDataModel();
        doctorDataModel5.setId(5);
        doctorDataModel5.setName("Dr.Jamal Ahmed");
        doctorDataModel5.setSubTitle("General Orthodontist");
        doctorDataModel5.setImagePath(R.drawable.doctore);
        doctorDataModel5.setRate(4.5f);
        arrayLists.add(doctorDataModel5);

        DoctorDataModel doctorDataModel6 =new DoctorDataModel();
        doctorDataModel6.setId(6);
        doctorDataModel6.setName("Dr.Tamjid Ahmed");
        doctorDataModel6.setSubTitle("General Pulmonologist");
        doctorDataModel6.setImagePath(R.drawable.doctorf);
        doctorDataModel6.setRate(3.0f);
        arrayLists.add(doctorDataModel6);
    }
}