package day15_arrays;

import java.util.Arrays;

public class C09_ArraysMethodlari_sort {

    public static void main(String[] args) {

        /*
            Verilen Array'deki elementleri buyukten kucuge dogru siralayan Java kodu yaziniz
        */

        int[] arr = {1, 3, 9, 5, 4, 6};

        Arrays.sort(arr);

        int[] arrYeni = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            arrYeni[(arr.length - 1) - i] = arr[i];

        }

        System.out.println(Arrays.toString(arrYeni));

    }

}
