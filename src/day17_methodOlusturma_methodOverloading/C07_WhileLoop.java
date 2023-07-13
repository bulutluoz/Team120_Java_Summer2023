package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //          ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali



        boolean sonuc = false;

        while (sonuc == false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            String sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }

        System.out.println("Sifreniz basariyla kaydedildi");





    }

    public static boolean sifreKontrolEt(String sifre){

        int sayac = 0 ; // sayac hatalari saysin

        //         - ilk harf kucuk harf olmali
        char ilkHarf= sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("ilk karakter kucuk harf olmali");
            sayac++;
        }
        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        //         - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
            sayac++;
        }

        if (sayac == 0){
            return true;
        }else{
            return false;
        }

    }
}
