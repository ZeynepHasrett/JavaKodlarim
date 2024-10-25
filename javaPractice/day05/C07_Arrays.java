package javaPractice.day05;

import java.util.Arrays;

public class C07_Arrays {

    public static void main(String[] args) {

        /*
            Bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
            input : 1,2,-3,4,-5,-6
            output :-1,-2,3,-4,5,6
        */

        int[] arr = {1, 5, 7, -9, 12, 23, -25, -65};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }

        System.out.println(Arrays.toString(arr));

    }

}
