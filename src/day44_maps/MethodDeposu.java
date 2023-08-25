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

    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer,String> ogrenciMap,int sinif,String sube){

        //1- tum value'leri bir Collection olarak kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();
        //2- bir for-each loop ile herbir value'yu ele alalim

        System.out.println(sinif +".sinif " + sube + " subesindeki ogrenci listesi");
        System.out.println("=================================");
        for (String eachValue:valueCollection
             ) {

            //3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
            //   bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            //  "Ali-Can-11-H-MF"
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            //4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
            //   istenen bilgiyi, array'den index ile alabiliriz
            String sinifStr = sinif+"";

            if (valueArr[2].equals(sinifStr) && valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }

    }

    public static void isimSoyisimIleOgrenciBul(Map<Integer,String> ogrenciMap, String isim, String soyisim){

        Collection<String> valueCollection = ogrenciMap.values();

        for (String eachValue: valueCollection  // "Ali-Can-11-H-MF"
             ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            // isim , soyisim, sinif ve subelerini yazdirin

            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyisim)){

                System.out.println(valueArr[0] + " " + valueArr[1] + " "+ valueArr[2] + " "+ valueArr[3]);
            }

        }
    }
}





        /*
        Elimizde map var
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF
        }

        1- bizden istenen bilgiler key'de mi yoksa value'da mi ?

        [
        Ali-Can-11-H-MF,
        Veli-Cem-10-K-TM,
        Ali-Cem-11-K-TM,
        Ayse-Can-10-H-MF,
        Sevgi-Cem-11-M-TM,
        Sevgi-Can-10-K-MF
        ]

        2- value icerisindeki bilgilere rahat ulasabilmek icin
           for each loop ile her bir value'yu alip split ile array'e cevirelim

           [Ali, Can, 11, H, MF]

         3- Eger sinif ve sube parametre olarak verilen ile ayni ise
            isim ve soyismi yazdir


         */



















