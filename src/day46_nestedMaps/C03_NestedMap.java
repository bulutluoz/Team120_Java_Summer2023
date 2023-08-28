package day46_nestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_NestedMap {
    public static void main(String[] args) {

        /*
         {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }
         */


        List<Object> havuz = new ArrayList<>();
        havuz.add(78);
        havuz.add("Java");
        havuz.add(true);
        havuz.add('K');
        havuz.add(new int[3]);
        havuz.add(new ArrayList<String>());

        System.out.println(havuz); // [78, Java, true, K, [I@e580929, []]

        System.out.println(((Integer)havuz.get(0) * 2)); // 156


        System.out.println(((String) havuz.get(1)).substring(2)); // va

        /*
            data turunu Object gibi Jenerik bir data turu secmek
            istedigimiz elementi bu list'e koymak icin
            baslangicta guzel olur
            AMMA
            sonrasinda elemanlarla ilgili islemler yapmak istedigimizde
            surekli olarak Casting yapmamiz gerekir
         */


    }
}
