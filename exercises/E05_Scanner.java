package exercises;

import java.util.Scanner;

public class E05_Scanner {

    public static void main(String[] args) {

        /*
            SORU: Kullanıcıdan iki tam sayı girmesini isteyin ve
                  bu sayılardan en büyük ve en küçük olanını bulan bir program yazın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 adet tamsayi giriniz");

        System.out.print("1. sayi: ");

        int sayi1 = scan.nextInt();

        System.out.print("2. sayi: ");

        int sayi2 = scan.nextInt();

        System.out.println("Girilen sayilarin en buyugu: " + Integer.max(sayi1, sayi2));

        System.out.println("Girilen sayilarin en kucugu: " + Integer.min(sayi1, sayi2));

    }
}
