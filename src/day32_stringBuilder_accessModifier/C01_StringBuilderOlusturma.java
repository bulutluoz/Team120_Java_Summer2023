package day32_stringBuilder_accessModifier;

public class C01_StringBuilderOlusturma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // bos bir sb olusturur

        System.out.println(sb1); // hiclik yazdirdi
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16 karakterlik


        StringBuilder sb2 = new StringBuilder("Java Candir.");
        System.out.println(sb2); // Java Candir.
        System.out.println(sb2.length()); // 12
        System.out.println(sb2.capacity()); // 16+12=28 karakterlik


        StringBuilder sb3 = new StringBuilder(9);
        System.out.println(sb3); // hiclik yazdirdi
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 9 karakterlik

        sb3.append("Java Candir.");
        System.out.println(sb3); // Java Candir.
        System.out.println(sb3.length()); // 12
        System.out.println(sb3.capacity()); // 2*9+2 = 20 karakterlik

        sb3.trimToSize();
        System.out.println(sb3); // Java Candir.
        System.out.println(sb3.length()); // 12
        System.out.println(sb3.capacity()); // 12

    }
}
