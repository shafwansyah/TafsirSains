package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
//    Adapter adapter;
    private Switch sw_gantibahasa;
    SAdapter string_adapter;
    private List<SModel> string_models;
//    private ArrayList<model> models = new ArrayList<>();

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase, "en"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();
        sw_gantibahasa = findViewById(R.id.switch_bahasa);

//        models.addAll(IsiBacaan_en.getListData());
        string_models = new ArrayList<>();
        string_models.add(new SModel(R.drawable.intro,getResources().getString(R.string.intro),getResources().getString(R.string.intro_detail)));
        string_models.add(new SModel(R.drawable.asstro,getResources().getString(R.string.astro), getResources().getString(R.string.astro_detail)));

        string_adapter = new SAdapter(string_models, this);
        viewPager = findViewById(R.id.viewpager_Home);
        viewPager.setAdapter(string_adapter);

//        Paper.init(this);
//
//        String language = Paper.book().read("language");
//        if (language == null)
//            Paper.book().write("language", "en");
//
//        updateView((String) Paper.book().read("language"));
//
//        sw_gantibahasa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (sw_gantibahasa.isChecked()){
//                    Paper.book().write("language", "in");
//                    updateView((String) Paper.book().read("language"));
//                } else {
//                    Paper.book().write("language", "en");
//                    updateView((String) Paper.book().read("language"));
//                }
//            }
//        });

    }

//    private void updateView(String language) {
//        Context context = LocaleHelper.setLocale(this,language);
//        Resources resources = context.getResources();
//
//        string_models = new ArrayList<>();
//        string_models.add(new SModel(R.drawable.intro,R.string.intro,R.string.intro_detail));
//        string_models.add(new SModel(R.drawable.asstro,R.string.astro,R.string.astro_detail));
//
//        string_adapter = new SAdapter(string_models, this);
//        viewPager = findViewById(R.id.viewpager_Home);
//        viewPager.setAdapter(string_adapter);
//    }
}