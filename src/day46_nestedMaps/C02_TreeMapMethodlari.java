package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> harfler = new TreeMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler); // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.tailMap("L")); // {L=10, T=5, Z=50}
        System.out.println(harfler.tailMap("C")); // {K=25, L=10, T=5, Z=50}

        System.out.println(harfler.tailMap("L", false));  // {T=5, Z=50}
        System.out.println(harfler.tailMap("C",false));   // {K=25, L=10, T=5, Z=50}

        System.out.println(harfler.headMap("T")); // {A=15, K=25, L=10}
        System.out.println(harfler.headMap("M")); // {A=15, K=25, L=10}

        System.out.println(harfler.headMap("T",true)); // {A=15, K=25, L=10, T=5}
        System.out.println(harfler.headMap("M",true)); // {A=15, K=25, L=10}


        // {A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.ceilingKey("K")); // K buyuk esit
        System.out.println(harfler.ceilingKey("N")); // T
        System.out.println(harfler.ceilingKey("U")); // Z

        System.out.println(harfler.higherKey("K")); // L buyuk
        System.out.println(harfler.higherKey("N")); // T
        System.out.println(harfler.higherKey("U")); // Z

        System.out.println(harfler.ceilingEntry("K")); //  K=25
        System.out.println(harfler.higherEntry("K"));  //  L=10


        // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.floorKey("K")); // K  kucuk esit
        System.out.println(harfler.floorKey("M")); // L

        System.out.println(harfler.lowerKey("K")); // A kucuk
        System.out.println(harfler.lowerKey("M")); // L

        // {A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.pollFirstEntry()); // A=15
        System.out.println(harfler); // {K=25, L=10, T=5, Z=50}

        System.out.println(harfler.pollLastEntry()); // Z=50
        System.out.println(harfler); // {K=25, L=10, T=5}

        System.out.println(harfler.descendingKeySet()); // [T, L, K]
        System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25}

        // harfler = harfler.descendingMap();

    }
}
