package day26_forEachLoop_constructor;

public class C07_Runner {
    public static void main(String[] args) {

        C04 obj;
        // deklarasyon vardir ama ete kemige burunmus bir obje yoktur

        new C04();
        // objeyi olusturduk ama sonraki satirlarda kullanamayiz
        // cunku bir obje'ye atamadik


        System.out.println(new C04().sayi); // 10

        C04 obj2 = new C04();

    }
}
