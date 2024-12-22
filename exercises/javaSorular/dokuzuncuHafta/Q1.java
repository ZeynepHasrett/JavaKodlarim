package exercises.javaSorular.dokuzuncuHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {

        /*
            Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

            Array elemanları:  siyah,sari,mavi,turuncu

            Beklenen Çıktı:
            siyah
            sari
            mavi
            turuncu
         */

        ArrayList<String> renkler = new ArrayList<>();

        renkler.add("siyah");
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");

        for (String each : renkler) {
            System.out.println(each);
        }

    }

}


