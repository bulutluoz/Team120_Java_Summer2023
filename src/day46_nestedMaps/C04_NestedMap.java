package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;


public class C04_NestedMap {
    public static void main(String[] args) {

        /*
        101= {isim=Ali,soyisim=Can,sinif=11,sube=H,bolum=MF}
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
         */

        Map<Integer, Map<String,Object>> ogrenciMap = new HashMap<>();

        // nested map olusturulurken, once inner map'leri hazirlamalisiniz

        Map<String,Object>  ogrenci101Bilgileri = new HashMap<>();
        ogrenci101Bilgileri.put("isim","Ali");
        ogrenci101Bilgileri.put("soyisim","Can");
        ogrenci101Bilgileri.put("sinif",11);
        ogrenci101Bilgileri.put("sube","H");
        ogrenci101Bilgileri.put("bolum","MF");

        Map<String,Object>  ogrenci102Bilgileri = new HashMap<>();
        ogrenci102Bilgileri.put("isim","Veli");
        ogrenci102Bilgileri.put("soyisim","Cem");
        ogrenci102Bilgileri.put("sinif",10);
        ogrenci102Bilgileri.put("sube","K");
        ogrenci102Bilgileri.put("bolum","TM");

        Map<String,Object>  ogrenci103Bilgileri = new HashMap<>();
        ogrenci103Bilgileri.put("isim","Ali");
        ogrenci103Bilgileri.put("soyisim","Cem");
        ogrenci103Bilgileri.put("sinif",11);
        ogrenci103Bilgileri.put("sube","K");
        ogrenci103Bilgileri.put("bolum","TM");

        // simdi asil map'e bilgileri girebiliriz
        ogrenciMap.put(101,ogrenci101Bilgileri);
        ogrenciMap.put(102,ogrenci102Bilgileri);
        ogrenciMap.put(103,ogrenci103Bilgileri);

        System.out.println(ogrenciMap);
        /*
                {  101=  {sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                   102=  {sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                   103=  {sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}
                   }
         */

        // 103 numarali ogrencinin soyismini yazdirin

        System.out.println(ogrenciMap.get(103).get("soyisim")); // Cem


        // 101 numarali ogrencinin ismini yazdirin

        System.out.println(ogrenciMap.get(101).get("isim")); // Ali

    }
}
