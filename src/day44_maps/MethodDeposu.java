package day44_maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MethodDeposu {


    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }


    public static void isimSoyisimListesiYazdir(Map<Integer,String> ogrenciMap){

         Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Sira No   Isim  Soyisim");
        System.out.println("=======================");
        int siraNo= 1;

        for (String eachValue: valueCollection  // "Ali-Can-11-H-MF"
             ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            System.out.println(siraNo+" -   "+valueArr[0] + " " + valueArr[1]);
            siraNo++;
        }
    }
}
