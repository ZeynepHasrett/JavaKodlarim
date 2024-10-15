package exercises.javaSorular.dorduncuHafta;

import java.util.Scanner;

public class Q1_ {

    public static void main(String[] args) {

        /*
            Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

            Test Data
            34
            Beklenen Cikti
            7
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi ; i++) {

            toplam = sayi % 10;

            toplam += sayi / 10;

        }

        System.out.println(toplam);

    }

}
