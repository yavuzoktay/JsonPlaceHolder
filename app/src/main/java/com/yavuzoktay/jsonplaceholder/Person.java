package com.yavuzoktay.jsonplaceholder;

/**
 * Created by Yavuz on 15.8.2017.
 */

public class Person {
    private String isim;
    private String soyIsim;

    public Person(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
}
