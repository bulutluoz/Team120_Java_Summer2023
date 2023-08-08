package day33_encapsulation_inheritance;

public class C01_Pazarlama {
    /*
        satis degeri girecekler
        satis girebilsin ama basklarinin girdigi satislari goremesin

        toplam satis degerini gormesi gerekenler gorsun ama
        toplam satis degeri goren kisiler tarafindan degistirilemesin
     */

    private int toplamSatis; // read only - sadece okunabilir
    private int satis; // write only - sadece yazilabilir

    /*
        yetki ayirimi yapacagimiz class'larda
        istedigimiz islemi bizim adimiza yapacak
        public method'lar olusturacagiz

        getter method'lari baska class'lar icin
        private variable'lara ulasir
        ve degerini o class'lara döndürür
     */

    public int getToplamSatis() {

        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatisaEkle();
    }

    private void toplamSatisaEkle(){
        toplamSatis += satis;
    }
}
