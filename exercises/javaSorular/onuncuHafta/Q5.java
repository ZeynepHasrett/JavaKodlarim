package exercises.javaSorular.onuncuHafta;

import java.util.TreeSet;

public class Q5 {

    public static void main(String[] args) {

        /*
            Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

            TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

            Beklenen Çıktı:
            Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
            ilk eleman: kirmizi
            son eleman: yesil
         */

        TreeSet<String> renkler = new TreeSet<>();

        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("turuncu");
        renkler.add("pembe");

        System.out.println("Orjinal Tree: " + renkler);

        System.out.println("ilk eleman: " + renkler.first());
        System.out.println("son eleman: " + renkler.last());

    }

}
