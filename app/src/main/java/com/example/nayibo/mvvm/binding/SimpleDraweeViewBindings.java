package com.example.nayibo.mvvm.binding;

import android.databinding.BindingAdapter;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.drawee.view.SimpleDraweeView;

public class SimpleDraweeViewBindings {

    private SimpleDraweeViewBindings() {
        throw new AssertionError("No instances.");
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(final SimpleDraweeView view, String imageUrl) {
        if (!TextUtils.isEmpty(imageUrl)) {
            view.setImageURI(Uri.parse(imageUrl));
        }
    }

}
