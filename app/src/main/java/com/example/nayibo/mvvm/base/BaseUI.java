package com.example.nayibo.mvvm.base;

/**
 * Created by nayibo on 2018/1/25.
 */

public class BaseUI<T> {
    private T data;

    public BaseUI(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
