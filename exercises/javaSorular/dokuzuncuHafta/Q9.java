package exercises.javaSorular.dokuzuncuHafta;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q9 {

    public static void main(String[] args) {

        /*
                Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

                LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

                Beklenen Çıktı:
                Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
                LinkedList Tersi:
                mor
                beyaz
                kirmizi
                yesil
                mavi
                sari
         */

        LinkedList<String> renkler = new LinkedList<>();

        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("mor");

        System.out.println("Orijinal linked list: " + renkler);

        System.out.println("LinkedList Tersi:");

        int sonIndex = renkler.size();

        ListIterator<String> iterator = renkler.listIterator(sonIndex);

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }

}
