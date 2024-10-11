package javaPractice.day01;

import java.util.Scanner;

public class P04_Scanner {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan iki sayi alip ucuncu bir degisken kullanmadan
            ikisinin degerlerini birbirinin yerine degistiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki adet tamsayi giriniz");

        System.out.print("1. Tamsayi : ");
        int sayi1 = scan.nextInt();

        System.out.println("2. Tamsayi : ");
        int sayi2 = scan.nextInt();

        System.out.println("1. Girilen tamsayi : " + sayi1 + "\n2. Girilen Tamsayi : " + sayi2);
        System.out.println("-------------HOKUS POKUS----------------");

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("1. Tamsayi : " + sayi1 + "\n2. Tamsayi : " + sayi2);

    }
}
