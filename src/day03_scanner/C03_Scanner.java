package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz");

        double girilenDouble = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenInt = scanner.nextInt();

        System.out.println("Iki sayinin toplami : " + (girilenInt + girilenDouble));
        System.out.println("Iki sayinin carpimi : " + girilenDouble*girilenInt);
    }
}
