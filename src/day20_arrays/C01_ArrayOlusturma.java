package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {


        int[] sayilar = {2,4,6,7,8};

        String harfler[] = {"a","f","e"};

        System.out.println(sayilar[1]); // 4
        System.out.println(harfler[2]); // e

        String[] ogrenciList = {"Burhan","Ramazan","Samet","Senol"};

        System.out.println(ogrenciList[1]); // Ramazan

        // 5 kisilik bir sinif olusturun

        String[] sinifListesi1 = {null , null, null, null, null};

        String[] sinifListesi2 = new String[5];

        /*
            Bir array olusturulurken 2 sey mutlaka belirtilmelidir
            1- icine konulacak datalarin turu
            2- Array'in uzunlugu (Bir array'e olusturulurken yazilan uzunlugundan
                                    daha fazla element konulamaz)
         */

        // bir array'in tumunu nasil yazdirabiliriz ?

        System.out.println(sayilar); // [I@2752f6e2

        // dongu ile yazdiralim

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " ");
        } // 2 4 6 7 8
        System.out.println("");

        // Array'in tamamini yazdirmak isterseniz
        // Arrays class'indan hazir method kullaniriz

        System.out.println(Arrays.toString(sayilar)); // [2, 4, 6, 7, 8]

        // for loop ile elementleri yazdiririz.
        // Arrays.toString() ise bize array'in kendisini yazdirir

        System.out.println(Arrays.toString(harfler)); // [a, f, e]

        System.out.println(Arrays.toString(sinifListesi1)); // [null, null, null, null, null]

        System.out.println(Arrays.toString(sinifListesi2)); // [null, null, null, null, null]

        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]

        boolean[] blList = new boolean[8];
        System.out.println(Arrays.toString(blList)); // [false, false, false, false, false, false, false, false]
    }
}
