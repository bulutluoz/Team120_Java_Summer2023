package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        // Subesi H olan ogrencilerin subesini T yapin

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
             ) {

            String value= eachEntry.getValue();
            String[] valueArr = value.split("-");

            if (valueArr[3].equalsIgnoreCase("H")){
                valueArr[3] = "T";
            }

            // array'i update ettik, ortaligi toplayalim
            String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            eachEntry.setValue(yeniValue);
        }

        System.out.println(ogrenciMap);
    }
}
