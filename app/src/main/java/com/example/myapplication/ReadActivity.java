package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.home.model;

import java.util.ArrayList;

public class ReadActivity extends AppCompatActivity {

    private String bacaan;
    TextView tafsir_bacaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        tafsir_bacaan = findViewById(R.id.text_reading);
        bacaan = getIntent().getStringExtra("bacaan");
        tafsir_bacaan.setText(bacaan);

        getSupportActionBar().hide();
    }

}