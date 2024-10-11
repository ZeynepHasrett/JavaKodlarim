package javaPractice.day01;

import java.util.Scanner;

public class P05_DataCasting {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan herhangi bir sayi alip bu sayiyi -128 ile +127 arasinda olan bir sayiya donusturun

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Girilen sayinin BYTE karsiligi : " + (byte)sayi);

    }
}
