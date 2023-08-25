package day44_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_IsimListesi {

    public static void main(String[] args) {

        // ogrenci map'inde bulunan ogrencilerin
        // isim ve soyisimlerini sira numarali bir liste olarak yazdirin

        /*
            map'ler kompleks bilgiler barindirabilir
            barindirdigi bilgi ne kadar kompleks olursa
            o bilginin detaylarina ulasmak da o kadar asama gerektirebilir

            Bu tur kompleks islemleri, her seferinde yeniden kodlamak yerine
            ilk istendiginde method olarak olusturup
            sonra ihtiyac durumunda, o method'u kullanmak daha mantikli olur

            Bir map ile islem yapmak istedigimizde
            ilk bakacagimiz sey istenen bilginin key mi yoksa value'da mi bulundugudur

            Eger sadece value'de olan bir bilgiyi ariyorsak

            1- tum value'leri bir Collection olarak kaydedelim
            2- bir for-each loop ile herbir value'yu ele alalim
            3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
               bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
               istenen bilgiyi, array'den index ile alabiliriz
         */

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();
        ogrenciMap.put(110,"Kaan-Can-12-K-MF");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Kaan-Can-12-K-MF}

        MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);
    }
}
