package day19_scope;

public class C03_baskaClassdanClasslevelvariablelaraErisim {

    public static void main(String[] args) {

        System.out.println(C02_ClassLevelVariablelar.bls); // false
        System.out.println(C02_ClassLevelVariablelar.strs); // Java
        System.out.println(C02_ClassLevelVariablelar.sayis); // 0
        System.out.println(C02_ClassLevelVariablelar.chrs); // a


        C02_ClassLevelVariablelar obj = new C02_ClassLevelVariablelar();

        System.out.println(obj.bli); // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri); // ''


        System.out.println(obj.bls);
        System.out.println(obj.strs);


    }
}
