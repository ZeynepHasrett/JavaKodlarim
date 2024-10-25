package javaPractice.day05;

import java.util.Scanner;

public class C02_WhileLoop {

    public static void main(String[] args) {

        /*
            Kullanıcıdan alınan sayinin basamak degerlerinin toplamini
            while loop ile yapan birkod yazınız.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen en az 3 basamakli bir sayi giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Girilen sayinin basamak degerleri toplami : " + toplam);

    }

}
