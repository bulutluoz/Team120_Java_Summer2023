package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //        asagidaki formmatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz");

        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int girilenYas= scanner.nextInt();

        /*
        System.out.println("Isminiz : " + girilenIsim);
        System.out.println("Soyisminiz : " + girilenSoyisim);
        System.out.println("Yasiniz : " + girilenYas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
         */

        // sout icerisindeki bir String'in yazdirilmasina
        // alt satirdan devam edilmesini isterseniz
        // String'in alt satira gecmesini istediginiz kisminda \n yazin
        System.out.println("Isminiz : " + girilenIsim +
                "\nSoyisminiz : " + girilenSoyisim+
                "\nYasiniz : " + girilenYas+
                "\nKaydiniz basariyla tamamlanmistir.");

    }
}
