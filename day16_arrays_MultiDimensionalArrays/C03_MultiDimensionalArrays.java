package day16_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_MultiDimensionalArrays {

    public static void main(String[] args) {

        // Array'lerde herhangi bir yazdirma islemi yapacagimiz zaman
        // ne yazdirdigimizi iyi bilmeliyiz
        // eger bir String veya primitive bir deger yazdiracaksak direkt sout
        // eger yazdirmak istedigimiz sey tek katli bir array ise Arrays.toString(arr[3])
        // eger yazdirmak istedigimiz sey multi dimensional array ise Arrays.deepToString(arr)


        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};

        System.out.println(arr.length); // 4

        System.out.println(arr[0].length); // 3

        System.out.println(arr[2][0]); // 4

        System.out.println(arr[3][3]); // 6

        System.out.println(arr[1]); // [I@7b23ec81

        System.out.println(Arrays.toString(arr[3])); // [1, 2, 3, 6, 8]

        System.out.println(Arrays.toString(arr));
        // [[I@6acbcfc0, [I@7b23ec81, [I@5f184fc6, [I@3feba861]

        System.out.println(Arrays.deepToString(arr));
        // [[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]

    }

}
