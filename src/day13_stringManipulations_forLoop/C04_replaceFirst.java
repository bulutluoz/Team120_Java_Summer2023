package day13_stringManipulations_forLoop;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Java Candir, kendisini cok seviyoruz123.";

        // sadece ilk a'yi BUYUK A yapin

        System.out.println(str.replaceFirst("a", "A"));
        // JAva Candir, kendisini cok seviyoruz123.

        // ilk space'i iki space haline getirin

        System.out.println(str.replaceFirst(" ", "  "));
        // Java  Candir, kendisini cok seviyoruz123.


        // ilk sayiyi space haline donusturun

        System.out.println(str.replaceFirst("\\d", " "));
        // Java Candir, kendisini cok seviyoruz 23.


        // ilk ozel karakteri * olarak degistirin

        System.out.println(str.replaceFirst("\\W", "*"));
        // Java*Candir, kendisini cok seviyoruz123.


    }
}
