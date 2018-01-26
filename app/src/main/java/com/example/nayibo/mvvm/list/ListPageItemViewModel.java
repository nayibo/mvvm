package com.example.nayibo.mvvm.list;

import android.databinding.ObservableField;
import android.util.Log;

import com.example.nayibo.mvvm.base.BaseViewModel;

/**
 * Created by nayibo on 2018/1/26.
 */

public class ListPageItemViewModel extends BaseViewModel {
    public final ObservableField<String> name = new ObservableField<>();

    public ListPageItemViewModel(ListModel model) {
        name.set(model.getName());
    }

    public void selectItem() {
        Log.d("nayibo", "List item click");
    }
}
