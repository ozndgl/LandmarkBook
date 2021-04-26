package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView LandmarkNameText = findViewById(R.id.LandmarkNameText);
        TextView countryNameText = findViewById(R.id.contryNameText);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("name");
        LandmarkNameText.setText(landmarkName);

        String landmarkcountry = intent.getStringExtra("countryname");
        countryNameText.setText(landmarkcountry);

        Singleton singleton= Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
        

    }
}