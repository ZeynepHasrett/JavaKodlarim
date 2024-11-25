package exercises.javaSorular.onuncuHafta;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Q7 {

    public static void main(String[] args) {

        /*
            Ortak elemanları olan 2 farklı TreeSet oluşturalım ve
            elemanlarını tek tek karşılaştırıp aynı olanlar için "yes"
                                               farklı olanlar için "no" yazdıralım.

            1. TreeSet: mavi,yesil,kirmizi,sari
            2. TreeSet: yesil,mavi,pembe,turuncu

            Beklenen Çıktı:
            1. TreeSet: [kirmizi,mavi,sari,yesil]
            2. TreeSet: [beyaz, mavi, turuncu, yesil]

            Karsilastirma Sonucu:
            no
            yes
            no
            yes
         */

        TreeSet<String> birinciTreeSet = new TreeSet<>(Arrays.asList("mavi", "yesil", "kirmizi", "sari"));
        System.out.println("1. TreeSet: " + birinciTreeSet);

        TreeSet<String> ikinciTreeSet = new TreeSet<>(Arrays.asList("yesil", "mavi", "beyaz", "turuncu"));
        System.out.println("2. TreeSet: " + ikinciTreeSet);

        Iterator itr1 = birinciTreeSet.iterator();
        Iterator itr2 = ikinciTreeSet.iterator();

        System.out.println("Karsilastirma Sonucu: ");

        while (itr1.hasNext() && itr2.hasNext()) {
            System.out.println(itr1.next().equals(itr2.next()) ? "yes" : "no");

        }

    }

}
