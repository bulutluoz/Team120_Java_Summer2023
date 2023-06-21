package day04_dataCasting_wrapperClass;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3)); // a

        int sayi = 20;

        /*
            Java primitive data turleri icin hazir method olusturamaz
            ANCAK
            primitive data turleri icin de hazir method'lar kullanabilecek
           Wrapper class'lar olusturmustur

           int ==> Integer
           char ==> Character

           short ==> Short
           double ==> Double ....

           Wrapper class'lar primitive data turleri ile hic problemsiz atama yapilabilir
         */


        int sayi2 = 5;

        Integer sayi3 = sayi2;
        int sayi4 = sayi3;

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647


        // Short sayi5 = (Short)sayi3; Wrapper class'lar arasinda casting OLMAZ

        System.out.println(Short.MIN_VALUE); // -32768


        // Icinde sadece sayisal ifadeler bulunan bir String verildiginde
        // Matematiksel islem yapmaniz gerekirse
        // Integer.parseInt() ile int'a cevirebiliriz

        String str1 = "22";
        String str2 = "33";

        // Bu degerleri toplayip yazdirin

        System.out.println(str1 + str2); // 2233

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 55


        char ch1 = '7';

        System.out.println(Character.isDigit(ch1)); // true
        System.out.println(Character.isLetter(ch1)); // false
        System.out.println(Character.isWhitespace(ch1)); // false

    }
}
