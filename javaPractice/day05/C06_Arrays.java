package javaPractice.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {

    public static void main(String[] args) {

        /*
             Kullanicinin girdigi sayi kadar int array olusturan ve array elemanlarini
             kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
             elemaninin arasindaki farki gosteren Java programi yazin
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen diziye eklenecek eleman sayisini giriniz");
        int sayi = scanner.nextInt();

        int[] arr = new int[sayi];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + ". sayiyi giriniz: ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Girilen sayilardan en buyugu ile en kucugu arasindaki fark : " + (arr[arr.length-1] - arr[0]));

    }

}
