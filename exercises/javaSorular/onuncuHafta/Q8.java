package exercises.javaSorular.onuncuHafta;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q8 {

    public static void main(String[] args) {

        /*
            Bir Priority Queue oluşruralım, elemanlarını ekleyelim
            priority queue yazdıralım.

            priority queue elemanları: sari,yesil,mavi,kirmizi

            Beklenen Çıktı:
            Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
         */

        Queue<String> pOueue = new PriorityQueue<>();

        pOueue.add("sari");
        pOueue.add("yesil");
        pOueue.add("mavi");
        pOueue.add("kirmizi");

        System.out.println("Priority Queue elemanlari: " + pOueue);

    }

}




