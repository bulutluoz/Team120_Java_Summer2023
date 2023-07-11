package day15_nestedForLoop_MethodOlusturma;

public class C06_KendiSubStringimiz {

    public static void main(String[] args) {

        String str = "Java Candir";
        int baslangic= 5;
        int bitis = 7 ;

        /*
        Verilen String ve baslangic,bitis degerlerini dikkate alarak
        1- bitis degeri baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic veya bitis degerleri index degerleri ile uyusmuyorsa hata mesaji
        3- degerler uygunsa baslangic index'inden(dahil), bitis index'ine(haric) kadar
           karakterleri yazdirin
         */

        if (baslangic > bitis){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }else if(baslangic<0 || bitis<0 || baslangic>=str.length() || bitis>=str.length()){
            System.out.println("Indexler hatali");
        }else{
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(str.charAt(i));
            }
        }


        System.out.println(str.substring(baslangic,bitis));

        str.substring(5);
        /*
            Bu method bize "Candir" döndürür
            ancak
            yazdırmazsak veya bır variable'a atamazsak
            bu method'un dondurdugu sonuc bir ise yaramaz
         */

        String strIstenenBolum = str.substring(5); // kaydeder ama yazdirmaz

        System.out.println(str.substring(5)); // yazdirir ama kaydetmez
    }
}
