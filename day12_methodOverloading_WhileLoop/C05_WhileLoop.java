package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        /*
            SORU: While loop kullanarak
            kullanicidan alinan sayinin rakamlar toplamini bulun.
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int rakamlarToplami = 0;


        while (sayi > 0) {
            rakamlarToplami += sayi % 10;
            sayi = sayi / 10;
        }

        System.out.println("Rakamlar Toplami : " + rakamlarToplami);

    }

}
