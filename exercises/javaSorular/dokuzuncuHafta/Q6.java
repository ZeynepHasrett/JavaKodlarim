package exercises.javaSorular.dokuzuncuHafta;

import java.util.LinkedList;

public class Q6 {

    public static void main(String[] args) {

        /*
            Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

            LinkedList elemanları: sari,mavi,mor,yesil,beyaz

            Beklenen Çıktı:
            sari
            mavi
            mor
            yesil
            beyaz
         */

        LinkedList<String> renkler = new LinkedList<>();

        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("mor");
        renkler.add("yesil");
        renkler.add("beyaz");

        for (int i = 0; i < renkler.size(); i++) {
            System.out.println(renkler.get(i));
        }

    }

}
