package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {

        // Soru 6-
        //         verilen pozitif bir  tamsayiyi
        //         tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.


        System.out.println(pozitifTamBolenlerListesi(20));
        System.out.println(pozitifTamBolenlerListesi(120));
        System.out.println(pozitifTamBolenlerListesi(1345));
    }

    public static List<Integer> pozitifTamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;
    }
}
