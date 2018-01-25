package com.example.nayibo.mvvm.list;

import com.example.nayibo.mvvm.base.BaseUI;
import com.example.nayibo.mvvm.base.MvvmComponent;
import com.example.nayibo.mvvm.base.ViewModel;

/**
 * Created by nayibo on 2018/1/25.
 */

public class ListPage extends BaseUI implements MvvmComponent {
    public ListPage() {
        super(null);
    }

    @Override
    public int getLayoutResID() {
        return 0;
    }

    @Override
    public ViewModel getViewModel() {
        return new ListViewModel();
    }
}
