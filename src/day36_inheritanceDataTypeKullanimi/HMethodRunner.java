package day36_inheritanceDataTypeKullanimi;

public class HMethodRunner {

    public static void main(String[] args) {

        GAvciKuslar avciKusKartal = new GAvciKuslar();
        // constructor ve data turu ayni ise ilk bulunan deger gecerlidir
        avciKusKartal.hareket(); // G ucarlar
        avciKusKartal.beslenme(); // G et yer
        avciKusKartal.pence(); // G pencelidir
        avciKusKartal.gaga(); // G sivri gagalidir
        avciKusKartal.kanat(); // F kanatlidir
        avciKusKartal.solunum(); // F Akciger
        avciKusKartal.cogalma(); // F Yumurtayla
        avciKusKartal.omur(); // E yasar ve olurler


        FKuslar kusKartal = new GAvciKuslar();
        // constructor ve data turu ayni degil ise
        // aramaya data turu olan class'dan baslanir ve bulunamazsa CTE verir
        // bulunursa, bulunan class'dan constructor'in oldugu class'a kadar
        // bu ozelligin daha guncel hali var mi diye kontrol edilir
        // ve varsa en guncel hali yazilir

        kusKartal.hareket(); // G ucarlar
        kusKartal.beslenme(); // G et yer
        // kusKartal.pence(); // B veya A'da yok CTE
        kusKartal.gaga(); // G sivri gagalidir
        kusKartal.kanat(); // F kanatlidir
        kusKartal.solunum(); // F Akciger
        kusKartal.cogalma(); // F Yumurtayla
        kusKartal.omur(); // E yasar ve olurler


        EHayvanlar hayvanKartal = new GAvciKuslar();
        hayvanKartal.hareket(); // G ucarlar
        hayvanKartal.beslenme(); // G et yer
        //hayvanKartal.pence(); // E'de olmadigi icin CTE
        //hayvanKartal.gaga(); // E'de olmadigi icin CTE
        //hayvanKartal.kanat(); // E'de olmadigi icin CTE
        hayvanKartal.solunum(); // F Akciger
        hayvanKartal.cogalma(); // F Yumurtayla
        hayvanKartal.omur(); // E yasar ve olurler
    }
}
