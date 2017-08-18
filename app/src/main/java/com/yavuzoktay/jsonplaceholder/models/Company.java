package com.yavuzoktay.jsonplaceholder.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("catchPhrase")
    @Expose
    public String catchPhrase;
    @SerializedName("bs")
    @Expose
    public String bs;

    public Company withName(String name) {
        this.name = name;
        return this;
    }

    public Company withCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
        return this;
    }

    public Company withBs(String bs) {
        this.bs = bs;
        return this;
    }

}