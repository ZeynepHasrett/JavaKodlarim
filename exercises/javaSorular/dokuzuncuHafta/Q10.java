package exercises.javaSorular.dokuzuncuHafta;

import java.util.Collections;
import java.util.LinkedList;

public class Q10 {

    public static void main(String[] args) {

        /*
            Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı
            yer değiştiren java kodunu yazınız.

            LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

            hint:  Collections.swap();

            Beklenen Çıktı:
            Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
            Swap sonrası durum: [siyah,kirmizi,beyaz,mavi,yesil,turuncu]
         */

        LinkedList<String> renkler = new LinkedList<>();

        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("turuncu");

        System.out.println("Orjinal LinkedList: " + renkler);

        Collections.swap(renkler, 0, 3);

        System.out.println(renkler);

    }

}
