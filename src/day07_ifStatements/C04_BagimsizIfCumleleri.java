package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir tamsayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 3 == 0){
            System.out.println("3 ile bolunebilen tamsayi");
        }

        if (girilenSayi % 5 == 0){
            System.out.println("5 ile bolunebilen sayi");
        }
    }
}
