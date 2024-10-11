package javaPractice.day02;

import java.util.Scanner;

public class P02_artikYil {

    public static void main(String[] args) {

        /*
               SORU: Kullanicidan artik yil olup olmadigini kontrol etmek istedigi yili alin

                     Koşul 1: 4 ile bolunemeyen yillar artik yil degildir

                     Koşul 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir

                     Koşul 3: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan
                              400 ile bolunebilen yillar artik yildir
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kontrol etmek istediginiz yili giriniz");

        int k = scan.nextInt();

        if (k % 100 == 0 && k % 400 == 0) {
            System.out.println("Girmis oldugunuz " + k + " yili bir artik yildir");
        } else if (k % 4 == 0 && k % 100 != 0) {
            System.out.println("Girmis oldugunuz " + k + " yili bir artik yildir");
        } else {
            System.out.println("Girmis oldugunuz " + k + " yili bir artik yil degildir");
        }

        System.out.println("-----------------Ternary ile Cozumu--------");

        String result = k % 100 == 0 ? (k % 400 == 0 ? "Artik yildir" : "Artik yil degildir") : (k % 4 == 0 ? "Artik yildir" : "Artik yil degildir");

        System.out.println(result);

    }

}
