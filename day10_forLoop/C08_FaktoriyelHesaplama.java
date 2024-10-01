package day10_forLoop;

import java.util.Scanner;

public class C08_FaktoriyelHesaplama {

    public static void main(String[] args) {

        // Kullanicidan 14’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 14'ten kucuk bir sayi giriniz");

        int sayi = scan.nextInt();

        int faktoriyelDegeri = 1;

        for (int i = sayi; i >= 1; i--) {
            faktoriyelDegeri *= i;
        }

        System.out.println(sayi + "! = " + faktoriyelDegeri);

    }

}
