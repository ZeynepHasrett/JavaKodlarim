package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C12_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scan.next().charAt(0);

        System.out.println(Character.isLowerCase(karakter) ? Character.toUpperCase(karakter) : karakter);

    }

}
