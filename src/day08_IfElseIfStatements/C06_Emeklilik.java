package day08_IfElseIfStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek , K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E' && yas>=65){
            System.out.println("Erkek emekli olabilir");
        }else if (cinsiyet == 'E' && yas<65){
            System.out.println("Erkek emekli olamaz, "+(65-yas) + " yil daha calismalisiniz");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas <60) {
            System.out.println("Kadin emekli olamaz, " + (60 -yas)+ " Yil daha calismalisin");
        }
    }
}
