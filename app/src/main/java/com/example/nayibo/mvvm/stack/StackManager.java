package com.example.nayibo.mvvm.stack;

import com.example.nayibo.mvvm.base.BaseUI;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

/**
 * Created by nayibo on 2018/1/25.
 */

public class StackManager {
    private static StackManager mInstance;
    private ArrayList<BaseUI> mUIList = new ArrayList<>();

    private StackManager() {

    }

    public static StackManager getInstance() {
        if (mInstance == null) {
            mInstance = new StackManager();
        }
        return mInstance;
    }

    public void addToStack(BaseUI ui, StackAction type) {
        switch (type) {
            case ADD:
                push(ui);
                break;
            case REPLACE_TOP:
                pop();
                push(ui);
                break;
            default:
        }
    }

    public boolean back() {
        boolean success = false;
        if (mUIList.size() > 1) {
            pop();
            gotoUI(mUIList.get(mUIList.size() - 1));
            success = true;
        }
        return success;
    }

    public void gotoUI(BaseUI ui) {
        EventBus.getDefault().post(ui);
    }

    public void startNewUI(BaseUI ui, StackAction type) {
        addToStack(ui, type);
        gotoUI(ui);
    }

    public void pop() {
        if (mUIList.size() > 0) {
            mUIList.remove(mUIList.size() - 1);
        }
    }

    public void push(BaseUI ui) {
        mUIList.add(ui);
    }

    public boolean isEmpty() {
        return mUIList.size() == 0;
    }

    public int size() {
        return mUIList.size();
    }
}
