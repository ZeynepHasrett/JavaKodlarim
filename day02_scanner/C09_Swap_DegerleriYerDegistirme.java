package day02_scanner;

import java.util.Scanner;

public class C09_Swap_DegerleriYerDegistirme {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 1.sayiyi giriniz");
        int sayi1 = scan.nextInt(); // 15

        System.out.println("Lutfen 2.sayiyi giriniz");
        int sayi2 = scan.nextInt(); // 25

        int yedek = sayi2;

        sayi2 = sayi1;

        sayi1 = yedek;

        System.out.println("Sayi1'in yeni degeri : " + sayi1); // 25
        System.out.println("Sayi2'in yeni degeri : " + sayi2); // 15
    }
}
