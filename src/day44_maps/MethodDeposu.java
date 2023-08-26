package day44_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MethodDeposu {


    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }


    public static void isimSoyisimListesiYazdir(Map<Integer,String> ogrenciMap){

         Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Sira No   Isim  Soyisim");
        System.out.println("=======================");
        int siraNo= 1;

        for (String eachValue: valueCollection  // "Ali-Can-11-H-MF"
             ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            System.out.println(siraNo+" -   "+valueArr[0] + " " + valueArr[1]);
            siraNo++;
        }
    }

    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer,String> ogrenciMap,int sinif,String sube){

        //1- tum value'leri bir Collection olarak kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();
        //2- bir for-each loop ile herbir value'yu ele alalim

        System.out.println(sinif +".sinif " + sube + " subesindeki ogrenci listesi");
        System.out.println("=================================");
        for (String eachValue:valueCollection
             ) {

            //3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
            //   bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            //  "Ali-Can-11-H-MF"
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            //4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
            //   istenen bilgiyi, array'den index ile alabiliriz
            String sinifStr = sinif+"";

            if (valueArr[2].equals(sinifStr) && valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }

    }

    public static void isimSoyisimIleOgrenciBul(Map<Integer,String> ogrenciMap, String isim, String soyisim){

        Collection<String> valueCollection = ogrenciMap.values();

        for (String eachValue: valueCollection  // "Ali-Can-11-H-MF"
             ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            // isim , soyisim, sinif ve subelerini yazdirin

            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyisim)){

                System.out.println(valueArr[0] + " " + valueArr[1] + " "+ valueArr[2] + " "+ valueArr[3]);
            }

        }
    }

    public static void numaraIleOgrenciBilgisiyazdirma(Map<Integer,String> ogrenciMap,int ogrenciNo){

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF"

        // numarasi verilen ogrencinin isim, soyisim, sinif ve subesini yazdirin

        String[] istenenOgrenciArr = istenenOgrenciValue.split("-"); // // [Ali, Can, 11, H, MF]


        System.out.println("Isim : " + istenenOgrenciArr[0]+ ", " +
                           "Soyisim : " + istenenOgrenciArr[1]+ ", "+
                            "Sinif : " + istenenOgrenciArr[2]+ ", "+
                            "Sube : " + istenenOgrenciArr[3]);

    }

    public static void numaraliOgrenciListesiYazdir(Map<Integer,String> ogrenciMap){

        // butun key'leri kaydedelim
         Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]

        // bir for each loop ile tum key'leri elden gecirebilirim

        for (Integer eachKey: ogrenciKeySeti
             ) {

            // her bir key
            System.out.print(eachKey + " "); // 103

            // ve o key'in isim ve soyismini yazdiralim

            String valueStr= ogrenciMap.get(eachKey); // "Ali-Can-11-H-MF"
            String[] valueArr = valueStr.split("-"); // [Ali, Can, 11, H, MF]

            System.out.println(valueArr[0] + " " + valueArr[1]);
        }
    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        //map'de bir value'yu update etmek istersek
         Set<Integer> ogrenciKeySeti  = ogrenciMap.keySet();

         // for-each loop ile her bir key'e ait value'yu cagirip, istedigimiz update'i yapalim

        for (Integer eachKey: ogrenciKeySeti
             ) {

            //   1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
            //        - key ile value'yu cagiririz
            String eachValue = ogrenciMap.get(eachKey); // // "Ali-Can-11-H-MF"
            //        - value'yu array'e ceviririz
            String[] valueArr = eachValue.split("-");
            //        - array'de istedigimiz update'i yapariz // [Ali, Can, 11, H, MF]

            switch (valueArr[2]){
                case "9" :
                   valueArr[2] ="10";
                   break;
                case "10" :
                    valueArr[2] ="11";
                    break;
                case "11" :
                    valueArr[2] ="12";
                    break;
                case "12" :
                    valueArr[2] ="Mezun";
                    break;
            } // [Ali, Can, 12, H, MF]

            //    2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];
            //       "Ali-Can-12-H-MF"


            //    3- key ve yeni value'yu kullanarak, map'i update ederiz

            ogrenciMap.put(eachKey,yeniValue);

        }


         return ogrenciMap;

    }


    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {

    // update icin key ve value'nun ikisine de ihtiyacimiz var

        Set<Integer>  ogrenciKeySet = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]

        // her bir key'e ait value'yu cagirip, update edip, yeni haliyle map'e ekleyelim

        for (Integer eachKey: ogrenciKeySet // 101
             ) {

            String eachValue = ogrenciMap.get(eachKey); // "Ali-Can-11-H-MF"

            String[] valueArr = eachValue.split("-");// [Ali, Can, 11, H, MF]

            // artik array'de update yapabiliriz

            if (valueArr[4].equalsIgnoreCase(eskiBolum)){
                valueArr[4] = yeniBolum;
            }

            // update edilen array'i map'e value olarak koymak icin birlestirelim
            String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            // key var, value'nun update hali de var
            ogrenciMap.put(eachKey,yeniValue);

        }

        return ogrenciMap;
    }
}





        /*
        Elimizde map var
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF
        }

        1- bizden istenen bilgiler key'de mi yoksa value'da mi ?

        [
        Ali-Can-11-H-MF,
        Veli-Cem-10-K-TM,
        Ali-Cem-11-K-TM,
        Ayse-Can-10-H-MF,
        Sevgi-Cem-11-M-TM,
        Sevgi-Can-10-K-MF
        ]

        2- value icerisindeki bilgilere rahat ulasabilmek icin
           for each loop ile her bir value'yu alip split ile array'e cevirelim

           [Ali, Can, 11, H, MF]

         3- Eger sinif ve sube parametre olarak verilen ile ayni ise
            isim ve soyismi yazdir


         */



















