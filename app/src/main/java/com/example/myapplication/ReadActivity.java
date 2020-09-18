package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.home.model;

import java.util.ArrayList;

public class ReadActivity extends AppCompatActivity {

    private Integer position;
    private ArrayList<model> modelArrayList;
    private String bacaan;
    TextView tafsir_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        position = getIntent().getIntExtra("position", 0);
        tafsir_detail = findViewById(R.id.text_reading);
        tafsir_detail.setText(modelArrayList.get(position).getBacaan());

        getSupportActionBar().hide();
    }

}