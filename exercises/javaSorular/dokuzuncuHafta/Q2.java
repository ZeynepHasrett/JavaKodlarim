package exercises.javaSorular.dokuzuncuHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {

    public static <ArrayListList> void main(String[] args) {

        /*
            Array list oluşturun daha sonra aşağıda belirtilen yerlere
            yeni array elemanlarını ekleyen java kodunu yazınız.

            Array List:  siyah,mavi,kirmizi,beyaz

            en başa: pembe
            mavi-kirmizi arasına yesil  renk eklenecek.

            Beklenen Çıktı:
            [pembe,siyah,mavi,yesil,kirmizi,beyaz]
         */

        ArrayList<String> renkler = new ArrayList<>();

        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");

        renkler.add(0, "pembe");
        renkler.add(3, "yesil");

        System.out.println(renkler);

    }

}
