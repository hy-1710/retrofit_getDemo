package com.example.serpentcs.retrofit2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by serpentcs on 21/1/17.
 */

public interface ServerPath {

    //web-service/get_globalinfo?os=android&user_id=7
    @GET("web-service/get_globalinfo/")
    Call<Data> get(
            @Query("os") String os,
            @Query("user_id") String user_id
    );
}
