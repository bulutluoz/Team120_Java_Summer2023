package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis = new FileInputStream("src/day41_exceptions/dosya.txt");


        // String str = 23;   CTE
        // List<String> liste = new List<>();  CTE
    }

    /*
        Java'daki FileInputStream class'i
        bilgisayarimizda var olan herhangi bir dosyaya erismek icin kullanilir

        FileInputStream class'indan olusturdugumuz
        fis objesinin, istedigimiz dosyayi bulabilmesi icin
        obje olusturulurken, istedigimiz dosyanin DOSYA YOLUNU parametre olarak vermeliyiz.

        Java dosya okuma islemini yapmasini istedigimizde
        o dosyaya erisememe durumunda ne yapilmasi gerektigini bilmek ister
        bunun icin de kodun altini kirmizi cizer

        Compile Time Exceptions (Checked Exceptions) icin 2 ihtimal vardir
        1- standart exceptions gibi try - catch blogu ile sarmalayabiliriz
           try - catch ile exception durumunda ne yapacagini soyleriz
           dolayisiyla kodlarimiz exception olussa bile calismaya devam eder (handle)

        2- Eger exception olustugunda kodun calismaya devam etmesini ISTEMIYORSAK
           veya kodumuzdan emin oldugumuz icin bu riski onemsemiyorsak
           exception'i handle etmek yerine
           Java'ya SEN CALISMANA BAK, biz exception riskinin farkindayiz demek istiyorsak
           method deklarasyonuna THROWS keyword ile bekledigimiz exception'i yazabiliriz

     */
}
