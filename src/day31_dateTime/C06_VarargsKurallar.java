package day31_dateTime;

public class C06_VarargsKurallar {

    public static void main(String[] args) {

        // kullanici kac tane argument verirse versin
        // ilk element haric diger elementleri toplayip
        // bulunan toplami ilk element ile carpip, sonucu yazdiran bir method olusturun

        islemYap(3,4,5); // 27
        islemYap(2,4,7,8,9,1); // 58
    }

    public static void islemYap(int ilkSayi, int... kalanlar) {

        int toplam =0;
        for (int eachSayi: kalanlar
             ) {
            toplam += eachSayi;
        }

        int sonuc = ilkSayi * toplam ;

        System.out.println("Istenen islemin sonucu : " + sonuc);
    }

    /*
        Varargs sinirsiz sayida element alabildiginden
        gelen her elemani alacaktir

        Bu ozelliginden dolayi, varargs bir method'da parametre olarak kullanilacaksa
        SON PARAMETRE olarak yazilmak zorundadir.

        bu kuralin dogal sonucu olarak bir method'da birden fazla varargs parametre olamaz
     */


}
