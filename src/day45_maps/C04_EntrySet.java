package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {
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
            106=Sevgi-Can-10-K-MF
            }

            Bu ogrenci map'inde 6 Key ve 6 value var

            update etmek icin
            once keySet olusturuyoruz
            keySet'deki her bir key icin value'yu getiriyoruz
            value uzerinde istedigimiz update'i yapip
            key ile yeniValue'yu map'e ekleyerek map'i update ediyoruz

            Java'da key =value ikilisini beraberce barindiran Entry diye bir yapi da var
         */

         Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

         // sinif artirma sorusunu Entry ile yapalim

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            System.out.println(eachEntry);

            String eachValue = eachEntry.getValue();
            String[] valueArr = eachValue.split("-");

            switch (valueArr[2]){
                case "9" :
                    valueArr[2] ="10";
                    break;
                case "10" :
                    valueArr[2] ="11";
                    break;
                case "11" :
                    valueArr[2] ="12";
                    break;
                case "12" :
                    valueArr[2] ="Mezun";
                    break;
            } // [Ali, Can, 12, H, MF]

            String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            eachEntry.setValue(yeniValue);
        }

        System.out.println(ogrenciMap);
    }
}
