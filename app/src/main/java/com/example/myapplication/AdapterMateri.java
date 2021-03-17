package com.example.myapplication;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class AdapterMateri extends RecyclerView.Adapter<AdapterMateri.MyHolder> {

    private List<ModelMateri> modelMateriList;
    private Context context;

    public AdapterMateri(List<ModelMateri> modelMateriList, Context context) {
        this.modelMateriList = modelMateriList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_viewpager, parent, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
        holder.judul.setText(modelMateriList.get(position).getJudul());
//        holder.icon.setImageResource(modelMateriList.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ReadActivity.class);
                intent.putExtra("POSITION",position);
                intent.putExtra("MODELMATERI", (Serializable) modelMateriList);
//                intent.putExtra("JUDUL", modelMateriList.get(position).getTitle());
//                intent.putExtra("IMAGE", modelMateriList.get(position).getImage());
//                intent.putExtra("DETAIL", modelMateriList.get(position).getDesc());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelMateriList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        public TextView judul;
        public ImageView icon;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.text_viewpager);
            icon = itemView.findViewById(R.id.img_viewpager);
        }
    }
}
