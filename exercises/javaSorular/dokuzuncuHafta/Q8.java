package exercises.javaSorular.dokuzuncuHafta;

import java.util.LinkedList;

public class Q8 {

    public static void main(String[] args) {

        /*
            Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım.

            LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

            Beklenen Çıktı:

            Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
            Listenin ilk elemani: sari
            listenin son elemani: beyaz
         */

        LinkedList<String> renkler = new LinkedList<>();

        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("beyaz");

        System.out.println("Orjinal list elemanlari: " + renkler);

        System.out.println("Listenin ilk elemani: " + renkler.getFirst());
        System.out.println("Listenin son elemani: " + renkler.getLast());

    }

}
