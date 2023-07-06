package day12_StringManipilation;

public class C03_isEmpty_isBlank {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "         ";
        String str3 = "    .     ";

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); // true  "" veya space'lerden mi olusuyor
        System.out.println(str2.isBlank()); // true

        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.isBlank()); // false
    }
}
