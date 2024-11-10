package ATM_proje;

import static ATM_proje.Bakiyeİslemleri.bakiyeSorgulama;
import static ATM_proje.ParaIslemleri.paraCekme;
import static ATM_proje.ParaIslemleri.paraGonderme;
import static ATM_proje.ParaIslemleri.paraYatirma;
import static ATM_proje.SifreIslemleri.sifreDegistirme;

public class MenuIslemleri {

    public static void menu() {

        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");

        int secim = GirisIslemleri.scanner.nextInt();

        switch (secim) {
            case 1: {
                bakiyeSorgulama();
                break;
            }
            case 2: {
                System.out.println("Yatiracaginiz para miktarini giriniz");
                double miktar = GirisIslemleri.scanner.nextDouble();
                paraYatirma(miktar);
                break;
            }
            case 3: {
                System.out.println("Cekeceginiz para miktarini giriniz");
                double miktar = GirisIslemleri.scanner.nextDouble();
                paraCekme(miktar);
                break;
            }
            case 4: {
                paraGonderme();
                break;
            }
            case 5: {
                sifreDegistirme();
                break;
            }
            case 6: {
                System.out.println("Bankamizi tercih ettiginiz icin tesekkür ederiz");
                System.exit(0);
            }
            default: {
                System.out.println("Menude olmayan bir islem tercih edilemez, lutfen tekrar deneyiniz");
                menu();
            }

        }

    }

}
