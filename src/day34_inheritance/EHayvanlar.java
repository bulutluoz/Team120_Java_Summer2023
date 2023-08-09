package day34_inheritance;

public class EHayvanlar {

    // Bir class olusturulurken
    // ilerde child class'lar olabilir diye dusunuyorsaniz
    // sadece child class'larin ulasmasini istediginiz method'lari
    // protected access modifier ile olusturabilirsiniz
    protected void hareket(){
        System.out.println("hareket ederler");
    }

    protected void solunum(){
        System.out.println("nefes alirlar");
    }

    protected void beslenme(){

        System.out.println("beslenirler");
    }

    protected void cogalma(){

        System.out.println("cogalirlar");
    }

    protected void omur(){

        System.out.println("yasar ve olurler");
    }
}
