package com.example.nayibo.mvvm.main;

import android.databinding.ObservableField;

import com.example.nayibo.mvvm.base.BaseViewModel;
import com.example.nayibo.mvvm.base.MvvmComponent;
import com.example.nayibo.mvvm.homepage.Homepage;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by nayibo on 2018/1/24.
 */

public class MainViewModel extends BaseViewModel {
    public final ObservableField<MvvmComponent> mainComponent = new ObservableField<>();

    @Override
    public void onAttach() {
        super.onAttach();
        EventBus.getDefault().register(this);
        mainComponent.set(new Homepage());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe
    public void onMessageEvent(MvvmComponent component) {
        mainComponent.set(component);
    }
}
