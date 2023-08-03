package day30_immutableClasses;

public class C01_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String a = "Ja";
        String b = "va";
        String str5 = a+b;
        String str6 = a.concat(b);


        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str6); // false
        System.out.println(str1 == "Java"); // true

        /*
            str1.equals(str2) ==> sadece metinlere bakar, metinler ayni ise true doner
            str1 == str2 hem metne, hem de referansa bakar. Metin ve referans ayni ise true doner

            yukaridaki orneklerde gorulecegi uzere
            bazi String objelerin referanslari da ayni olabilir
         */

        System.out.println("==========");

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true

    }
}
