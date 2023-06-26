package day07_ifStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {
        /*
            Bagimsiz if cumleleri
            isminden de anlasilacagi uzere
            kodun kalani ile ilgilenmez

            sadece boolean sarta odaklanir
            sartin sonucu true ise if body'si calisir
            bolean sartin sonucu false ise
            if body'si devreye girmez

            YANIII

            birden fazla bagimsiz if cumlesi olan bir kod calistiginda
            kac tane if body'sinin calisacagi verilen degerlere baglidir

            tum if body'leri calisabilir
            bazilari calisabilir
            ya da hic bir if body'si calismayabilir

         */

        int a = -201;
        int b = 104;

        if (a>0){ // false
            System.out.println("a sayisi pozitif");
        }

        if (a+b>100){ // false
            System.out.println("sayilarin toplami 100'den buyuk");
        }

        if (b % 3 == 0){ // false
            System.out.println("b 3 ile tm bolunen bir tamsayidir");
        }

        if (b<100){ // false
            System.out.println("b 100'den kucuk bir tamsayidir");
        }


    }
}
