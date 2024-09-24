package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_NestedIfElse_HarfKontrolu {

    public static void main(String[] args) {

        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici harfler disinda bir karakter girerse
                - "Tanimlanmamis karakter" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenKarakter = scan.next().charAt(0);

        // Degisken tek ama iki kademeli bir secim yapmaliyiz
        // 1.kademe kucuk harf, buyuk harf ve geriye kalanlar

        if (girilenKarakter >= 'a' && girilenKarakter <= 'z') { // kucuk harf secimini ASCII ile yapalim

            if (girilenKarakter == 'a') System.out.println("guzel harf");
            else if (girilenKarakter == 'b' || girilenKarakter == 'c' || girilenKarakter == 'd')
                System.out.println("idare eder");
            else System.out.println("girilen kucuk harfi begenmedim");

        } else if (Character.isUpperCase(girilenKarakter)) { // buyuk harf secimini Wrapper Class ile yapalim

            if (girilenKarakter == 'K') System.out.println("guzel harf");
            else if (girilenKarakter == 'L' || girilenKarakter == 'V' || girilenKarakter == 'Z')
                System.out.println("idare eder");
            else System.out.println("girilen buyuk harfi begenmedim");

        } else {
            System.out.println("Tanimlanmamis karakter");
        }

    }

}
