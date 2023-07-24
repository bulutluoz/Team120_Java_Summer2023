package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenmeyenIsimleriSil {

    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun

        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};
        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            isimler.add(arr[i]);
        }
        System.out.println("isimler listesi : "+isimler);

        System.out.println(istenmeyenleriSil(isimler, "a"));

        // isimler listesinin kalici olarak yeni hali almasini istersek

        isimler = istenmeyenleriSil(isimler,"a");


    }

    public static List<String> istenmeyenleriSil(List<String> isimler,String istenmeyenHarf){

        /*
            isim sildigimizde index kayacaktir,
            bu da bazi elementlerin kontrol edilmemesine
            ve indexOutofBounds hatasina sebep olabilir

            verilen listeden isim silmek yerine
            baska bos bir liste olusturalim
            ve SILINMEYECEK elemanlari o listeye ekleyip
            yeni listeyi döndürelim
         */
        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i <isimler.size() ; i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniList.add(isimler.get(i));
            }
        }

        return yeniList;
    }
}
