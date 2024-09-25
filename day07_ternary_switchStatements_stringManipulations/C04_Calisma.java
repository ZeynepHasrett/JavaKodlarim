package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C04_Calisma {

    public static void main(String[] args) {

        // Kullanicidan gun ismini alin
        // buyuk kucuk harf farketmez
        // girilen gun hafta ici ise o gun haric hafta sonuna kac gun kaldigini yazdirin
        // cumartesi ise bugun tatilin ilk gunu
        // pazar ise malesef yarin is basliyor yazdirin
        // kullanici gun ismini yanlis yazarsa uyarin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.nextLine().toLowerCase(); // Pazar, PAZAR, pazar, PAzar ==> pazar

        switch (gunIsmi) {

            case "pazartesi":
                System.out.println("Tatile daha 4 gun var");
                break;
            case "sali":
                System.out.println("Tatile daha 3 gun var");
                break;
            case "carsamba":
                System.out.println("Tatile 2 gun kaldi");
                break;
            case "persembe":
                System.out.println("Tatile sadece 1 gun kaldi");
                break;
            case "cuma":
                System.out.println("Yasasin yarin tatil");
                break;
            case "cumartesi":
                System.out.println("Bugun tatilin ilk gunu");
                break;
            case "pazar":
                System.out.println("Malesef yarin is basliyor");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis");

        }

    }

}
