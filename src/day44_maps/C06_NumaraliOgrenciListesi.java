package day44_maps;

import java.util.Map;

public class C06_NumaraliOgrenciListesi {

    public static void main(String[] args) {

        // Tum ogrencileri ogrenci No , isim, soyisim olarak yazdirin

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        // bizden istenen bilgi hem key, hem de value ile calismamizi gerektiriyor
        // bunun icin oncelikle key'leri kaydedelim
        // sonra her bir key'i ve o key'e ait value'dan istenen bilgileri yazdiralim

        MethodDeposu.numaraliOgrenciListesiYazdir(ogrenciMap);
     }
}
