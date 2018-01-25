package com.example.nayibo.mvvm.binding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nayibo.mvvm.BR;
import com.example.nayibo.mvvm.base.MvvmComponent;

/**
 * Created by nayibo on 2017/11/30.
 */

public class ViewGroupBindings {
    private ViewGroupBindings() {
        throw new AssertionError("No instances.");
    }

    @BindingAdapter("component")
    public static void loadComponent(ViewGroup viewGroup, MvvmComponent component) {
        if (component != null) {
            ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), component.getLayoutResID(), viewGroup, false);
            View view = binding.getRoot();
            binding.setVariable(BR.vm, component.getViewModel());
            binding.executePendingBindings();
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
    }
}
