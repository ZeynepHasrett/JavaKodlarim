package exercises.javaSorular.dorduncuHafta;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        /*
            Ugly Number:
            Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.

            Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
            İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

            Test Data:
            13
            Beklenen çıktı:
            ugly number  degildir

            Test Data:
            25
            Beklenen Çıktı:
            ugly number
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        for (int i = 2; i < 6; i++) {

            while (girilenSayi % i == 0)
            girilenSayi /= i;
        }

        if (girilenSayi == 1) {
            System.out.println("ugly number");
        } else {
            System.out.println("ugly number degildir");
        }

    }

}
