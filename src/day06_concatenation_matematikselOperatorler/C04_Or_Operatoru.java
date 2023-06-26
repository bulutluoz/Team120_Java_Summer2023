package day06_concatenation_matematikselOperatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {

        /*  Or operatoru iyimserdir
            Yani tek bir true bile yeterli olur
            or operatorunde tum mantiksal ifadeler false ise sonuc false
            degilse sonuc true'dur


            Or operatoru matematikteki toplama islemine benzer
            toplanan sayilarda bir tane bile 0 olmayan varsa, sonuc sifir olmaz

            0 + 0 + 0 + 0 + 0 ==> 0
            2 + 0 + 0 + 0 +1  != 0
            1 + 1 + 1 + 3 + 5 != 0
         */

        System.out.println( 3 > 5 || 6 > 4); // false || true ==> true
        System.out.println( 3 < 5 || 6 > 4); // true  || true ==> true
        System.out.println( 3 < 5 || 6 < 4); // true  || false==> true
        System.out.println( 3 > 5 || 6 < 4); // false || false==> false


        int sayi = 24;
        // sayi 3 veya 5'e bolunmelidir

        System.out.println(sayi % 3 == 0 || sayi % 5 == 0);// true || false ==> true

        // sayi 0'dan buyuk veya 100'den kucuk olmalidir

        System.out.println(sayi>0 || sayi<100); // true || true ==> true




    }
}
