package day44_maps;

import java.util.Map;

public class C05_KeyIleValueyaUlasma {

    public static void main(String[] args) {

        // numarasi verilen ogrencinin isim, soyisim, sinif ve subesini yazdirin

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap.get(102)); // Veli-Cem-10-K-TM
        System.out.println(ogrenciMap.get(105)); // Sevgi-Cem-11-M-TM
        System.out.println(ogrenciMap.get(123)); // null

        MethodDeposu.numaraIleOgrenciBilgisiyazdirma(ogrenciMap,103);

    }
}
