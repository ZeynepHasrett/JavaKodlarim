package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 8, 1};

        arr[2] = 10;

        System.out.println(arr[4]); // 1


        // arr'deki tum elementleri toplayin

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];
        }

        System.out.println("Array'deki elementlerin toplami : " + toplam); // 27


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 6, 8, 1, 4, 0));

        // sayilar listesinin 2. index'indeki sayiyi yazdirin
        sayilar.get(2); // 8


        // sayilar listesindeki tum elementleri toplayin
        toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);

        }

        System.out.println("Listedeki elementlerin toplami : " + toplam); // 22


        System.out.println(sayilar); // [3, 6, 8, 1, 4, 0]

        // 2. index'teki elementi 5 yapin
        System.out.println(sayilar.set(2, 5));

        System.out.println(sayilar); // [3, 6, 5, 1, 4, 0]


        // 4.index'teki elementi yazdirin
        System.out.println(sayilar.get(4)); // 4

        // sayilar listesindeki 4. index'teki elementi 11 yap
        sayilar.set(4, 11);
        System.out.println(sayilar); // [3, 6, 5, 1, 11, 0]

        // sayilar listesindeki 4. index'e 23 ekleyin
        sayilar.add(4, 23);
        System.out.println(sayilar); // [3, 6, 5, 1, 23, 11, 0]

        /*
            add() methodu yeni bir element ekler, element sayisi 1 artar
            ve eklendigi index'ten sonraki elementler 1 geriye itilir

            set() methodu yeni element eklemez, listenin eleman sayisi ayni kalir
            sadece verilen index'teki element update edilmis olur
         */

    }

}
