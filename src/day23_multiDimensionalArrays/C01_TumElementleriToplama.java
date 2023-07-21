package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {

    public static void main(String[] args) {

        int[] arrTek = {3,7,1,9,2,5};
        // Bu array'in tum elementlerini toplayin

        int toplam = 0;

        for (int i = 0; i < arrTek.length; i++) {

            // arrTek[i]  index degistikce bize array'deki tum elementleri sirasiyla getirir

            toplam += arrTek[i];
        }

        System.out.println("arrTek'in elementleri toplami : " + toplam);


        int[][] sayilar = {{1,2,5},{7,4},{9},{3,0,1,6,8}};

        // arr[i] inner array'leri getirir
        // arr[i][j] bize int elementleri verir
        // yani kat sayisi kadar index'e yani forLoop'a ihtiyacimiz var

        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) { // disardaki forLoop outer Array'i kontrol eder

            for (int j = 0; j < sayilar[i].length ; j++) { // icerdeki forLoop inner array'leri kontrol eder

                // sayilar[i][j] sirasiyla her bir int elementi getirir

                toplam += sayilar[i][j];

            }
        }

        System.out.println("sayilar array'inin elementleri toplami : " + toplam);


    }
}
