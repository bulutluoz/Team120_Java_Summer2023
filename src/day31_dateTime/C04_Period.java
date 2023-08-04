package day31_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {

        // Kullanicinin verdigi dogum tarihine gore
        // kullanicinin yasini yil ve ay olarak yazdiran bir program hazirlayin

        LocalDate dogumTarihi = LocalDate.of(1990,10,21);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P32Y9M14D

        System.out.println(Period.between(dogumTarihi, bugun).getYears()); // 32
    }
}
