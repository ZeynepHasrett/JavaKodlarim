package exercises;

import java.util.Scanner;

public class E03_Scanner {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
                  yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenar uzunluklarini giriniz");

        System.out.print("1. kenar: ");

        double kenar1 = scan.nextDouble();

        System.out.print("2. kenar: ");

        double kenar2 = scan.nextDouble();

        System.out.println(kenar1 * kenar2);

    }
}
