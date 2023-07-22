package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        // Bir list olusturma
        // <> icerisine data turu yazilmalidir
        // data turu PRIMITIVE data turleri OLAMAZ

        // List<String> isimler = new List(); List abstract oldugu icin bu sekilde yazilmaz

        List<String> isimler = new ArrayList<>();
        ArrayList<String> isimler2 = new ArrayList<>();
        // ikinci yazim bicimi cok kullanilmaz

        // Her list olusturuldugunda bos olarak olusturulur
        // sonra elementler tek tek eklenir

        System.out.println(isimler); // []

        isimler.add("Burhan");
        isimler.add("Seref");
        isimler.add("Gulsah");

        System.out.println(isimler); //  [Burhan, Seref, Gulsah]
        // elementler ekleme sirasina gore dizilir

        // eger en sona degil de istedigimiz bir index'e element eklemek istersek

        isimler.add(2,"Nergiz");
        System.out.println(isimler); // [Burhan, Seref, Nergiz, Gulsah]

        isimler.add(1,"Omer");
        System.out.println(isimler); // [Burhan, Omer, Seref, Nergiz, Gulsah]

        isimler.addAll(2,isimler);

        System.out.println(isimler);
        // [Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah]

        System.out.println(isimler.add("Eyup")); // true
        System.out.println(isimler);
        // [Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah, Eyup]


    }
}
