package day27_parametreliConstructor_constructorCall;

public class C03_Araba {

    String marka = "Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";

    C03_Araba(){
        // Herhangi bir class'a gorunur bir constructor olusturursaniz
        // default constructor silinir
        // daha once default constructor'i kullanan baska class'larda
        // default cons.'in silinmesi  sorun olusturabilir
        // GENEL UYGULAMA OLARAK
        // bir class'a gorunur bir parametreli cons. olusturursak
        // soruna sebebiyet vermemek icin
        // default cons. yerine parametresiz bir cons. da olusturmaliyiz
    }



    C03_Araba(String mrk,String mdl,int yl,int fyt,String rnk){
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        renk = rnk;
    }






    public String toString() {
        return "Araba bilgileri ==> " +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'' ;
    }
}
