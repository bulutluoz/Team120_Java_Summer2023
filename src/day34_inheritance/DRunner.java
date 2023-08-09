package day34_inheritance;

public class DRunner {

    public static void main(String[] args) {

        Corolla corolla = new Corolla();
        // Corolla class'indaki ozellikler
        System.out.println(corolla.uretimYeri); // C Sakarya / Turkiye
        System.out.println(corolla.model); // C Corolla
        System.out.println(corolla.aku); // C Inci aku
        System.out.println(corolla.sanziman); // cvt

        // Toyota class'indaki ozellikler
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.lastik); // Tum toyota araclar pirelli lastik kullanir
        System.out.println(corolla.guvenlik);// Tum Toyota araclar extra guvenlik icerir
        System.out.println(corolla.fren); // Toyota araclar abs fren sistemi kullanir

        // Araba class'indan aldigi ozellikler
        System.out.println(corolla.yakit); // yakit turu belirtilmedi
        corolla.yakit ="Benzin";
        System.out.println(corolla.yakit); // Benzin
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // renk belirtilmedi



    }
}
