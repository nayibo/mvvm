package com.example.nayibo.mvvm.list;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.util.Log;

import com.example.nayibo.mvvm.base.BaseViewModel;

/**
 * Created by nayibo on 2018/1/25.
 */

public class ListViewModel extends BaseViewModel {
    private final ObservableList<ListPageItemViewModel> mData = new ObservableArrayList<>();

    public ObservableList<ListPageItemViewModel> items() {
        ListModel model = new ListModel();
        model.setName("aa");
        mData.add(new ListPageItemViewModel(model));
        ListModel model1 = new ListModel();
        model1.setName("bb");
        mData.add(new ListPageItemViewModel(model1));
        ListModel model2 = new ListModel();
        model2.setName("cc");
        mData.add(new ListPageItemViewModel(model2));
        return mData;
    }

    @Override
    public void onAttach() {
    }

    public void onItemBound(int position) {

    }
}
