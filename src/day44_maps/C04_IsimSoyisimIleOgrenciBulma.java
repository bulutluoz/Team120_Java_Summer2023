package day44_maps;

import java.util.Map;

public class C04_IsimSoyisimIleOgrenciBulma {

    public static void main(String[] args) {

        // ogrenci map'inde verilen isim ve soyisim'e sahip ogrencilerin
        // isim , soyisim, sinif ve subelerini yazdirin

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap,"ALI","CAN");




    }
}
