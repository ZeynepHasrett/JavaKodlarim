package exercises.javaSorular.altinciHafta;

import java.sql.Array;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        /*
            Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.

            Test Data:
            birinci binary number: 100010
            ikinci  binary number: 110010

            Beklenen Çıktı:
            1010100
         */

        /*

        1.Yöntem

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci binary sayiyi giriniz");
        String binary1 = scanner.nextLine();

        System.out.println("Lutfen ikinci binary sayiyi giriniz");
        String binary2 = scanner.nextLine();

        // binary sayilari 10luk sisteme cevirme
        int sayi1 = Integer.parseInt(binary1, 2);
        int sayi2 = Integer.parseInt(binary2, 2);

        int toplam = sayi1 + sayi2;

        // int toplam'i  binary'e cevirme
        String binaryToplam = Integer.toBinaryString(toplam);

        System.out.println(binaryToplam);
        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci binary sayiyi giriniz");
        long birinci = scanner.nextLong();

        System.out.println("Lutfen ikinci binary sayiyi giriniz");
        long ikinci = scanner.nextLong();

        int onluk1 = ikiligiOnlugaDon(birinci);
        int onluk2 = ikiligiOnlugaDon(ikinci);
        int sum = onluk1 + onluk2;

        String ikilik = onluguIkiligedon(sum);

        System.out.println(ikilik);

    }

    public static String onluguIkiligedon(int onluk) {

        String str = "";

        for (int i = onluk; i > 0; i /= 2) {
            str = i % 2 + str;
        }

        return str;

    }


    public static int ikiligiOnlugaDon(long a) {

        int onlukSayi = 0;
        int us = 0;
        long basamak;

        for (long i = a; i > 0; i /= 10) {
            basamak = i % 10;
            onlukSayi += basamak * Math.pow(2, us);
            us++;
        }

        return onlukSayi;

    }

}
