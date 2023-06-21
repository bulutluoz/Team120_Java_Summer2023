package day03_scanner;

public class C01_NamingConvention {

    public static void main(String[] args) {
        // Java case sensitive(buyuk kucuk harf duyarli)'dir.
        int sayi = 10;

        // int sayi = 20;
        // long sayi = 345;

        int Sayi = 25;
        int SAYI = 23;
        int sAYi = 45;

        System.out.println(sAYi); // 45
        System.out.println(SAYI); // 23

        // Variable isimleri kucuk harfle baslar
        // buyuk harfle baslarsaniz Java kabul eder
        // ancak genel kullanima aykiridir.


        // int sa yi = 34;
        // int sa&yi = 45;

        int say_i = 34;
        int sayi12345 = 12345;
        int sa$yi = 21;
        // int sa.yi = 65;

        // $ ve _ isimde kullanilabilir ama ilk harf olarak kullanilmasi
        // naming convention'a uygun degildir
        int _sayi = 75;
        int $sayi = 87;
        // int 45sayi = 67;

        // birden fazla kelimeden olusan bir isim varsa camelCase kullanilir
        int sinifinEnYuksekNotu = 99;
        int maxSayi=123;



    }
}
