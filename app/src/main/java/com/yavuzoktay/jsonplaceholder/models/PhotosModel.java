package com.yavuzoktay.jsonplaceholder.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotosModel {

    @SerializedName("albumId")
    @Expose
    public Integer albumId;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("thumbnailUrl")
    @Expose
    public String thumbnailUrl;

    public PhotosModel withAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public PhotosModel withId(Integer id) {
        this.id = id;
        return this;
    }

    public PhotosModel withTitle(String title) {
        this.title = title;
        return this;
    }

    public PhotosModel withUrl(String url) {
        this.url = url;
        return this;
    }

    public PhotosModel withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

}