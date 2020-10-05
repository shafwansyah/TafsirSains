package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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

        Paper.init(this);

        String language = Paper.book().read("language");
        if (language == null)
            Paper.book().write("language", "in");

        updateView((String) Paper.book().read("language"));

        sw_gantibahasa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sw_gantibahasa.isChecked()){
                    Paper.book().write("language", "in");
                    updateView((String) Paper.book().read("language"));
                    sw_gantibahasa.setText("English");
                } else {
                    Paper.book().write("language", "en");
                    updateView((String) Paper.book().read("language"));
                    sw_gantibahasa.setText("Indonesia");
                }
            }
        });

//        models.addAll(IsiBacaan_en.getListData());

        string_adapter = new SAdapter((ArrayList<SModel>) string_models, this);
        viewPager = findViewById(R.id.viewpager_Home);
        viewPager.setAdapter(string_adapter);

    }

    private void updateView(String language) {
        Context context = LocaleHelper.setLocale(this,language);
        Resources resources = context.getResources();

        string_models = new ArrayList<>();
        string_models.add(new SModel(R.drawable.intro,resources.getString(R.string.intro),resources.getString(R.string.intro_detail)));
        string_models.add(new SModel(R.drawable.asstro,resources.getString(R.string.astro),resources.getString(R.string.astro_detail)));

        Log.d("bahasa", "onCreate: "+language);
    }
}