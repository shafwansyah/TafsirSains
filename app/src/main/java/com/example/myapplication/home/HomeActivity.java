package com.example.myapplication.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ReadActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    private ArrayList<model> models = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        models.addAll(IsiBacaan.getListData());
        adapter = new Adapter(models, this);
        viewPager = findViewById(R.id.viewpager_Home);
        viewPager.setAdapter(adapter);

    }
}