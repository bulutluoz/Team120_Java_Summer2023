package day39_interfaces;

import day37_overridin_pollymorphisim.AParent;

public class C01_ChildOf2Interfaces extends AParent implements I01_Interfaces,I02_Interfaces{


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public int method11() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method44() {

    }

    @Override
    public void method4() {

    }

    public static void main(String[] args) {

        System.out.println(sayi2);// 20
        System.out.println(I01_Interfaces.sayi4); // 40
    }
}
