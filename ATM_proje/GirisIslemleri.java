package ATM_proje;

import java.util.Scanner;

public class GirisIslemleri {

    static Scanner scanner = new Scanner(System.in);

    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 30000;


    public static void giris() {

        System.out.println("Lutfen kart numaranizi giriniz");
        String kKartNo = scanner.nextLine();

        System.out.println("Lutfen sifrenizi giriniz");
        String kSifre = scanner.nextLine();

        kKartNo = kKartNo.replaceAll("//s","");

        if (kKartNo.equals(kartNo) && kSifre.equals(sifre)) {
            MenuIslemleri.menu();
        } else {
            System.out.println("Hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }

    }

}
