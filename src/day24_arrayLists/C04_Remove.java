package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kaan");
        isimler.add("Bulent");
        isimler.add("Tugba");
        isimler.add("Burhan");
        isimler.add("Kaan");

        System.out.println(isimler); // [Kaan, Bulent, Tugba, Burhan, Kaan]

        System.out.println(isimler.remove("Hasan")); // false
        System.out.println(isimler.remove("Kaan")); // true

        System.out.println(isimler); // [Bulent, Tugba, Burhan, Kaan]

        System.out.println(isimler.remove(1)); // Tugba
        System.out.println(isimler); // [Bulent, Burhan, Kaan]


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar); // [3, 5, 7, 1]

        sayilar.remove(1);
        System.out.println(sayilar); // [3, 7, 1]

        // ben illa da element olan 1'i silmek istersem
        Integer silinecekElement = 1;
        sayilar.remove(silinecekElement);

        System.out.println(sayilar); // [3, 7]

        sayilar.clear();
        System.out.println(sayilar); // []

    }
}
