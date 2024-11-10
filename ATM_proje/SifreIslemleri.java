package ATM_proje;

import static ATM_proje.GirisIslemleri.scanner;
import static ATM_proje.GirisIslemleri.sifre;

public class SifreIslemleri {

    public static void sifreDegistirme() {

        System.out.println("Lutfen mevcut sifrenizi giriniz");
        String kSifre = GirisIslemleri.scanner.nextLine();
        GirisIslemleri.scanner.nextLine();

        if (kSifre.equals(GirisIslemleri.sifre)) {

            System.out.println("Yeni sifrenizi giriniz:");
            String yeniSifre = GirisIslemleri.scanner.nextLine();
            System.out.println("Sifreniz güncellendi");

            //sifrenin 4 rakam olmasi gerekiyorsa;
            if (yeniSifre.length() == 4) {
                sifre = yeniSifre;
                System.out.println("Sifreniz güncellendi");
                MenuIslemleri.menu();
            } else {
                System.out.println("4 rakamli sifre yazmaniz gerekmektedir");
                sifreDegistirme();
            }

        } else {
            System.out.println("Sifreniz eslesmedi, lutfen yeniden deneyiniz");
            sifreDegistirme();
        }

    }

}
