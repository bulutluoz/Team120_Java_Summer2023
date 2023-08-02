package day28_constructorCall;

public class C01_ConstructorCall {

    /*
        java'da bir constructor'in icinde baska bir constructor'i cagirmamiz gerekebilir
        bu durumda
        C01_ConstructorCall(4);  yazarsak,
        Java bunu cons. call olarak degil, method call olarak kabul eder

        Eger bir constructor'in icinden baska bir constructor cagirmamiz gerekirse
        ClassIsmi(ilgiliArgumentler) yerine this(ilgiliArgumentler) kullanilir
     */

    C01_ConstructorCall (){
        System.out.println("Parametresiz constructor calisti");
    }

    C01_ConstructorCall(String str){

        this(11);// constructor call

        C01_ConstructorCall(4); // method call
        System.out.println("String parametreli constructor calisti");
    }

    C01_ConstructorCall(int a){
        System.out.println("int parametreli constructor calisti");
    }

    static void C01_ConstructorCall(int sayi){
        System.out.println("int parametresi olan method calisti");
    }

    public static void main(String[] args) {
        C01_ConstructorCall obj1 = new C01_ConstructorCall("Merhaba Televole");

        // new C01_ConstructorCall(4);  // constructor
        // C01_ConstructorCall(4); // method

    }
}
