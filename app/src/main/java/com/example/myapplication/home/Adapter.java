package com.example.myapplication.home;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.viewpager.widget.PagerAdapter;

import com.example.myapplication.R;
import com.example.myapplication.ReadActivity;

import java.util.ArrayList;

public class Adapter extends PagerAdapter {

    public Adapter(ArrayList<model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    private ArrayList<model> modelList;
    private Context context;
    private LayoutInflater layoutInflater;

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_viewpager, container, false);

        ImageView imageView;
        TextView title, bacaan;

        imageView = view.findViewById(R.id.img_viewpager);
        title = view.findViewById(R.id.text_viewpager);
        bacaan = view.findViewById(R.id.text_reading);

        imageView.setImageResource(modelList.get(position).getImg_icon());
        title.setText(modelList.get(position).getTitle());

        container.addView(view, 0);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ReadActivity.class);
                i.putExtra("position", position);
                context.startActivity(i);
            }
        });
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
