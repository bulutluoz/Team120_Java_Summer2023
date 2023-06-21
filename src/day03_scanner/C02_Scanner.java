package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alip, karesini yazdirin

        // Sccanner ile kullanicidan bir bilgiyi 3 adimda alabiliriz
        // 1.adim : scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

        // 2.adim : Kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen bir tamsayi giriniz");

        // 3.adim istediginiz datanin turune uygun bir variable olusturun
        //        ve scanner objesini kullanark uygun method'la
        //        kullanicinin girdigi degeri alin

        int girilenSayi = scanner.nextInt();

        // artik kullanicinin girdigi sayi kod ortamimiza kaydedildi
        // bu variable'i istedigimiz sekilde kullanabiliriz

        System.out.println("Girilen sayinin karesi : " +girilenSayi*girilenSayi);

    }
}
