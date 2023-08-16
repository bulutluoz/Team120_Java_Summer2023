package day38_abstractClasses;

public abstract class A_KuralciParent {

    public void method1(){
        System.out.println("parent method 1");
    }
    public void method2(){
        System.out.println("parent method 2");
    }
    public abstract void method3();

    public abstract void method4();

    public abstract void method5();

    public void method6(){
        System.out.println("parent method 6");
    }
    /*
        Eger parent class'i child class'lar icin bir cati class yapiyorsak
        ve parent class'a extends yapan tum child class'larin bazi method'lari
        kendisine uyarlamaya MECBUR ETMEK istiyorsak ABSTRACTION kullaniriz

        1- Bir class'in bu ozellikleri saglamasi icin abstract olmasi lazim
            - Abstract class - Kismi abstraction
              bazi methodlari child'larin uyarlamasini mecbur eder
              bazilarini serbest birakir
            - Interface - full abstraction
              tum method'lari child'larin kendisine uyarlamasini mecbur eder
        2- bir class'i abstract class yapmak isterseniz
           deklarasyonuna abstract yazmalisiniz
        3- child class'larin mecburen uyarlamasini istedigimiz method'lari abstract method yapiyoruz
           mecburen uyarlanmasini istemedigimiz, karari child class'a biraktigimiz method'lari
           bugune kadar yaptigimiz sekilde birakiyoruz
     */
}
