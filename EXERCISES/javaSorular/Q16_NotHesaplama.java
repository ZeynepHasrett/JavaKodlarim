package EXERCISES.javaSorular;

import java.util.Scanner;

public class Q16_NotHesaplama {

    public static void main(String[] args) {

        /*
            Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.

            1. 0(dahil) ile 50 arasi - D
            2. 50(dahil) ile 60 arası - C
            3. 60(dahil) ile 80 arası - B
            4. 80(dahil) ustu- A
            Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

            dip not : switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
            switch() de int, byte, short, char, String kullanilir.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Lutfen gecerli not giriniz");
        } else if (not >= 0 && not < 50) {
            System.out.println("D");
        } else if (not >= 50 && not < 60) {
            System.out.println("C");
        } else if (not >= 60 && not < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

    }

}
