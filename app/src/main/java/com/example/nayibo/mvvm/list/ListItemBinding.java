package com.example.nayibo.mvvm.list;

import com.example.nayibo.mvvm.R;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;
import me.tatarka.bindingcollectionadapter2.recyclerview.BR;

/**
 * Created by nayibo on 2018/1/26.
 */

public class ListItemBinding implements OnItemBind<ListPageItemViewModel> {
    private static ListItemBinding INSTANCE;

    @Override
    public void onItemBind(ItemBinding itemBinding, int position, ListPageItemViewModel item) {
        itemBinding.set(BR.vm, R.layout.listpage_item);
    }

    public static ListItemBinding get() {
        if (INSTANCE == null) {
            INSTANCE = new ListItemBinding();
        }
        return INSTANCE;
    }
}
