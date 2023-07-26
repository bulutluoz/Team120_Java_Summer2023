package day27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();
        System.out.println(araba1);
        // Araba bilgileri ==> marka:'Marka belirtilmemis', model:'Model belirtilmemis', yil:1900, fiyat:0, renk:'Renk belirtilmemis'

        araba1.marka ="Mercedes";
        araba1.model = "E200";
        araba1.yil = 2010;
        araba1.fiyat = 15000;
        araba1.renk = "Siyah";

        System.out.println(araba1);
        // Araba bilgileri ==> marka:'Mercedes', model:'E200',
        //                      yil:2010, fiyat:15000, renk:'Siyah'

        // Her yeni obje olusturdugumuzda parametresiz default cons. calistigindan
        // o class'da instance variable'lara atanan degerleri alir
        // sonra bizim her variable icin yeniden atama yapmamiz gerekir

        // Bunun yerine constructor call'a parametre olarak degerler yazalim


        C03_Araba araba2 = new C03_Araba("BMW","5.20",2017,33000,"Mavi");

        System.out.println(araba2);
        // Araba bilgileri ==> marka:'BMW', model:'5.20',
        //                      yil:2017, fiyat:33000, renk:'Mavi'

        C03_Araba araba3 = new C03_Araba("Volvo","C40",2005,5000,"yesil");

        System.out.println(araba3);
        // Araba bilgileri ==> marka:'Volvo', model:'C40',
        //                      yil:2005, fiyat:5000, renk:'yesil'



        C03_Araba araba4 = new C03_Araba();
        System.out.println(araba4);
        // Araba bilgileri ==> marka:'Marka belirtilmemis', model:'Model belirtilmemis', yil:1900, fiyat:0, renk:'Renk belirtilmemis'






    }
}
