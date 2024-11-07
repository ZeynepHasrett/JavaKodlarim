package exercises.javaSorular.yedinciHaftaSorular;

import java.sql.Array;
import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {

        /*
            Bir arrayi tersine çeviren method yazınız.

            Test Data:
            reverse [1, 2, 3, 4]
            return  [4, 3, 2, 1]
         */

        int[] arr = {1, 2, 3, 4};

        int[] terstenArr = reverse(arr);

        System.out.println(Arrays.toString(terstenArr));

    }

    private static int[] reverse(int[] arr) {

        int[] tersArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            tersArr[(arr.length - 1) - i] += arr[i];
        }

        return tersArr;

    }

}
