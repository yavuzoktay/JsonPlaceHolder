package com.yavuzoktay.jsonplaceholder.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlbumsModel {

    @SerializedName("userId")
    @Expose
    public Integer userId;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;

    public AlbumsModel withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public AlbumsModel withId(Integer id) {
        this.id = id;
        return this;
    }

    public AlbumsModel withTitle(String title) {
        this.title = title;
        return this;
    }

}