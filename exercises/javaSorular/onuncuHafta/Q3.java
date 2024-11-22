package exercises.javaSorular.onuncuHafta;

import java.util.TreeSet;

public class Q3 {

    public static void main(String[] args) {

        /*
             Bir TreeSet oluşturalım ve tüm elemanlarını tek tek yazdıralım.

            TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

            Beklenen Çıktı:
            beyaz
            kirmizi
            mavi
            sari
            siyah
            yesil
         */

        TreeSet<String> renkler = new TreeSet<>();

        renkler.add("yesil");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("sari");
        renkler.add("beyaz");
        renkler.add("siyah");

        for (String each : renkler) {
            System.out.println(each);
        }

    }

}
