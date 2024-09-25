package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C05_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        // Kullanicidan gun ismini alin
        // buyuk kucuk harf farketmez
        // girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
        // kullanici gun ismini yanlis yazarsa uyarin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.nextLine().toLowerCase(); // Pazar, PAZAR, pazar, PAzar ==> pazar

        switch (gunIsmi) {

            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis");

        }

    }

}
