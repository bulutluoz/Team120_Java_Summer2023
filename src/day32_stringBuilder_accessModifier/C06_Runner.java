package day32_stringBuilder_accessModifier;

public class C06_Runner {

    public static void main(String[] args) {

        C05 obj = new C05();

        // System.out.println(obj.privateSayi);
        // private class uyelerine class disindan hic bir sekilde ulasilamaz

        System.out.println(obj.defaultSayi); // 0
        obj.defaultSayi = 20;
        System.out.println(obj.defaultSayi); // 20

        System.out.println(obj.protectedSayi); // 0
        obj.protectedSayi = 30;
        System.out.println(obj.protectedSayi); // 30

        System.out.println(obj.publicSayi); // 0
        obj.publicSayi = 50;
        System.out.println(obj.publicSayi); // 50
    }
}
