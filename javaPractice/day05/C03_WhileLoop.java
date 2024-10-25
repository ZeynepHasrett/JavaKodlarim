package javaPractice.day05;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {

        /*
             Kullanicidan bir kelime alip
             indexi tek sayi olan karakterleri
             yazdiran bir code create ediniz
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.next();

        int index = 0;

        while (index <= kelime.length() - 1) {

            if (index % 2 == 1) {
                System.out.println(index + ". index'deki karakter " + kelime.charAt(index));
            }

            index++;

        }

    }

}
