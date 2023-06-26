package day07_ifStatements;

public class C02_BagimsizifCumleleri {

    public static void main(String[] args) {
        /*
            Dikkat edilecekler
            1- eger boolean sarttan sonra {} kullanilmazsa
               Java if body'si olarak ilk ; e kadar olan bolumu alir
               digerleri if body'sinin disinda kalir
            2- if cumlesinde {} kullanmaz ve
               boolean sartin sonuna ; yazarsaniz
               if cumlesi hic bir islem yapmaz
               cunku body'si yoktur

               OZETLE
               if body'si tek satirdan olusuyorsa {} kullanmasaniz da olur
               ancak if body'si birden fazla satirdan olusuyorsa MUTLAKA {} kullanmalisiniz
         */

        int a = 35;
        int b = 30;

        if (a < b){
            System.out.println("a b'den kucuk 1");
            System.out.println("a b'den kucuk 2");
            System.out.println("a b'den kucuk 3");
        }


        if (a % 2 == 0)
            System.out.println("a 2 ile tam bolunuyor 1"); // ilk ; e kadar olan kisim if body'sidir
            System.out.println("a 2 ile tam bolunuyor 2"); // sonraki satirlarin if ile ilgisi yoktur
            System.out.println("a 2 ile tam bolunuyor 3");
    }
}
