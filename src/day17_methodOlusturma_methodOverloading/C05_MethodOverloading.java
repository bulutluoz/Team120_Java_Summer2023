package day17_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {

    public static void main(String[] args) {
        /*
            method overloading olan bir class'da
            hangi method'un calisacagina karar vermek icin
            asagidaki siralamaya gore method'lar incelenir
            1- isim
            2- parametre sayisi
            3- argument - parametre uyumu
            4- minumum casting
         */

        toplama('s'); // tek int girilirse 2 kati yazilir : 230
        toplama(3,4); // iki int'in toplami : 7
        toplama('a','b'); // iki int'in toplami : 195

        toplama(5,6,5.3); // 3 double'in toplami : 16.3


    }

    public static void toplama(int sayi1 , int sayi2){ // toplama int int

        System.out.println("iki int'in toplami : " + (sayi1+sayi2));
    }

    public static void toplama(double sayi1 , double sayi2){ // toplama double double
        System.out.println("double ile double'in toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(double b , int a){ // toplama double int
        System.out.println("double ve int'in toplami : " +(a+b));
    }

    public static void toplama(int sayi){
        System.out.println("tek int girilirse 2 kati yazilir : " + 2*sayi);
    }

    public static void toplama(int a,int b,int c){
        System.out.println("3 int'in toplami : " + (a+b+c)) ;
    }

    public static void toplama(double a,double b,double c){
        System.out.println("3 double'in toplami : " + (a+b+c)) ;
    }
}
