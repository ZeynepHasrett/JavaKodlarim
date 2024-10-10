package day15_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturun.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen array'e konulacak eleman sayisini giriniz");
        int arrlength = scan.nextInt();

        int[] sayilar = new int[arrlength];

        for (int i = 0; i < arrlength; i++) {

            System.out.println("Lutfen array'e konulacak bir tamsayi giriniz");
            sayilar[i] = scan.nextInt();

        }

        System.out.println(Arrays.toString(sayilar));

    }

    // Kullanicidan array’in boyutunu ve elementlerini alip
    // array’i olusturan ve bize donduren bir method olusturun.

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen array'e konulacak eleman sayisini giriniz");
        int arrlength = scan.nextInt();

        int[] sayilar = new int[arrlength];

        for (int i = 0; i < arrlength; i++) {

            System.out.println("Lutfen array'e konulacak bir tamsayi giriniz");
            sayilar[i] = scan.nextInt();

        }

        return sayilar;

    }


    public static String[] stringArrayOlustur() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen array'e konulacak eleman sayisini giriniz");
        int arrlength = scan.nextInt();

        String[] metinler = new String[arrlength];
        scan.nextLine();

        for (int i = 0; i < arrlength; i++) {

            System.out.println("Lutfen array'e konulacak bir tamsayi giriniz");

            metinler[i] = scan.nextLine();

        }

        return metinler;

    }

}
