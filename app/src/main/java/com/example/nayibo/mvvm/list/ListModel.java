package com.example.nayibo.mvvm.list;

/**
 * Created by nayibo on 2018/1/25.
 */

public class ListModel {
    private String name;
    private String imageUrl;
    private String loResImageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLoResImageUrl() {
        return loResImageUrl;
    }

    public void setLoResImageUrl(String loResImageUrl) {
        this.loResImageUrl = loResImageUrl;
    }
}
