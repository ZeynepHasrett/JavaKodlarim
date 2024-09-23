package day05_ifElseStatements;

import java.util.Scanner;

public class C10_BuyukHarf {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        // 1.yontem ASCII table

        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

        // 2.yontem Wrapper Class kullanimi

        if (Character.isUpperCase(karakter)) {
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }

}
