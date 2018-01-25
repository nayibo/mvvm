package com.example.nayibo.retrofit;

import java.util.HashMap;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nayibo on 2017/7/25.
 */

public class RetrofitHelper {
    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit;
    private HashMap<String, String> mHeaderMap;

    private RetrofitHelper() {
        init();
    }

    public static RetrofitHelper getInstance() {
        if (instance == null) {
            instance = new RetrofitHelper();
        }
        return instance;
    }

    private void init() {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        mRetrofit = new Retrofit.Builder().client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://news-at.zhihu.com/").build();
    }

    public RetrofitService getServer(){
        return mRetrofit.create(RetrofitService.class);
    }
}
