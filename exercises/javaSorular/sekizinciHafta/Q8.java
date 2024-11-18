package exercises.javaSorular.sekizinciHafta;

import jdk.dynalink.linker.LinkerServices;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {

    public static void main(String[] args) {

        /*
            İki farklı Array'i birleştiren bir program yazınız.

            Örnekler:

            birlestir([1, 3, 5], [2, 6, 8])
            Çıktı : [1, 3, 5, 2, 6, 8]

            birlestir([7, 8], [10, 9, 1, 1, 2])
            Çıktı : [7, 8, 10, 9, 1, 1, 2]

            birlestir([4, 5, 1], [3, 3, 3, 3, 3])
            Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
         */

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 6, 8};

        birlestir(arr1, arr2);

    }

    public static void birlestir(int[] arr1, int[] arr2) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }

        System.out.println(list);

        /*
            2.yontem

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,6,8));

        list1.addAll(list2);
        System.out.println(list1);
       */

    }

}
