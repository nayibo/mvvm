package com.example.nayibo.mvvm.homepage;

import android.databinding.ObservableField;
import android.util.Log;

import com.example.nayibo.mvvm.base.BaseViewModel;
import com.example.nayibo.mvvm.list.ListPage;
import com.example.nayibo.mvvm.stack.StackAction;
import com.example.nayibo.mvvm.stack.StackManager;
import com.example.nayibo.retrofit.RetrofitHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by nayibo on 2018/1/24.
 */

public class HomepageViewModel extends BaseViewModel {
    public final ObservableField<String> title = new ObservableField<>();

    private void getDate(long id) {
        RetrofitHelper.getInstance().getServer().getNewsDetail(id).enqueue(new Callback<HomeModel>() {
            @Override
            public void onResponse(Call<HomeModel> call, Response<HomeModel> response) {
                showUI(response.body());
            }

            @Override
            public void onFailure(Call<HomeModel> call, Throwable t) {
                Log.d("nayibo", "error: " + t.toString());
            }
        });
    }

    @Override
    public void onAttach() {
        super.onAttach();
        getDate(1999);
    }

    private void showUI(HomeModel data) {
        title.set(data.getTitle());
    }

    public void goList() {
        StackManager.getInstance().startNewUI(new ListPage(), StackAction.ADD);
    }
}
