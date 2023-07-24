package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {

    static Scanner scanner;
    static String girilenIsim;


    public static void main(String[] args) {
        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        //        bir method olusturun.

        System.out.println(listOlustur());

    }

    public static List<String> listOlustur(){

        List<String> isimList = new ArrayList<>();

        do {
           scanner = new Scanner(System.in);
            System.out.println("Listeye eklemek icin isim giriniz,\nBitirmek icin Q'ya basiniz");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimList.add(girilenIsim);
            }

        }while(!girilenIsim.equalsIgnoreCase("q"));


        return isimList;
    }
}
