package day34_inheritance;

public class HRunner {

    public static void main(String[] args) {

        GAvciKuslar avciKusKartal = new GAvciKuslar();

        // Avci kuslar class'indan aldigi ozellikler
        avciKusKartal.hareket(); // ucarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence(); // pencelidir
        avciKusKartal.gaga(); // sivri gagali

        // Kuslar class'indan aldigi ozellikler
        avciKusKartal.kanat(); // kanatlidirlar
        avciKusKartal.solunum(); // akcigerle nefes alirlar
        avciKusKartal.cogalma(); // yumurtayla cogalirlar

        // hayvanlar class'indan aldigi ozellikler
        avciKusKartal.omur();  // yasar ve olurler

        avciKusKartal.toString();
    }
}
