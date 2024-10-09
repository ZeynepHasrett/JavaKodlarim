package day11_nestedForLoop;

import java.util.Scanner;

public class C17_Odev {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin
        // C16' daki methodu kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini kodla soyleyin


        Scanner scan = new Scanner(System.in);

        String sifre = scan.nextLine();

        int sayac = 0;


        while (C16_SifreDogruMuDondur.sifreDogruMu(sifre) == false) {

            System.out.println("Lutfen sifrenizi giriniz");

            sifre = scan.nextLine();

            sayac++;

        }

        System.out.println("Yanlis deneme sayisi : " + sayac);

    }

}
