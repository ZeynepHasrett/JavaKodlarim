package exercises.javaSorular.onuncuHafta;

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
            2. TreeSet: [mavi,pembe,turuncu,yesil

            Karsilastirma Sonucu:
            no
            yes
            no
            yes
         */

        TreeSet<String> birinciTreeSet = new TreeSet<>();

        birinciTreeSet.add("mavi");
        birinciTreeSet.add("yesil");
        birinciTreeSet.add("kirmizi");
        birinciTreeSet.add("sari");

        TreeSet<String> ikinciTreeSet = new TreeSet<>();

        ikinciTreeSet.add("yesil");
        ikinciTreeSet.add("mavi");
        ikinciTreeSet.add("pembe");
        ikinciTreeSet.add("turuncu");

        System.out.println("1. TreeSet: " + birinciTreeSet);
        System.out.println("2. TreeSet: " + ikinciTreeSet);

    }

}
