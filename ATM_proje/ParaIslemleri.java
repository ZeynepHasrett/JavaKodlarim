package ATM_proje;

import static ATM_proje.BakiyeIslemleri.bakiyeSorgulama;
import static ATM_proje.MenuIslemleri.menu;

public class ParaIslemleri {

    public static void paraGonderme() {

        GirisIslemleri.scanner.nextLine();

        System.out.println("IBAN No giriniz (TR ile baslamali ve 10 karakter uzunlugunda olmalidir) ");
        String iban = GirisIslemleri.scanner.nextLine().toUpperCase().replaceAll("\\s", "");

        if (iban.startsWith("TR") && iban.length() == 10) {

            System.out.println("Gondereceginiz miktari giriniz");
            double miktar = GirisIslemleri.scanner.nextDouble();

            if (miktar <= GirisIslemleri.bakiye) {
                GirisIslemleri.bakiye -= miktar;
                System.out.println("Para gonderme isleminiz basarili");
                bakiyeSorgulama();
            } else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
                menu();
            }

        } else {
            System.out.println("Gecerli bir iban girmelisiniz, tekrar deneyiniz");
            paraGonderme();
        }

    }

    public static void paraCekme(double miktar){

        if (miktar <= GirisIslemleri.bakiye){
            GirisIslemleri.bakiye -= miktar;
            bakiyeSorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, lutfen tekrar deneyiniz");
            //double yenimiktar= scan.nextDouble();
            //paracekme(yenimiktar);
            paraCekme(GirisIslemleri.scanner.nextDouble());
        }

    }

    public static void paraYatirma(double miktar){

        GirisIslemleri.bakiye += miktar;
        bakiyeSorgulama();

    }

}
