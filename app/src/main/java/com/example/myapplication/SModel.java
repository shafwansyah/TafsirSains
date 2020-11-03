package com.example.myapplication;

import android.net.Uri;

import java.io.Serializable;

public class SModel implements Serializable {

    private int image;
    private String title;
    private String desc;
    private String yutub;



    public SModel(int image, String title, String desc, String yutub) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.yutub = yutub;
    }

    public String getYutub() {
        return yutub;
    }

    public void setYutub(String yutub) {
        this.yutub = yutub;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
