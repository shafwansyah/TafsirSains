package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReadActivity extends AppCompatActivity {

    private Integer position;
    String title, bacaan;
    FloatingActionButton btnYutub;
    TextView tafsir_bacaan, tafsir_title;
    ImageView tafsir_logo;
    ArrayList<SModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        getSupportActionBar().hide();

        tafsir_bacaan = findViewById(R.id.text_reading);
        tafsir_title = findViewById(R.id.title_reading);
        btnYutub = findViewById(R.id.fabYutub);

        Intent intent = getIntent();
        modelList = (ArrayList<SModel>) intent.getSerializableExtra("tafsir_list");
        position = intent.getIntExtra("position", 0);
        
        tafsir_title.setText(modelList.get(position).getTitle());
        tafsir_bacaan.setText(modelList.get(position).getDesc());

        btnYutub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yutubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse((modelList.get(position).getYutub())));
                yutubIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                yutubIntent.setPackage("com.google.android.youtube");
                startActivity(yutubIntent);
            }
        });



    }

}