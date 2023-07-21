package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {

        // verilen bir array'in uzunlugunu bir artirarak
        // verilen bir element'i ekleyin

        int[] arr = {3,7,8};
        int eklenecekSayi = 10;


        // 1- once uzunlugu eski array'den bir fazla olan yeniArr olusturalim

        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0]

        // 2- arr'deki var olan elementleri, ayni index'lerle
        //    yeniArr'ye kopyalayalim

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        } // [3, 7, 8, 0]

        // 3- eklenecek elementi, yeniArr'in son index'ine atayalim

        yeniArr[yeniArr.length-1] = eklenecekSayi; // [3, 7, 8, 10]


        // 4- eski arr'ye yeni degeri atayalim

        arr = yeniArr;

        System.out.println("arr'nin son hali : "+Arrays.toString( arr));
        // arr'nin son hali : [3, 7, 8, 10]

    }

    public static int[] arrayeBirElemanEkle(int[] eskiArr , int eklenecekSayi){
        int[] yeniArr = new int[eskiArr.length+1];

        for (int i = 0; i < eskiArr.length ; i++) {

            yeniArr[i] = eskiArr[i];
        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        eskiArr = yeniArr;

        return yeniArr;
    }
}
