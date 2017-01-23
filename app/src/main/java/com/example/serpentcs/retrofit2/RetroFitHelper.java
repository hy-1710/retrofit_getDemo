package com.example.serpentcs.retrofit2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by serpentcs on 21/1/17.
 */

public class RetroFitHelper {

    public static final String TAG;
    public static final Retrofit retroFitCall;

    static {
        TAG = RetroFitHelper.class.getSimpleName();
        retroFitCall = new Retrofit.Builder()
                .baseUrl("http://www.wowlaundry.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getRetroFitCall() {
        return retroFitCall;
    }
}
