package day27_parametreliConstructor_constructorCall;

public class C05_Araba {

    String marka = "Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";

    public C05_Araba() {

    }

    public C05_Araba(String marka, String model, int yil, int fiyat, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.renk = renk;
    }

    public C05_Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public C05_Araba(String marka, int yil, int fiyat) {
        this.marka = marka;
        this.yil = yil;
        this.fiyat = fiyat;
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
