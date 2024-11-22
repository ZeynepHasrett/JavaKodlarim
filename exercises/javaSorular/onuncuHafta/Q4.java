package exercises.javaSorular.onuncuHafta;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Q4 {

    public static void main(String[] args) {

        /*
            Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım
            ve ardından  descendingIterator()  fonksiyonunu kullanarak
            ters sıradan yazdıralım.

            TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

            Beklenen Çıktı:
            Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

            Tersten Siralanisi:
            yesil
            turuncu
            sari
            mavi
            kirmizi
         */

        TreeSet<String> renkler = new TreeSet<>();

        renkler.add("yesil");
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        renkler.add("kirmizi");

        System.out.print("Orjinal Tree sonucu: ");
        System.out.println(renkler);

        System.out.println("Tersten Siralanisi:");

        Iterator<String> descendingIterator = renkler.descendingIterator();

        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

    }

}
