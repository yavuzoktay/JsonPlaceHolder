package com.yavuzoktay.jsonplaceholder.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geo {

    @SerializedName("lat")
    @Expose
    public String lat;
    @SerializedName("lng")
    @Expose
    public String lng;

    public Geo withLat(String lat) {
        this.lat = lat;
        return this;
    }

    public Geo withLng(String lng) {
        this.lng = lng;
        return this;
    }

}