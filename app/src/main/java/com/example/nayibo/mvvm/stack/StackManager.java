package com.example.nayibo.mvvm.stack;

import com.example.nayibo.mvvm.base.BaseUI;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

/**
 * Created by nayibo on 2018/1/25.
 */

public class StackManager {
    private ArrayList<BaseUI> mUIList = new ArrayList<>();

    public void addToStack(BaseUI ui) {
        mUIList.add(ui);
    }

    public void finish() {
        if (mUIList.size() > 0) {
            mUIList.remove(mUIList.size() - 1);
        }

        if (mUIList.size() > 0) {
            gotoUI(mUIList.get(mUIList.size() - 1));
        }
    }

    public void gotoUI(BaseUI ui) {
        EventBus.getDefault().post(ui);
    }

    public void startNewUI(BaseUI ui) {
        addToStack(ui);
        gotoUI(ui);
    }
}
