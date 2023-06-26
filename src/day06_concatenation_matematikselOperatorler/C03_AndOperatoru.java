package day06_concatenation_matematikselOperatorler;

public class C03_AndOperatoru {


    public static void main(String[] args) {

        System.out.println( 5 > 3 && 6 > 4); // true and true ==> true

        System.out.println( 5 < 3 && 6 > 4); // false and true ==> false

        System.out.println( 5 > 3 && 6 <= 4); // true and false ==> false

        System.out.println(5 <= 3 && 6 <= 4); // false and false ==> false


        /*  && operatoru mukemmeliyetcidir

            && operatoru ile baglanan boolean ifadeler kac tane olursa olsun
           hepsi true ise sonuc true,
           bunun disindaki tum durumlarda false

           bu yonuyle matematikteki carpmaya benzer

           1 * 1 * 1 * 1 * 1 * 1 = 1
           1 * 0 * 1 * 1 * 1 * 1 = 0
           1 * 0 * 0 * 0 * 0 * 0 = 0

         */

        // bir sayinin hem 2, hem 3, hem de 5 ile bolunebilmesi lazim

        int sayi =24;

        System.out.println( sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0);
        //                  true          &&  true         && false ==> false


        // sayi 0 veya daha buyuk ve 100 veya daha kucuk olmalidir
        // sayi 0 ile 100 arasinda olmalidir(0 ve 100 dahil)

        System.out.println( sayi >= 0 && sayi <= 100);
        //                   true     && true ==> true
    }
}
