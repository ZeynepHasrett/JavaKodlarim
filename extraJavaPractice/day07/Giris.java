package extraJavaPractice.day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Giris extends Islemler {

    Scanner scanner = new Scanner(System.in);

    void menu() {

        Urun urun1 = new Urun("Portakalli Kurabiye", 10);
        Urun urun2 = new Urun("Tarcinli Kurabiye", 20);
        Urun urun3 = new Urun("Elmali Kurabiye", 15);
        Urun urun4 = new Urun("Uzumlu Kurabiye", 12);
        Urun urun5 = new Urun("Cikolatali Kurabiye", 30);
        Urun urun6 = new Urun("Kavala Kurabiye", 35);

        urunler.put(10001, urun1);
        urunler.put(10002, urun2);
        urunler.put(10003, urun3);
        urunler.put(10004, urun4);
        urunler.put(10005, urun5);
        urunler.put(10006, urun6);

        System.out.println("**********t148 KURABIYE DUKKANINA HOSGELDINIZ**********");
        System.out.println("Lutfen yapmak istediginiz islemin numarasini yaziniz\n" +
                "1. URUN LISTELEME\n" +
                "2. ALISVERIS\n" +
                "3. SEPETI GÖRÜNTÜLEME\n" +
                "4. ODEME\n" +
                "CIKIS ICIN Q YA BASINIZ\n" +
                "SECIMINIZ: ");

        int secim = scanner.nextInt();

        try {

            switch (secim) {
                case 1: {
                    urunListeleme(urunler);
                    menu();
                }
                case 2: {
                    alisveris();
                    menu();
                }
                case 3: {
                    sepetiGoruntuleme();
                    menu();
                }
                case 4: {
                    odeme();
                    menu();
                }
                default: {
                    System.out.println("Hatali islem yaptiniz");
                    menu();
                }

            }

        } catch (InputMismatchException e) {
            if (scanner.next().equalsIgnoreCase("q")) {
                System.out.println("Sistemden cikiliyor, bizi tercih ettiginiz icin tesekkur ederiz");
                System.exit(0);
            } else {
                System.out.println("Hatali giris yaptiniz");
                menu();
            }

        }

    }

}
