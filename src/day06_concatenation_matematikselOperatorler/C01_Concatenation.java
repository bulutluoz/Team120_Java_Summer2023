package day06_concatenation_matematikselOperatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

        // sadece yukardaki variable'lari kullanarak
        // asagida verilen metin'leri yazdirin

        // Java35

        System.out.println(s1+a+b); // "Java35"

        // Java15
        System.out.println(s1+ a*b ); // "Java15"

        // 8Candir
        System.out.println(a+b+s2); // "8Candir"

        // 53Java

        System.out.println( b+ (a+s1)  );// "53Java"

        System.out.println( s4 + b + a + s1);// "5" + 3 ==> "53"+ "Java ==> "53Java"

        System.out.println( b + s4 + a + s1);


        // 35 Java

        System.out.println(s4 + a + b + s3 + s1); // 35 Java
    }
}
