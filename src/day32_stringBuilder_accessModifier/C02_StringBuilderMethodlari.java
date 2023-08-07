package day32_stringBuilder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da guzellesiyor");


        System.out.println(sb1.reverse()); // royisellezug ad ahad avaJ

        System.out.println(sb1); // royisellezug ad ahad avaJ
        sb1.reverse();

        System.out.println(sb1); // Java daha da guzellesiyor

        // sondaki harfi silelim
        sb1.deleteCharAt(sb1.length()-1);

        System.out.println(sb1); // Java daha da guzellesiyo

        sb1.delete(9,12);
        System.out.println(sb1); // Java daha guzellesiyo

        sb1.insert(sb1.length(),"r.");
        System.out.println(sb1); // Java daha guzellesiyor.

        String str= "Java da bundan memnun";
        sb1.insert(9,str,4,7);
        System.out.println(sb1); // Java daha da guzellesiyor.

    }
}
