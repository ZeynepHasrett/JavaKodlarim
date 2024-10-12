package day12_methodOverloading_WhileLoop;

import day11_nestedForLoop.C11_AsalSayiMi;
import day11_nestedForLoop.C14_AsalMiDondur;

import java.util.Scanner;

public class C08_AsalSayiIsteme {

    public static void main(String[] args) {

        // Kullanicidan asal bir sayi girmesini isteyin
        // Kullanicinin girdigi sayiyi kontrol edip
        // Asal sayi ise "Giris basarili" yazdirin
        // Asal sayi degilse tekrar isteyin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 0;

        boolean asalMi = false;

        while (!asalMi) { // asalMi == false

            System.out.println("Lutfen bir asal sayi giriniz");
            girilenSayi = scanner.nextInt();

            asalMi = C14_AsalMiDondur.asalMi(girilenSayi);
        }

        System.out.println("Giris basarili");

    }

}
