package extraJavaPractice.day06;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static void menu() {

        System.out.println("Sekil hesaplama programina hosgeldiniz\n" + "Alanini ve cevresini hesaplamak istediginiz seklin numarasini giriniz:\n" +
                "1.CEMBER\n" +
                "2.DIKDORTGEN\n" +
                "3.KARE\n" +
                "4.CIKIS\n" +
                "SECIMINIZ: ");

        char secim = scanner.next().charAt(0);

        switch (secim) {
            case '1':
                cemberBilgileri();
                break;
            case '2':
                dikdortgenBilgileri();
                break;
            case '3':
                kareBilgileri();
                break;
            case '4':
                System.out.println("Sistemden cikiliyor");
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz");
                menu();
                break;
        }

    }

    private static void kareBilgileri() {
        System.out.println("Lutfen karenin kenarini giriniz");
        double kareKenari = scanner.nextDouble();

        Kare kare = new Kare(kareKenari, kareKenari);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenBilgileri() {
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz");
        double uzunKenar = scanner.nextDouble();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        double kisaKenar = scanner.nextDouble();

        Dikdortgen dikdortgen = new Dikdortgen(uzunKenar, kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberBilgileri() {

        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap = scanner.nextDouble();

        Cember cember = new Cember(yaricap);
        System.out.println(cember);
        menu();
    }

}
