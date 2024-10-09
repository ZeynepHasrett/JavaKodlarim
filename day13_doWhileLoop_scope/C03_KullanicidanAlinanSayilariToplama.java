package day13_doWhileLoop_scope;

import java.util.Scanner;

public class C03_KullanicidanAlinanSayilariToplama {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere tamsayilar isteyin
        // Kullanici 0'a basincaya kadar islemi devam ettirin
        // Kullanici 0'a bastiginda (0 haric)
        // kac sayi girdigini ve toplamlarinin kac oldugunu yazdirin


        Scanner scan = new Scanner(System.in);

        int girilenSayi = 0;
        int toplam = 0;
        int sayac = 0;


//            while (girilenSayi != 0) {
//
//            System.out.println("Lutfen toplanmak uzere bir sayi giriniz\nBitirmek icin 0'a basiniz");
//            girilenSayi = scan.nextInt();
//
//            if (girilenSayi != 0) {
//
//                toplam += girilenSayi;
//                sayac++;
//
//            }
//
//        }


        // bizim ilk atama yaptigimiz degeri while kontrolune sokmadan
        // kullanicidan deger aliyor
        // boylece işk deger atamasi yaparken hata yapmamizi engelliyor

        do {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) ;
            toplam += girilenSayi;
            sayac++;

        } while (girilenSayi != 0);

        System.out.println("Girilen " + sayac + " adet sayinii toplami : " + toplam);

    }

}
