package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayinin tek mi cift mi oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("Tek sayi");
        }


        /*
            If else ile yapabilecegimiz
            basit islemleri
            daha kisa olarak yazabilmek icin ternary kullanilir
         */

        System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Tek Sayi");

    }
}
