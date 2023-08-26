package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C01_Update {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        /*
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF}
         */

        // 105 numarali ogrencinin soyadini Han yapin

        ogrenciMap.put(105,"Sevgi-Han-11-M-TM");

        // 103 numarali ogrencinin sinifini T yapin

        ogrenciMap.put(103,"Ali-Cem-11-T-TM");

        System.out.println(ogrenciMap);
        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-T-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Han-11-M-TM,
            106=Sevgi-Can-10-K-MF}
         */

        /*
            map'de bir value'yu update etmek istersek
            1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
                - key ile value'yu cagiririz
                - value'yu array'e ceviririz
                - array'de istedigimiz update'i yapariz
            2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            3- key ve yeni value'yu kullanarak, map'i update ederiz
         */



    }
}
