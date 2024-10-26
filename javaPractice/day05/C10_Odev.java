package javaPractice.day05;

import java.util.Random;
import java.util.Scanner;

public class C10_Odev {

    public static void main(String[] args) {

        /*
            1-100 arasında rastgele bir sayı üretin ve
            kullanıcıdan sayıyı tahmin etmesini isteyin
            tahmini doğru bilirse de "5.tahminde doğru bildiniz"
            yanlış ise "Bilemediniz tekrar deneyiniz" yazdiran Java kodunu yaziniz
        */

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randomSayi = random.nextInt(100) + 1; // nextInt(100) ifadesi 0 ile 99 arasında (100 hariç) rastgele bir tam sayı üretir
        // + 1 ekleyerek bu aralığı 1 ile 100 arasına kaydırırız.
        int tahmin;
        int sayac = 0;

        while (true) {

            System.out.println("Lutfen tahmin ettiginiz sayiyi giriniz");
            tahmin = scanner.nextInt();
            sayac++;

            if (tahmin == randomSayi) {
                System.out.println(sayac + ".tahminde doğru bildiniz");
            } else {
                System.out.println("Bilemediniz tekrar deneyiniz");
            }

        }

    }

}
