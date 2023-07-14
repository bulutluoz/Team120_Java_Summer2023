package day18_whileLoop_DoWhileLoop;

public class C03_StringiTerseCevirme {

    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.

        System.out.println(metniTerseCevir("Bu is bu kadar"));

        System.out.println(metniTerseCevir("ey edip adanada pide ye"));


    }


    public static String metniTerseCevir(String metin){

        String tersMetin  = "";

        int index = metin.length()-1;

        while(index >= 0){

            tersMetin += metin.charAt(index);
            index--;

        }

        return tersMetin;
    }
}
