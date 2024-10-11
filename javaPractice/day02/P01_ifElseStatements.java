package javaPractice.day02;

import java.util.Scanner;

public class P01_ifElseStatements {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan 40'tan buyuk bir sayi alin
                  Eğer sayi 5'e bölününce kalan 0 ise ve
                  sayi 8'e bölününce kalan 0 ise
                  "able to divide by 5 and 8" yazdırınız.

                  Eğer sayi 10'a bölününce kalan 5 ise ve
                  sayi 9'a bölününce kalan 0 ise
                  "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
                  Kosullarin her ikisi de gecerli degilse sonuc bulunamadi yazsin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 40'tan buyuk bir sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi > 40) {

            if (sayi % 5 == 0 && sayi % 8 == 0) {
                System.out.println("able to divide by 5 and 8");
            } else if (sayi % 10 == 5 && sayi % 9 == 0) {
                System.out.println("able to divide by 9 and divide by 10 reminder is 5");
            } else {
                System.out.println("Sonuc bulunamadi");
            }
        } else {
            System.out.println("Sayi 40'tan buyuk olmaliydi");
        }

    }

}
