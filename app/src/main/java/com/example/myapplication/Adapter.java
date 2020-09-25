package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.io.Serializable;
import java.util.ArrayList;

public class Adapter extends PagerAdapter{

    private ArrayList<model> modelList;
    private Context context;
    private LayoutInflater layoutInflater;

    public Adapter(ArrayList<model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

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
        final TextView title;

        imageView = view.findViewById(R.id.img_viewpager);
        title = view.findViewById(R.id.text_viewpager);

        imageView.setImageResource(modelList.get(position).getImg_icon());
        title.setText(modelList.get(position).getTitle());

        container.addView(view, 0);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ReadActivity.class);
                modelList = IsiBacaan_en.getListData();
                i.putExtra("tafsir_list", modelList);
                i.putExtra("position", position);
                Log.d("modellist", "onClick: "+modelList);
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
