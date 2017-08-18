
package com.yavuzoktay.jsonplaceholder.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceHolderModel {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("address")
    @Expose
    public Address address;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("website")
    @Expose
    public String website;
    @SerializedName("company")
    @Expose
    public Company company;

    public PlaceHolderModel withId(Integer id) {
        this.id = id;
        return this;
    }

    public PlaceHolderModel withName(String name) {
        this.name = name;
        return this;
    }

    public PlaceHolderModel withUsername(String username) {
        this.username = username;
        return this;
    }

    public PlaceHolderModel withEmail(String email) {
        this.email = email;
        return this;
    }

    public PlaceHolderModel withAddress(Address address) {
        this.address = address;
        return this;
    }

    public PlaceHolderModel withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public PlaceHolderModel withWebsite(String website) {
        this.website = website;
        return this;
    }

    public PlaceHolderModel withCompany(Company company) {
        this.company = company;
        return this;
    }

}


