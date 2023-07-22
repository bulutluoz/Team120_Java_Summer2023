package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_get_set {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Cemil");
        isimler.add("Omer");
        isimler.add("Mertkan");

        isimler.add(2,"Burhan");

        System.out.println(isimler); // [Cemil, Omer, Burhan, Mertkan]

        // set() ile add() arasindaki fark
        // add() araya ekler kalanlari kaydirir
        // set() ise update eder / varolan elementin degerini degistirir

        isimler.set(2,"Ayse");

        System.out.println(isimler); // [Cemil, Omer, Ayse, Mertkan]

        System.out.println(isimler.get(1)); // Omer
        System.out.println(isimler); // [Cemil, Omer, Ayse, Mertkan]

    }
}
