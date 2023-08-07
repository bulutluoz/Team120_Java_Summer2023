package day32_stringBuilder_accessModifier;

public class C03_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        String str ="Java Candir";

        StringBuilder sb1 = new StringBuilder();
        // sb1 = str;
        // Non-primitive data turlerinde farkli data turleri arasinda atama yapabilmek icin
        // bu iki non-primitive data turu arasinda Parent-Child iliskisi olmalidir.

        sb1= new StringBuilder(str);

        System.out.println(sb1); // Java Candir

        System.out.println(sb1.substring(0, 4)); // Java

        System.out.println(sb1); // Java Candir

        // sb1 J harfi iceriyor mu ?

        System.out.println(sb1.toString().contains("J")); // true

        // StringBuilder'da olmayip, String'de olan method'lari kullanmak istersek
        // StringBuilder.toString() ile String'e gecis yapabiliriz
        // bu durumda calisan method'larin sb'i kalici olarak degistirmeyeceklerini UNUTMAMALIYIZ
    }
}
