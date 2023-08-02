package day29_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        int sayi = 10;

        /*
            verilen sayiyi asagidaki kriterlere gore degistiren
            bir method olusturun

            - eger sayi cift ise 2 katina cikarin
            - eger sayi tek ise 5 ekleyin
         */

        System.out.println("method call'dan once sayi : " + sayi);

        sayi = sayiyiDegistir(sayi);

        System.out.println("method call'dan sonra sayi : " + sayi);
    }


    public static int sayiyiDegistir(int sayi){

        if (sayi%2 == 0){
            return 2*sayi;
        }else {
            return sayi+5;
        }
    }
}
