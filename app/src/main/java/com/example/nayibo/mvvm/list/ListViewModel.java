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
        model.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516972991022&di=1607d3a0fa97dbce1b7e436fd621b00a&imgtype=0&src=http%3A%2F%2Fimg1qn.moko.cc%2F2016-02-19%2F5edf1679-d7cc-41e7-b309-b11f1fb28f27.jpg%3FimageView2%2F2%2Fw%2F915%2Fh%2F915");
        mData.add(new ListPageItemViewModel(model));
        ListModel model1 = new ListModel();
        model1.setName("bb");
        model1.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516972991023&di=6e37c5b61f0a4b50c04666fee61f6b7f&imgtype=0&src=http%3A%2F%2Fimg.ef43.com.cn%2FbrandPic%2F2013%2F6%2F03113519455.jpg");
        mData.add(new ListPageItemViewModel(model1));
        ListModel model2 = new ListModel();
        model2.setName("cc");
        model2.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516972991021&di=37f332c09e2f181d9e2f6b1e32716233&imgtype=0&src=http%3A%2F%2Fimg.xxjcy.com%2Fpic%2Fz2d7686f-600x600-0%2Fcar_ice_scraper_gifts_set.jpg");
        mData.add(new ListPageItemViewModel(model2));
        return mData;
    }

    @Override
    public void onAttach() {
    }

    public void onItemBound(int position) {

    }
}
