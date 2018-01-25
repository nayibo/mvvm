package com.example.nayibo.retrofit;


import com.example.nayibo.mvvm.homepage.HomeModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by nayibo on 2017/7/25.
 */

public interface RetrofitService {
    @GET("/api/4/news/{id}")
    Call<HomeModel> getNewsDetail(@Path("id") long id);
}
