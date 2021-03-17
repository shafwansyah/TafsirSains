package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPopup extends RecyclerView.Adapter<AdapterPopup.RecyclerViewHolder> {

    private Context context;
    private List<ModelMateri> modelMateriList;

    public AdapterPopup(Context context, List<ModelMateri> modelMateriList) {
        this.context = context;
        this.modelMateriList = modelMateriList;
    }

    @NonNull
    @Override
    public AdapterPopup.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_popup, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPopup.RecyclerViewHolder holder, int position) {

        holder.txtImgPopup.setText(modelMateriList.get(position).getJudul());
//        holder.imgPopup.setImageResource(modelMateriList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return modelMateriList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        public TextView txtImgPopup;
        public ImageView imgPopup;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            txtImgPopup = itemView.findViewById(R.id.recycler_textpopup);
            imgPopup = itemView.findViewById(R.id.recycler_imagepopup);
        }
    }
}
