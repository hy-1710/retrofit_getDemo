package com.example.serpentcs.retrofit2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.serpentcs.retrofit2.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        makeServerCall();
    }

    public void makeServerCall() {
        //first initialise the retrofit variable
        Retrofit retrofit = RetroFitHelper.getRetroFitCall();
        //crate the path variable for server call if we are performing it using get method then
        // pass the parameter
        ServerPath path = retrofit.create(ServerPath.class);
        Call<Data> call = path.get("android", "7");
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {

                if (response.isSuccessful()) {
                    binding.tvDisplayName.setText(response.body().getData().getUser_info().get(0).getDisplay_name());
                    binding.tvEmail.setText(response.body().getData().getUser_info().get(0).getEmail());
                    binding.tvDate.setText(response.body().getData().getPromotional_date());

                } else {

                }
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });


    }
}
