package exercises.javaSorular.onuncuHafta;

import java.util.HashSet;
import java.util.TreeSet;

public class Q2 {

    public static void main(String[] args) {

        /*
            Bir HashSet oluşturalım ve
            HashSet elemanlarını TreeSet'e dönüştürelim.
            TreeSet elemanlarını tek tek yazdıralım.

            HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

            Beklenen Çıktı:
            Tree Set Elemanlari:
            kirmizi
            mavi
            sari
            turuncu
            yesil
         */

        HashSet<String> renkler = new HashSet<>();

        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("turuncu");
        renkler.add("kirmizi");

        TreeSet<String> renklerTreeSet = new TreeSet<>(renkler);

        System.out.println("Tree Set Elemanlari:");

        for (String each : renklerTreeSet) {
            System.out.println(each);
        }

    }

}
