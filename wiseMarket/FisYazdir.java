package wiseMarket;

import java.time.LocalDateTime;

import static wiseMarket.Cikis.cikis;

public class FisYazdir {

    public static void fisYazdir() {

        System.out.println("----------- Alışveriş Fişi ------------");
        System.out.println("              WISE MARKET              ");
        System.out.println("                New York               ");
        System.out.println();
        System.out.println(AnaMenu.sepet);
        System.out.println("Toplam Tutar: ₺" + AnaMenu.toplam);
        System.out.println("KDV %8: ₺" + AnaMenu.toplam * 0.08);
        AnaMenu.toplam += AnaMenu.toplam * 0.08;
        System.out.println("Ödenecek Tutar: ₺" + AnaMenu.toplam);
        System.out.println("Ödenen Tutar: ₺");

        int odenen = AnaMenu.scanner.nextInt();

        if (odenen < AnaMenu.toplam) {
            System.out.println("Ödenen tutar yeterli değil." + (AnaMenu.toplam - odenen) + " kadar daha ödeme yapmalısınız");
            fisYazdir();
        } else {
            System.out.println("Para üstü: ₺" + (odenen - AnaMenu.toplam));
        }
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        cikis();

    }

}
