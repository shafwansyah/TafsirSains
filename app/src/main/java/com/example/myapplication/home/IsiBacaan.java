package com.example.myapplication.home;

import com.example.myapplication.R;

import java.util.ArrayList;

public class IsiBacaan {
    private static String[] tafsir_title = {
            "Introduction",
            "Astronomy",
            "Physics",
//            "Hidrology",
//            "Geology",
//            "Oceanology",
//            "Biotany",
//            "Zoology",
//            "Medicine",
//            "Physiology",
//            "Embriology",
//            "General Science",
//            "Conclusion"
    };

    private static Integer[] tafsir_icon = {
            R.drawable.intro,
            R.drawable.asstro,
            R.drawable.fisika,
//            R.drawable.hidrologi,
//            R.drawable.earth,
//            R.drawable.ocean,
//            R.drawable.botani,
//            R.drawable.zoology,
//            R.drawable.medicine,
//            R.drawable.physiologi,
//            R.drawable.embrio,
//            R.drawable.general_science,
//            R.drawable.kesimpulan
    };

    private static String[] tafsir_detail = {
            "Ini isi bacaan untuk array yang kedua",
            "ini isi lagi biar gk ada error",
            "ini juga sama dengan yang diatas"
    };

    static ArrayList<model> getListData(){
        ArrayList<model> list = new ArrayList<>();
        for( int position = 0; position < tafsir_detail.length; position++){
            model model = new model();
            model.setTitle(tafsir_title[position]);
            model.setImg_icon(tafsir_icon[position]);
            model.setBacaan(tafsir_detail[position]);
            list.add(model);
        }
        return list;
    }
}
