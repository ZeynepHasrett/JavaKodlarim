package day31_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_SayiToplama {

    public static void main(String[] args) {

        /*
            Kullanicidan toplanmak uzere tamsayilar isteyin
            ve kullanici q veya Q'ya basincaya kadar islemi devam ettirin
            kullanici q'ya bastiginda
            kac adet sayi girildigini vetoplamin ne oldugunu yazdirin
        */

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;
        int girilenSayi = 0;
        String girilenMetin = "";

        do {
            System.out.println("Lutfen toplanmak uzere tamsayi giriniz,\nbitirmek icin é'ya basiniz");

            try {
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {
                girilenMetin = scanner.nextLine(); // q, sanane, 4.5, true, Quinn

                if (girilenMetin.equalsIgnoreCase("Q")) {
                    break;
                } else {
                    System.out.println("Giris hatali... tamsayi veya Q olmali");
                }

            }

        } while (!girilenMetin.equalsIgnoreCase("q"));

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);
    }

}



