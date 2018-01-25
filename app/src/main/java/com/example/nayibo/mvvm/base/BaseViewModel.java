package com.example.nayibo.mvvm.base;

import android.view.View;

/**
 * Created by nayibo on 2018/1/24.
 */

public abstract class BaseViewModel implements ViewModel {
    public BaseViewModel() {
    }

    @Override
    public void onAttach() {
    }

    @Override
    public void onDetach() {
    }

    public final void onViewAttachedToWindow(View view) {
        onAttach();
    }

    public final void onViewDetachedFromWindow(View view) {
        onDetach();
    }
}
