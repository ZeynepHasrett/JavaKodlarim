package wiseMarket;

import java.util.Scanner;

import static wiseMarket.AnaMenu.scanner;
import static wiseMarket.Cikis.cikis;
import static wiseMarket.FisYazdir.fisYazdir;
import static wiseMarket.Manav.manav;
import static wiseMarket.Market.market;
import static wiseMarket.Sarkuteri.sarkuteri;

public class GirisEkrani {

    public static void girisEkrani() {

        System.out.println("********** WISE MARKET **********");
        System.out.println("          Hoş Geldiniz          ");

        System.out.println("Lutfen İşlem Seçimi Yapınız");
        System.out.println("----- Menü -----");
        System.out.println("1- Şarküteri Reyonu\n2- Manav Reyonu\n3- Market Reyonu\n4- Fiş Yazdır\n5- Çıkış");

        int secim = AnaMenu.scanner.nextInt();

        if (secim >= 1 && secim <= 5) {

            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
            }

        } else {
            System.out.println("Geçersiz bir seçim yaptınız");
            girisEkrani();
        }

    }

}




