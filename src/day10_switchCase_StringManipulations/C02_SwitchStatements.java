package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan gun numarasini alip
        //        hafta ici veya hafta sonu yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gun numarasi 1-7 arasinda olmalidir");

        }
    }
}
