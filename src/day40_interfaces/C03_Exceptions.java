package day40_interfaces;

import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi isteyin
        // sayilari birbirne bolup, sonucu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        /*
        if (sayi2 == 0){
            System.out.println("Ikinci sayi SIFIR olamaz");
        }else {
            System.out.println(sayi1/sayi2);
        }
         */


        try {
            System.out.println(sayi1/sayi2); // riskli kod arithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ikinci sayi SIFIR olamaz");
        }


        /*
            Normal sartlarda kodumuzda bir sorun yok
            ama ISTISNAI olarak ikinci sayi = 0 verilirsa
            sayi / 0 tanimsiz oldugundan
            java ne yapacagini bilemez

            Kodumuzu yazarken bu ihtimali ongormeli
            ve bu istisna olustugunda
            ne yapmasi gerektigini Java'ya soylemelisiniz

            bu soruda bu istisnai durumu if-else ile cozebiliriz
            ama if-else her zaman ise yaramaz

            Java exception'lari yonetebilmemiz icin (handle) try -catch bloklari olusturmustur
            try - catch bloklari 3 bolumden olusur
         */
    }
}
