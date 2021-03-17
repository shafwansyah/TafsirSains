package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MateriFragment extends Fragment {

    private AdapterMateri adapterMateri;
    private List<ModelMateri> modelMateriList;
    private RecyclerView rv_materi;
    private ApiInterface apiInterface;
    ProgressBar progressBar;
    Context context = this.getContext();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_materi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_materi = view.findViewById(R.id.rv_materi);
        progressBar = view.findViewById(R.id.loading);

//        modelMateriList = new ArrayList<>();
////        modelMateriList.add(new ModelMateri(getString(R.string.intro), R.drawable.intro, getString(R.string.intro_detail)));
////        modelMateriList.add(new ModelMateri(getString(R.string.sains), R.drawable.general_science, getString(R.string.sains_detail)));
//        modelMateriList.addAll(DataMateri.getListData());
//        adapterMateri = new AdapterMateri(modelMateriList, this.getContext());

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false);
        rv_materi.setLayoutManager(linearLayoutManager);
        fetchData("");

    }

    public void fetchData (String key){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<ModelMateri>> call = apiInterface.getData(key);

        call.enqueue(new Callback<List<ModelMateri>>() {
            @Override
            public void onResponse(Call<List<ModelMateri>> call, Response<List<ModelMateri>> response) {
                progressBar.setVisibility(View.GONE);
                int i;
                for (i=0; i<modelMateriList.size(); i++){
                    // TODO: 17/03/21
                    modelMateriList = response.body();
                }
                Log.d("Data", "onResponse: " + modelMateriList.size());
                adapterMateri = new AdapterMateri(modelMateriList, context);
                rv_materi.setAdapter(adapterMateri);
                adapterMateri.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<ModelMateri>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "Error on : " + t.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}