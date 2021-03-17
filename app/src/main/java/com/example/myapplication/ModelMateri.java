package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class ModelMateri{

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

	@SerializedName("path_icon")
	private String path_icon;

	@SerializedName("dalil")
	private String dalil;

	@SerializedName("id_chp")
	private String idChp;

	@SerializedName("isi")
	private String isi;

	public String getIdBhs(){
		return idBhs;
	}

	public String getBahasa(){
		return bahasa;
	}

	public String getLevel(){
		return level;
	}

	public String getIdSub(){
		return idSub;
	}

	public String getPenjelasan(){
		return penjelasan;
	}

	public String getJudul(){
		return judul;
	}

	public String getPath_icon() {
		return path_icon;
	}

	public String getDalil(){
		return dalil;
	}

	public String getIdChp(){
		return idChp;
	}

	public String getIsi(){
		return isi;
	}
}