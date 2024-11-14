package exercises.javaSorular.dokuzuncuHafta;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q7 {

    public static void main(String[] args) {

        /*
            Bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki
            elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

            LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

            1. elemandan itibaren yazdıralım.

            Beklenen Çıktı:
            beyaz
            mavi
            yesil
            turuncu
         */

        LinkedList<String> renkler = new LinkedList<>();

        renkler.add("sari");
        renkler.add("beyaz");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("turuncu");

        int basPozisyonu = 1;

        ListIterator<String> iterator = renkler.listIterator(basPozisyonu);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
