package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
    FloatingActionButton fab;
    SAdapter string_adapter;
    private List<SModel> string_models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
            }
        });

        getSupportActionBar().hide();

        string_models = new ArrayList<>();
        string_models.add(new SModel(R.drawable.intro,getResources().getString(R.string.intro),getResources().getString(R.string.intro_detail), "https://www.youtube.com/watch?v=InBmtq2Zyzs"));
        string_models.add(new SModel(R.drawable.asstro,getResources().getString(R.string.astro),getResources().getString(R.string.astro_detail), "https://www.youtube.com/watch?v=7bmmfDhsrVM"));
        string_models.add(new SModel(R.drawable.fisika,getResources().getString(R.string.fisika),getResources().getString(R.string.fisika_detail),"https://www.youtube.com/watch?v=ojeZhOFcHGU"));
        string_models.add(new SModel(R.drawable.hidrologi,getResources().getString(R.string.hidro),getResources().getString(R.string.hidro_detail),"https://www.youtube.com/watch?v=f9TGnvzYHNA"));
        string_models.add(new SModel(R.drawable.earth,getResources().getString(R.string.geologi),getResources().getString(R.string.geo_detail),"https://www.youtube.com/watch?v=_xCX_rAxysg"));
        string_models.add(new SModel(R.drawable.ocean,getResources().getString(R.string.ocean),getResources().getString(R.string.ocean_detail),"https://www.youtube.com/watch?v=kqCj12vSg74"));
        string_models.add(new SModel(R.drawable.botani,getResources().getString(R.string.botani),getResources().getString(R.string.botani_detail),"https://www.youtube.com/c/Drzakirchannel/videos"));
        string_models.add(new SModel(R.drawable.zoology,getResources().getString(R.string.zologi),getResources().getString(R.string.zologi_detail),"https://www.youtube.com/watch?v=rLqxPTE3ZiQ&t=4s"));
        string_models.add(new SModel(R.drawable.medicine,getResources().getString(R.string.medicine),getResources().getString(R.string.med_detail),"https://www.youtube.com/watch?v=S1txXjVfKXA"));
        string_models.add(new SModel(R.drawable.physiologi,getResources().getString(R.string.psikolog),getResources().getString(R.string.psi_detail),"https://www.youtube.com/watch?v=15z3_j83URI"));
        string_models.add(new SModel(R.drawable.embrio,getResources().getString(R.string.Embrio),getResources().getString(R.string.embrio_detail),"https://www.youtube.com/watch?v=y0WnRbq6yWY"));
        string_models.add(new SModel(R.drawable.general_science,getResources().getString(R.string.sains),getResources().getString(R.string.sains_detail),"https://www.youtube.com/c/Drzakirchannel/videos"));
        string_models.add(new SModel(R.drawable.kesimpulan,getResources().getString(R.string.kesimpulan),getResources().getString(R.string.simpul_detail),"https://www.youtube.com/watch?v=B-RLIU5FkbM"));
        string_adapter = new SAdapter((ArrayList<SModel>) string_models, this);
        viewPager = findViewById(R.id.viewpager_Home);
        viewPager.setAdapter(string_adapter);

    }
    
}