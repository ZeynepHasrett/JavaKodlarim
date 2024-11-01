package javaPractice.day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        /*
            Array elemanlarinin ortalama degerini hesaplayan ve
            ortalamadan büyük olan elemanlari yazdıran
            bir Java programi yazin
         */

        int[] arr = {2, 3, 15, 0, 69, 89, 78, 125, 369, 1254, 43, 32, 85, 92, 142};

        double toplam = 0;
        double ortalama = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }

        ortalama = toplam / arr.length;
        Arrays.sort(arr);
        System.out.println("Ortalama : " + ortalama);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                System.out.print(arr[i] + " ");
            }

        }

    }

}
