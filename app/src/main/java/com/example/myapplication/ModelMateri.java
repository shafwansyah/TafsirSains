package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ModelMateri implements Serializable {

    @SerializedName("id_bhs")
    private String idBhs;

    @SerializedName("bahasa")
    private String bahasa;

    @SerializedName("level")
    private String level;

    @SerializedName("id_sub")
    private String idSub;

    @SerializedName("penjelasan")
    private String penjelasan;

    @SerializedName("judul")
    private String judul;

    @SerializedName("dalil")
    private String dalil;

    @SerializedName("id_chp")
    private String idChp;

    @SerializedName("isi")
    private String isi;

    public ModelMateri(String idBhs, String bahasa, String level, String idSub, String penjelasan, String judul, String dalil, String idChp, String isi) {
        this.idBhs = idBhs;
        this.bahasa = bahasa;
        this.level = level;
        this.idSub = idSub;
        this.penjelasan = penjelasan;
        this.judul = judul;
        this.dalil = dalil;
        this.idChp = idChp;
        this.isi = isi;
    }

    public String getIdBhs() {
        return idBhs;
    }

    public String getBahasa() {
        return bahasa;
    }

    public String getLevel() {
        return level;
    }

    public String getIdSub() {
        return idSub;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public String getJudul() {
        return judul;
    }

    public String getDalil() {
        return dalil;
    }

    public String getIdChp() {
        return idChp;
    }

    public String getIsi() {
        return isi;
    }
}