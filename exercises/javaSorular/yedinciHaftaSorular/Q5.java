package exercises.javaSorular.yedinciHaftaSorular;

import java.sql.Array;
import java.util.Arrays;

public class Q5 {

    public static void main(String[] args) {

        /*
            Methoda iki sayı girelim ve  bize bir array dönsün.
            Array elemanları 1.sayının 2.sayı kadar kendisi ile
            toplamından oluşsun.

            Test Data:
            arrayOfMultiples(7, 5)
            sonuc: [7,14,21,28,35]
         */

        System.out.println(Arrays.toString(arrayOfMultiples(7,5)));

    }

    public static int[] arrayOfMultiples(int sayi1, int sayi2) {

        int[] arr = new int[sayi2];

        /*
            1.yontem
            for (int i = 0; i < arr.length - 1; i++) {
                arr[0] = sayi1;
                arr[i + 1] += arr[i] + sayi1;
            }
        */

        for (int i = 1; i <= sayi2 ; i++) {
            arr[i - 1] = sayi1 * i;
        }

        return arr;

    }

}
