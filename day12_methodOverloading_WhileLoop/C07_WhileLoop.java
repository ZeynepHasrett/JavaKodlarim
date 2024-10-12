package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak üzere sayilar alin
        // Girilen sayilarin toplami 500 oldugunda
        // Kac sayi girildigini ve toplamin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        int sayac = 0;

        while (toplam < 500) {
            System.out.println("Toplama eklenmek uzere bir tamsayi giriniz");
            int sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;
        }

        System.out.println("Girdiginiz " + sayac + " adet sayinin toplami :" + toplam);

    }

}
