package com.example.nayibo.mvvm.homepage;

import com.example.nayibo.mvvm.R;
import com.example.nayibo.mvvm.base.BaseUI;
import com.example.nayibo.mvvm.base.MvvmComponent;
import com.example.nayibo.mvvm.base.ViewModel;

/**
 * Created by nayibo on 2018/1/24.
 */

public class Homepage extends BaseUI implements MvvmComponent {
    public Homepage() {
        super(null);
    }

    @Override
    public int getLayoutResID() {
        return R.layout.homepage_layout;
    }

    @Override
    public ViewModel getViewModel() {
        return new HomepageViewModel();
    }
}
