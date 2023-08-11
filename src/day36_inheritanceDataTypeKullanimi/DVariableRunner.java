package day36_inheritanceDataTypeKullanimi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DVariableRunner {

    public static void main(String[] args) {

        CAvciKuslar avciKusKartal = new CAvciKuslar();
        System.out.println(avciKusKartal.hareket); // C Ucarlar
        System.out.println(avciKusKartal.beslenme); // C et yer
        System.out.println(avciKusKartal.pence); // C pencelidir
        System.out.println(avciKusKartal.gaga); // C sivri gagalidir
        System.out.println(avciKusKartal.kanat); // B kanatlidir
        System.out.println(avciKusKartal.solunum); // B akciger
        System.out.println(avciKusKartal.cogalma); // B Yumurtayla
        System.out.println(avciKusKartal.omur); // A yasar ve olur

        BKuslar kusKartal = new CAvciKuslar();
        System.out.println(kusKartal.hareket); // A hareket eder
        System.out.println(kusKartal.beslenme); // A beslenir
        // System.out.println(kusKartal.pence); // B veya A'da yok CTE
        System.out.println(kusKartal.gaga); // B gagalidir
        System.out.println(kusKartal.kanat); // B kanatlidir
        System.out.println(kusKartal.solunum); // B akciger
        System.out.println(kusKartal.cogalma); // B Yumurtayla
        System.out.println(kusKartal.omur); // A yasar ve olur

        AHayvan hayvanKartal = new CAvciKuslar();
        System.out.println(hayvanKartal.hareket); // A hareket eder
        System.out.println(hayvanKartal.beslenme); // A Beslenir
        // System.out.println(hayvanKartal.pence); // A'da yok CTE
        // System.out.println(hayvanKartal.gaga); // A'da yok CTE
        // System.out.println(hayvanKartal.kanat); // A'da yok CTE
        System.out.println(hayvanKartal.solunum); // A nefes alir
        System.out.println(hayvanKartal.cogalma); // A Cogalir
        System.out.println(hayvanKartal.omur); // A yasar ve olur




    }

    /*
        Java'da en klasik obje olusturma yontemi

        ClassAdi  obj = new ClassAdi();

        ama Child class'in constructor'i kullanilarak olusturulan objeler icin
        data turu Parent class'lar olarak secilebilir

        Eger constructor ve data turu farkli ise
        objenin ozelliklerini aramaya DATA TURU olan class'dan baslanir

        EGER ozellikler variable olarak olusturuldu ise
        objenin ozelliklerini DATA TURU belirler

     */
}
