package javaPractice.day05;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
             Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
             kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
             ediniz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolunen sayiyi giriniz");
        int bolunenSayi = scanner.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz");
        int bolenSayi = scanner.nextInt();

        bolmeIslemi(bolunenSayi, bolenSayi);

    }

    public static void bolmeIslemi(int bolunenSayi, int bolenSayi) {

        if (bolunenSayi < bolenSayi) {
            System.out.println("Bolunen sayi bolen sayidan buyuk olmalidir");
        } else {

            int sayac = 0;

            int ilkBolunen = bolunenSayi;

            while (bolunenSayi >= bolenSayi) {
                bolunenSayi = bolunenSayi - bolenSayi;
                sayac++;
            }

            System.out.println(ilkBolunen + " sayisinin " + bolenSayi + " sayisina bolumu " + sayac + " kalan ise " + bolunenSayi);

        }

    }

}
