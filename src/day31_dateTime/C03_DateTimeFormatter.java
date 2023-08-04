package day31_dateTime;

import com.sun.jdi.LocalVariable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-08-04T20:23:38.235681

        // program calistigi zamandaki tarihi gun / ay / yil seklinde yazdirin
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(tarihSaat.format(dtf)); // 04 / 08 / 2023

        // saati saat : dakika  seklinde yazdirin

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH : mm a");

        System.out.println(tarihSaat.format(dtf2)); // 20 : 37 PM



         /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini


		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar


		 */

    }
}
