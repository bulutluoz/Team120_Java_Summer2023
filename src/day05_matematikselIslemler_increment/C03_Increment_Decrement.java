package day05_matematikselIslemler_increment;

public class C03_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 10;

        // sayi variable'nin degerini 2 katinin 5 fazlasi yapin

        sayi = 2 * sayi + 5 ;

        System.out.println(sayi);

        // 2.yontemle yaparsak
        sayi = 10;
        sayi *=2;
        sayi +=5;

        System.out.println(sayi);


        sayi = 10 ;

        sayi *= 3; // sayi =30

        sayi -= 3; // sayi =27

        sayi /= 3; // sayi =9

        System.out.println(sayi); // 9

        int a = 10;

        // a'nin degerini yeni olusturdugumuz b'ye atayip, sonra a'nin degerini bir artirin
        // a ve b'yi yazdirin


        int b = a;
        a++;

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 10



        a= 10;

        // a'nin degerini bir artirin, sonra a'nin degerini b'ye atayin

        a++;

        b = a ;

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11


    }
}
