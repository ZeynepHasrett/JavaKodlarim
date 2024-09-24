package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C13_Ternary {

    public static void main(String[] args) {

        // Kullanicidan iki sayi
        // ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi1 < sayi2 ? sayi1 : sayi2);

    }

}
