package day05_matematikselIslemler_increment;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        int a = 27;
        int b = 4;

        // Java iki tamsayiyi bolerseniz sonucu tamsayi olarak size verir
        System.out.println(a / b); //     27 / 4 = 6.75 ==> 6

        System.out.println(32 / 5); //   32 / 5 = 6.4 ==> 6

        double c = 27;

        // Eger bolunen sayi veya bolen sayidan double olan varsa sonucu double olarak verir
        System.out.println(c / b); // 27 / 4 = 6.75

        // a'yi b' ye bolup sonucu ondalikli olarak yazdirin

        double sonuc1  = a / b ; // 27 / 4 = 6.75 ==> 6  sonuc1 = 6

        System.out.println("Sonuc1 : " + sonuc1 ); // 6.0

        double sonuc2 = (double)(a/b) ;
        System.out.println("Sonuc2 : " + sonuc2 ); // 6.0


        double sonuc3 = (double)a / b ;
        System.out.println("Sonuc3 : " + sonuc3 ); // 6.75


        System.out.println(2567 / 10 ); // 256.7 ==> 256
        System.out.println(2567 % 10 ); // 7

        System.out.println(256 / 10 ); // 25.6 ==> 25
        System.out.println(256 % 10 ); // 6

        System.out.println(25 / 10 ); // 2.5 ==> 2
        System.out.println(25 % 10 ); // 5

        System.out.println(2 / 10 ); // 0.2 ==> 0
        System.out.println(2 % 10 ); // 2


    }
}
