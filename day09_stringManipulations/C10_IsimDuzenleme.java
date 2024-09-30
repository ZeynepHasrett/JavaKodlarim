package day09_stringManipulations;

import java.util.Scanner;

public class C10_IsimDuzenleme {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan isim ve soyismini ayri ayri alin.
            - ismi daha uzun ise,
              isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
            - soyisim daha uzun ise
              ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();

        if (isim.length() > soyIsim.length()) { // isim daha uzun
            System.out.println(isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyIsim.substring(0, 1).toUpperCase() +
                    soyIsim.substring(1).toLowerCase()
            );

        } else if (soyIsim.length() > isim.length()) { // soyisim daha uzun

            System.out.println(isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyIsim.toUpperCase());
        }

    }

}
