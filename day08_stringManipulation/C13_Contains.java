package day08_stringManipulation;

import java.util.Scanner;

public class C13_Contains {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        if (metin.contains("ev") && metin.contains("is")) {
            System.out.println("hem ev lazim hem is");
        } else if (metin.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (metin.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }

    }

}
