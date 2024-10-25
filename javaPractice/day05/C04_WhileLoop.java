package javaPractice.day05;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        /*
            Kullanıcıdan 5 sayı isteyiniz ve
            bu sayılardan en büyüğünü bularak yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int sayi = 0;
        int enBuyukSayi = 0;

        while (number <= 5) {

            System.out.print("Lutfen " + number + ". sayiyi giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }

            number++;

        }

        System.out.println("Girilen sayilardan en buyugu : " + enBuyukSayi);

    }

}
