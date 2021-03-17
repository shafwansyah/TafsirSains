package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getdata.php")
    Call<List<ModelMateri>> getData(@Query("key") String keyword);
}

