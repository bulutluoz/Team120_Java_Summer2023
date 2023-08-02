package day29_passByValue;

import java.util.Arrays;

public class C04_PassByValueCokluElement {

    public static void main(String[] args) {

        /*
            Java "pass by value" konseptini kullanir
            pbv "method'lar arasinda variable'in kendisinin degil
            value'sunun gecisini saglamak" anlamina gelir

            pbv'de hata yapmamak icin dikkat etmemiz gereken durum
            method'lar arsainda yollanan argument veya return degerinin
            tek bir element mi yoksa coklu element iceren bir java yapisi mi oldugudur.

            - eger tek bir element ise
              gittigi method'da yapilan degisiklik KALICI OLMAZ
              illa da kalici olsun dersek
              method call yaptigimiz satirda atama yapmaliyiz

            - eger method'lar arasindaki gecisi yapan coklu element iceren bir yapi ise
              * eger objenin kendisine degil elementlerine atama yapilirsa degisiklik KALICI olur
                (yolcular degisti)
              * ancak objenin kendisine yeni bir deger atamasi yapilirsa
                degisiklik KALICI olmaz (araba degisti)
         */
        /*  verilen bir int array'in
            elementlerini 2 katina cikarip yazdiran
            bir method olusturun
         */

        int[] arr = {3,4,5};
        System.out.println("main method'da call'dan once arr  : "+Arrays.toString(arr));
        elementleriArtir(arr);
        System.out.println("main method'da call'dan sonra arr  : "+Arrays.toString(arr));

        /*
          verilen array'e 10 degerini element olarak ekleyip
          yazdiran bir method olusturun
         */

        System.out.println("=========================");
        int[] arr2 = {3,4,5};

        System.out.println("main method'da call'dan once arr  : "+Arrays.toString(arr2));
        elementEkle(arr2);
        System.out.println("main method'da call'dan sonra arr  : "+Arrays.toString(arr2));
    }

    public static void elementEkle(int[] arr2){

        int[] yeniArr = new int[arr2.length+1]; // [0, 0, 0, 0]

        for (int i = 0; i < arr2.length; i++) {
            yeniArr[i] = arr2[i];
        }

        yeniArr[yeniArr.length-1] = 10;

        arr2 = yeniArr; // [3, 4, 5, 10]

        System.out.println("method'da arr2'nin yeni hali : " + Arrays.toString(arr2));
    }






    public static void elementleriArtir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i]*2;
        }

        System.out.println("method'da degistirilen arr  : "+Arrays.toString(arr));
    }


}
