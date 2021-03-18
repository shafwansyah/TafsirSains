package com.example.myapplication;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReadActivity extends AppCompatActivity {

    private Integer position;
    TextView tafsir_bacaan, tafsir_title;
    ModelMateri modelList;
    CardView cardView;
    public static Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        tafsir_bacaan = findViewById(R.id.text_reading);
        tafsir_title = findViewById(R.id.title_reading);
        cardView = findViewById(R.id.cardview_reading);

        Intent intent = getIntent();
        position = intent.getIntExtra("POSITION", 0);
        modelList = (ModelMateri) intent.getSerializableExtra("MODELMATERI");

        tafsir_title.setText(modelList.getJudul());
        tafsir_bacaan.setText(modelList.getIsi());

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(ReadActivity.this);
            }
        });

    }

    public void showPopup(Activity activity){

        TextView txtclose;

        myDialog = new Dialog(activity);
        myDialog.setCancelable(false);
        myDialog.setContentView(R.layout.popup_image);

        List<ModelMateri> list = new ArrayList<>();
        list.add(modelList);
        RecyclerView recyclerView = myDialog.findViewById(R.id.rv_popup);
        AdapterPopup adapterPopup = new AdapterPopup(ReadActivity.this, list);

        txtclose = myDialog.findViewById(R.id.tv_closePopup);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
//        list.addAll(ModelMateri.getListData());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapterPopup);

        myDialog.show();
    }

}