package day29_passByValue;



public class C01_staticBlocks {


    C01_staticBlocks(){
        System.out.println("parametresiz constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        C01_staticBlocks obj = new C01_staticBlocks();
        System.out.println("obje olusturuldu");
    }

    static {
        System.out.println("static blok 1 calisti");
    }

    static {
        System.out.println("static blok 2 calisti");
    }

    {
        System.out.println("static olmayan blok calisti");
        // obje olusturuldugunda calisir
    }

}
