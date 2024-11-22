package exercises.javaSorular.onuncuHafta;

import java.util.TreeSet;

public class Q6 {

    public static void main(String[] args) {

        /*
            Bir TreeSet oluşturalım ve Tree Listesini ve
            listedeki eleman sayısını yazdıran java kodunu yazdıralım.

            TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

            Beklenen Çıktı:

            Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
            Tree eleman sayısı: 5
         */

        TreeSet<String> renkler = new TreeSet<>();

        renkler.add("yesil");
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("pembe");

        System.out.println("Orjinal TreeSet: " + renkler);

        System.out.println("Tree eleman sayısı: " + renkler.size());

    }

}
