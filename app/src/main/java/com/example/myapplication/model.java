package com.example.myapplication;

import java.io.Serializable;

public class model implements Serializable {

    private int img_icon;
    private String title;
    private String bacaan;

    public model() {
        this.img_icon = img_icon;
        this.title = title;
        this.bacaan = bacaan;
    }

    public int getImg_icon() {
        return img_icon;
    }

    public void setImg_icon(int img_icon) {
        this.img_icon = img_icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBacaan() {
        return bacaan;
    }

    public void setBacaan(String bacaan) {
        this.bacaan = bacaan;
    }
}
