package day15_nestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        int satir = 5;
        int sutun = 7 ;

        // dikdortgen bicimde, satir ve sutun numaralarini yazdiralim

        for (int i = 1; i <=satir ; i++) { // satir

            for (int j = 1; j <=sutun ; j++) { // sutun

                System.out.print(i + ","+j + "    ");
            }
            System.out.println("");
        }


        // ucgen icin satir ve sutun numaralarini yazdiralim

        for (int i = 1; i <=satir ; i++) { // satir

            for (int j = 1; j <=i ; j++) { // sutun
                System.out.print(i + ","+j + "    ");
            }
            System.out.println("");
        }
    }
}
