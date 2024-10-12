package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C09_SayiIsteme {

    public static void main(String[] args) {


        // Kullanicidan pozitif sayi isteyin
        // girilen sayinin pozitifTamBolenlerSayisi 5' den buyukse
        // "Guzel sayi" yazdirin ve islemi bitirin
        // buyuk degilse "Kotu sayi" yazdirin ve tekrar sayi girmesini isteyin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 0;
        int pozitifTamBolenlerSayisi = 0;
        boolean devamMi = true;

        while (devamMi) { // devamMi == true

            System.out.println("Lutfen pozitif bir tamsayi giriniz");
            girilenSayi = scanner.nextInt();

            pozitifTamBolenlerSayisi = pozitifTamBolenSayisiBul(girilenSayi);

            if (pozitifTamBolenlerSayisi > 5) {
                System.out.println("Guzel sayi");
                // break;
                devamMi = false;
            } else {
                System.out.println("Kotu sayi");

            }

        }

    }


    public static int pozitifTamBolenSayisiBul(int sayi) {

        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                sayac++;
            }

        }

        return sayac;

    }

}
