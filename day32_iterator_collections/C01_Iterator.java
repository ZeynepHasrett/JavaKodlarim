package day32_iterator_collections;

import java.util.Arrays;

public class C01_Iterator {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9};
        // her bir elemanini 2 artiralim

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }

        System.out.println(Arrays.toString(arr)); // [5, 7, 9, 11]


        // index kullanmadan her bir elemani 2 artiralim

        for (int each : arr){
            each += 2;
        }

        System.out.println(Arrays.toString(arr)); // [5, 7, 9, 11]

    }

}
