package day32_iterator_collections;

import java.util.*;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(9, 3, 5, 4, 6, 6, 7, 8));

        // index kullanmadan, listedeki tum elementlerinin toplamini yazdirin

        Integer sayi = 0;
        Integer toplam = 0;

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {

            sayi = (Integer) itr.next();

            toplam += sayi;

        }

        System.out.println("Toplam : " + toplam); // Toplam : 48

    }

}
