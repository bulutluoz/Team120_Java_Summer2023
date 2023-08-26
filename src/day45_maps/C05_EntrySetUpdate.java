package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        // ogrenci map'indeki soyisimleri Buyuk Harf olarak duzeltin

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
             ) {

            String eachValue= eachEntry.getValue();

            String[] valueArr = eachValue.split("-");

            valueArr[1] = valueArr[1].toUpperCase();

            // array'i update ettik, ortaligi toplayalim

            // array'i birlestirip yeni value'yu elde edelim
            String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            eachEntry.setValue(yeniValue);
        }

        System.out.println(ogrenciMap);
    }
}
