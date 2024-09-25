package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C06_SayiyiYaziyaCevirme {

    public static void main(String[] args) {

        // Kullanicidan 0 - 100 (sinirlar haric) bir sayi girmesini isteyin
        // girilen sayiyi metin olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0-100 arasi bir sayi giriniz \n 0 ve 100 kullanilamaz");
        int sayi = scan.nextInt();

        // 95 ==>

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = sayi / 10;

        switch (onlarBasamagi) {

            case 0:
                break;
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birlerBasamagi) {
            case 0:
                break;
            case 1:
                System.out.print(" bir");
                break;
            case 2:
                System.out.print(" iki");
            case 3:
                System.out.print(" uc");
                break;
            case 4:
                System.out.print(" dort");
                break;
            case 5:
                System.out.print(" bes");
                break;
            case 6:
                System.out.print(" alti");
                break;
            case 7:
                System.out.print(" yedi");
                break;
            case 8:
                System.out.print(" sekiz");
                break;
            case 9:
                System.out.print(" dokuz");
                break;

        }

    }

}
