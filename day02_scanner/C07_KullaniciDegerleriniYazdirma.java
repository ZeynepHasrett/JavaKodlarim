package day02_scanner;

import java.util.Scanner;

public class C07_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44
        // Kaydiniz basarili sekilde gerceklesti

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println(
                "Girilen bilgiler : " + girilenIsim.charAt(0) +
                " " + girilenSoyisim  + ", " + yas +
                "\nKaydiniz basarili sekilde gerceklesti"
        );
    }
}
