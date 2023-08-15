package day37_overridin_pollymorphisim;

public class BChild extends AParent{

    final static int SAYI = 10;
    final static int SAYI2=20;

    /*
    public final void finalMethod(){
        // final method override edilemeyen method demektir
        System.out.println("Bu child class'daki bir final method");
    }

     */

    public static void staticMethod(){
        System.out.println("Bu child class'daki bir static method");
    }

    private void privateMethod(){
        // parent class'daki private method'lar child class'lardan kullanilamaz
        // child class kendisinde olusturulan bu method'u parent class'da olmayan bir yeni method kabul eder
        // CTE vermiyor ama overriding oklari da yok
        System.out.println("Bu child class'daki bir private method");
    }

    public static void main(String[] args) {

        System.out.println(SAYI);
        // sayi= 20; final variable son degerini almis demektir dolayisiyla yeni deger atanamaz

        System.out.println(Integer.MIN_VALUE);
    }


}
