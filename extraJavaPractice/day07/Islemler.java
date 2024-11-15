package extraJavaPractice.day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler {

    Scanner scanner = new Scanner(System.in);

    Map<Integer, Urun> urunler = new HashMap<>();

    ArrayList<String> sepet = new ArrayList<>();

    double tutar = 0;

    void urunListeleme(Map<Integer, Urun> urunler) {

        System.out.println("Urun listesi: ");
        for (Map.Entry<Integer, Urun> entry : urunler.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getUrunAdi() + " " + entry.getValue().getUrunFiyati());
        }

    }

    void odeme() {

        System.out.println("Odemeniz gereken tutar: " + tutar);
        double nakit = 0;

        do {
            System.out.println("Nakit girisi yapiniz");
            nakit += scanner.nextDouble();

            if (tutar > nakit) {
                System.out.println("Yetersiz nakit girisi");
                System.out.println(tutar - nakit + " kadar daha nakit girmelisiniz");
            }

        } while (tutar > nakit);

        if (tutar == nakit) {
            System.out.println("Tam para odendi, yine bekleriz");
            System.exit(0);
        } else {
            System.out.println("Para ustu hazirlaniyor");
            double paraUstu = nakit - tutar;
            System.out.println(paraUstu + " lira para üstü veriliyor");
            System.exit(0);

        }

    }

    void sepetiGoruntuleme() {

        for (String sepettekiUrun : sepet) {
            System.out.println(sepettekiUrun);
        }

    }

    void alisveris() {

        try {

            System.out.println("Satin almak istediginiz kurabiyenin kodunu yaziniz");
            int kod = scanner.nextInt();

            System.out.println("Satin almak istediginiz miktari kilo cinsinden yaziniz");
            double miktar = scanner.nextDouble();

            System.out.println("urun kodu " + kod + "olan " + urunler.get(kod).getUrunAdi() + " den " + miktar + " kilo aliyorsunuz");
            tutar += miktar * urunler.get(kod).getUrunFiyati();

            String sepetUrunu = "urun kodu " + kod + "olan " + urunler.get(kod).getUrunAdi() + " den " + miktar + " kilo sepette bekliyor";
            sepet.add(sepetUrunu);

        } catch (NullPointerException e) {
            System.out.println("Hatali kod girdiniz, tekrar deneyiniz");
            alisveris();
        }

        System.out.println("Baska bir urun almak ister misiniz? (E/H olarak yaziniz)");

        String devam = scanner.next();

        if (devam.equalsIgnoreCase("H")) {
            System.out.println("Baska urun alinmiyor");
        } else {
            alisveris();
        }

    }

}
