package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {

    public static void main(String[] args) {
        // Ogrenciden notunu isteyin ve harf olarak basari notunu yazdirin
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu  degilse) 65 ve ustu ise BB,
        //(65 ve ustu  de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD


        /*
            Bir if - else if - else.... statement else ile bitmek zorunda degildir
            else ile biten kodlar, her durum icin mutlaka bir sonuc uretirler
            else ile bitmezse tum durumlari kapsamaz
            yani bazi degerler icin sonuc uretmeyebilir

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        }else if(not>=50){
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }


    }
}
