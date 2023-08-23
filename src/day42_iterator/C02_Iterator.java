package day42_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        // index kullanmadan 10'dan buyuk olan elementleri silin


        Iterator itr = sayilar.iterator();

        while (itr.hasNext()){

            Integer sayi = (Integer) itr.next();
            if (sayi>10){
                itr.remove();
            }
        }

        System.out.println(sayilar);


        sayilar = new ArrayList<>();

        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(24);
        sayilar.add(13);
        sayilar.add(11);

        // for loop kullanarak 10'dan buyuk sayilari silin

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i)>10){
                sayilar.remove(i);
            }
        }

        System.out.println(sayilar); // [23, 13]

    }
}
