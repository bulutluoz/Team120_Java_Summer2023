package day35_inheritance;

public class Corolla extends BToyota {

    Corolla(){// gorunur olarak cons.call yok
        // o zaman gorunmeyen super(); vardir
        System.out.println("Corolla parametresiz constructor calisti");
    }

    Corolla(String str){
        // gorunmeyen super(); var
        // Java'nin koydugu ve gorunur olmayan
        // constructor call HER ZAMAM parametresiz olan
        // super();
        // Kodu yazan kisiler isterlerse ilk satira
        // baska constructor call yazabilirler
        // eger ilk satirda gorunur bir cons.call varsa
        // java default olarak koydugu super();'u siler
    }

    String uretimYeri = "Sakarya / Turkiye";
    String model = "Corolla";
    String aku = "Inci aku";
    String sanziman = "Cvt";

    public static void main(String[] args) {

        Corolla corolla = new Corolla();

        Corolla corolla1 = new Corolla("Kirmizi");












        // bir objenin bir class'da olusturulan ozelliklere ulasmasi
        // ve o class'da atanan ilk degerlere sahip olmasi icin
        // o class'larin constructor'lari calismak ZORUNDADIR

        // extends keyword kullanilan bir class'da
        // olusturulan HER CONSTRUCTOR'in ilk satirinda
        // biz gorsek de gormesek de
        // CONSTRUCTOR CALL vardir.
        // Eger ilk satirda gorunur bir constructor call yoksa
        // Java'nin koydugu gorunmeyen super(); vardir.
























    }


}
