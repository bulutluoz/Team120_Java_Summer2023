package day31_dateTime;

public class C07_Varargs {
    public static void main(String[] args) {

        islemYap(3,4,6,7,1,0); // 4
        islemYap(4,5,6); // 1
        islemYap(2,3); // 0

    }

    public static void islemYap(int sayi1, int sayi2, int... kalanlar){

        System.out.println(kalanlar.length);
    }


}
