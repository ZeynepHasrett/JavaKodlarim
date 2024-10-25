package javaPractice.day05;

import java.util.Scanner;

public class C05_DoWhileLoop {

    public static void main(String[] args) {

        /*
              Kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
         */

        Scanner scanner = new Scanner(System.in);

        int pin = 0;
        int securityPin = 9716;

        do {
            System.out.print("Lutfen pin kodunuzu giriniz");
            pin = scanner.nextInt();

        } while (pin != securityPin);
        System.out.println("Pin kodunu dogru girdiniz");

        System.out.println("---------------------------");

//        while (pin != securityPin){
//            System.out.print("Lutfen pin kodunuzu giriniz");
//            pin = scanner.nextInt();
//        }
//
//        System.out.println("Pin kodunu dogru girdiniz");

    }

}
