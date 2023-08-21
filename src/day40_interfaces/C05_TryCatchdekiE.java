package day40_interfaces;

public class C05_TryCatchdekiE {

    public static void main(String[] args) {
        /*
            try catch blogundaki e
            yakalanan exception'in atandigi variable'dir

         */

        int a = 20;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException k) { // ArithmeticException e = yakalananException

            k.printStackTrace(); // exception'in tum bilgilerini yazdirir,
            // System.out.println(k.getMessage()); //  / by zero
            // System.out.println(k.toString()); // java.lang.ArithmeticException: / by zero


        }
    }
}
