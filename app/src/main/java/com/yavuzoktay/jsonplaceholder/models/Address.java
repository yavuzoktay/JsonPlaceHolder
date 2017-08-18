package com.yavuzoktay.jsonplaceholder.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("street")
    @Expose
    public String street;
    @SerializedName("suite")
    @Expose
    public String suite;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("zipcode")
    @Expose
    public String zipcode;
    @SerializedName("geo")
    @Expose
    public Geo geo;

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    public Address withSuite(String suite) {
        this.suite = suite;
        return this;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    public Address withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public Address withGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

}