package javaPracticeDersleri.day01;

import java.util.Scanner;

public class P03_DataCasting {

    public static void main(String[] args) {

        /*

            SORU: Kullanicidan iki double sayi alin ve bu ilk sayiyi ikinci sayiya bolun
                  Sonucun tam sayi kismini yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki adet ondalikli sayi giriniz");

        System.out.println("1.Sayi : ");
        double sayi1 = scan.nextDouble();

        System.out.println("2.Sayi : ");
        double sayi2 = scan.nextDouble();
        System.out.println("Iki sayinin bolumunun tamsayi kismi : " + (int)(sayi1  /sayi2));

    }
}
