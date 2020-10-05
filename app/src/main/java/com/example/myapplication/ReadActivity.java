package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReadActivity extends AppCompatActivity {

    private Integer position;
    String title, bacaan;
    TextView tafsir_bacaan, tafsir_title;
    ImageView tafsir_logo;
    ArrayList<model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        getSupportActionBar().hide();

        tafsir_bacaan = findViewById(R.id.text_reading);
        tafsir_title = findViewById(R.id.title_reading);
        tafsir_logo = findViewById(R.id.img_reading);



//        Intent intent = getIntent();
//        modelList = (ArrayList<model>) intent.getSerializableExtra("tafsir_list");
//        position = intent.getIntExtra("position", 0);
//
//        tafsir_logo.setImageResource(modelList.get(position).getImg_icon());
//        tafsir_title.setText(modelList.get(position).getTitle());
//        tafsir_bacaan.setText(modelList.get(position).getBacaan());


    }

}