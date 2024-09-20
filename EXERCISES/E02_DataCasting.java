package EXERCISES;

import java.util.Scanner;

public class E02_DataCasting {

    public static void main(String[] args) {

        /*
            SORU: Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 adet tamsayi giriniz");

        System.out.print("1. sayi: ");

        int sayi1 = scan.nextInt();

        System.out.print("2. sayi: ");

        int sayi2 = scan.nextInt();

        System.out.print("3. sayi: ");

        int sayi3 = scan.nextInt();

        double ortalama = (double)(sayi1 + sayi2 + sayi3) / 3;

        System.out.println("Girilen sayilarin ortalamasi: " + ortalama);

    }
}
