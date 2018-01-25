package com.example.nayibo.mvvm.binding;

import android.databinding.BindingAdapter;
import android.view.View;

public class ViewBindings {

    private ViewBindings() {
        throw new AssertionError("No instances.");
    }

    @BindingAdapter("onClick")
    public static void onClick(View view, final ClickHandler clickHandler) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickHandler.onClick();
            }
        });
    }

    public interface ClickHandler {
        void onClick();
    }

    @BindingAdapter("isGone")
    public static void isGone(View view, Boolean isGone) {
        view.setVisibility(isGone ? View.GONE : View.VISIBLE);
    }

    @BindingAdapter("isInvisible")
    public static void isInvisible(View view, Boolean isInvisible) {
        view.setVisibility(isInvisible ? View.INVISIBLE : View.VISIBLE);
    }

}
