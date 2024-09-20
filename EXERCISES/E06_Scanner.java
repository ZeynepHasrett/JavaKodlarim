package EXERCISES;

import java.util.Scanner;

public class E06_Scanner {

    public static void main(String[] args) {

        /*
            SORU:  Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve
                   bu derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

                   Fizik Notunuz : 70
                   Matematik Notunuz : 40
                   Türkçe Notunuz : 30
                   Kimya Notunuz : 100
                   Müzik Notunuz : 60
                   Tarih Notunuz : 80
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Fizik notunuzu giriniz");

        System.out.print("Fizik Notunuz: ");

        int fizik = scan.nextInt();

        System.out.println("Lutfen Matematik notunuzu giriniz");

        System.out.print("Matematik Notunuz: ");

        int matematik = scan.nextInt();

        System.out.println("Lutfen Turkce notunuzu giriniz");

        System.out.print("Turkce Notunuz: ");

        int turkce = scan.nextInt();

        System.out.println("Lutfen Kimya notunuzu giriniz");

        System.out.print("Kimya Notunuz: ");

        int kimya = scan.nextInt();

        System.out.println("Lutfen Muzik notunuzu giriniz");

        System.out.print("Muzik Notunuz: ");

        int muzik = scan.nextInt();

        System.out.println("Lutfen Tarih notunuzu giriniz");

        System.out.print("Tarih Notunuz: ");

        int tarih = scan.nextInt();

        int notOrt = (fizik + matematik + turkce + kimya + muzik + tarih) / 6;

        System.out.println("Girilen Derslerin Not Ortalamasi: " + notOrt);

    }
}
