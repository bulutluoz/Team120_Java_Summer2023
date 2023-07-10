package day14_forLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri icin pozitif bir tamsayi giriniz");
        int baslangic= scanner.nextInt();

        System.out.println("Lutfen bitis degeri icin pozitif bir tamsayi giriniz");
        int bitis= scanner.nextInt();

        int toplam = 0 ;

        if (baslangic < bitis){

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;
            }

        }else {

            for (int i = bitis; i <=baslangic ; i++) {
                toplam += i ;
            }

        }

        System.out.println("Sinirlar arasindaki sayilarin toplami : " + toplam);
    }
}
