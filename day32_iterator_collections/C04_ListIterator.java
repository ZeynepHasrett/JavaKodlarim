package day32_iterator_collections;

import java.util.*;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 5, 9, 6, 13, 15, 28, 42, 63, 80));

        // List icindeki elemanlarin her birini 5 artiralim

        int toplam = 0;

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {
            toplam += (Integer) itr.next();
        }

        System.out.println(toplam);
        System.out.println(sayilar);

        // Iteratıor'da en cok dikkat edilmesi gereken konu Iterator'in nerede oldugudur
        // Iterator objesi while ile sona kadar gittigi icin ayni Iterator ile bizim elemanlari silmemiz mumkun degildir
        // yeni bir Iterator olusturarak bu islemi yapabiliriz

        Iterator itr2 = sayilar.iterator();

        while (itr2.hasNext()) {
            itr2.next();
            itr2.remove();
        }

        System.out.println(sayilar);

        // iterator sinirli sayida method icerdigi icin
        // bu islemlerdeki gibi farkli Iterator'ler olusturmak gerekir
        // Java bu durumu cozmek adina Iterator'a child olan bir ListIterator olusturmustur

        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(1, 15, 63, 71, 34, 41, 35, 80));

        ListIterator listItr = sayilar2.listIterator();

        int toplam2 = 0;

        while (listItr.hasNext()) {
            toplam2 += (Integer) listItr.next();
        }

        System.out.println(toplam2);
        System.out.println(sayilar2);

        while (listItr.hasPrevious()) {
            listItr.previous();
            listItr.remove();
        }

        System.out.println(sayilar2);

    }

}
