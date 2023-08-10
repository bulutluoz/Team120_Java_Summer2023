package day35_inheritance;

public class FDoktor extends EMuhasebe{

    FDoktor(){
        super(3);
        System.out.println("Parametresiz Doktor constructor'i calisti");
    }

    FDoktor(String str){
        System.out.println("String Parametreli Doktor constructor'i calisti");
    }

    FDoktor(int sayi){
        this();
        System.out.println("Int Parametreli Doktor constructor'i calisti");
    }


    public static void main(String[] args) {

        FDoktor doktor1 = new FDoktor("Java");

        FDoktor doktor2 = new FDoktor();

        FDoktor doktor3 = new FDoktor(5);
    }

}
