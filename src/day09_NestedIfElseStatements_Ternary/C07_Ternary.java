package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        double sayi = scanner.nextDouble();

        System.out.println( sayi>0 ? sayi : -1*sayi);
    }
}
