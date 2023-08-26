package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C02_SiniflariBirArtirma {

    public static void main(String[] args) {

        // ogrenci map'inde yil sonu duzenlemesi yapalim
        // 9,10,11.siniftaki ogrencilerin siniflarini 1 artirin
        // 12.siniftaki ogrenciler icin sinif bilgisi olarak mezun yazin

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        ogrenciMap = MethodDeposu.yilSonuSinifArtir(ogrenciMap);

        System.out.println(ogrenciMap);


    }
}
