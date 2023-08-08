package day33_encapsulation_inheritance;

public class C02_SatinAlma {

    public static void main(String[] args) {
        C01_Pazarlama pazarlama = new C01_Pazarlama();

        /* eger Pazarlama'daki class uyeleri default access modifier'a sahip olursa
           hem deger atayabilirim, hem de sonuclari gorebilirim

           eger private yaparsam o zaman da hic bir sekilde erisilemez


        pazarlama.satis=200;
        System.out.println(pazarlama.satis); // 200
        pazarlama.toplamSatis = 500;
        System.out.println(pazarlama.toplamSatis); // 500

        Eger bir class uyesine,
        baska class'larin erisimini okuma(read / degeri gorme) ve yazma(write / deger atama) seklinde
        derecelendirmek istersek
        access modifier ile yapamayiz

         */

        /*
            Eger bir class uyesine erisimi read ve write olarak ayirmak istersek
            ilk yapilacak sey,
            access modifier ile erisimi engellemek
         */

        pazarlama.setSatis(100);
        pazarlama.setSatis(200);
        pazarlama.setSatis(400);

        System.out.println(pazarlama.getToplamSatis()); // 700
    }
}
