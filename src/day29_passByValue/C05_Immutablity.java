package day29_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C05_Immutablity {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str.replace("a","*");

        str.split("");

        System.out.println(str); // Java Candir

         // String'de atama yoksa, calistirilan method'lar asil variable'i kalici olarak degistirmez


        List<String> isimler = new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Omer");
        isimler.add("Bugra");

        System.out.println(isimler); // [Kaan, Omer, Bugra]

        isimler.set(1,"Ozan");

        System.out.println(isimler); // [Kaan, Ozan, Bugra]

        isimler.remove(1);

        System.out.println(isimler); // [Kaan, Bugra]



    }
}
