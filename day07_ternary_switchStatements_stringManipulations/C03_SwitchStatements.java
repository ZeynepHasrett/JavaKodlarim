package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {

    public static void main(String[] args) {


        /*
            Switch Statements
            switch parantezine yazilan variable'in alabilecegi degerlere gore
            case' ler olusturur

            switch parantezine boolean, long, double ve float variable'lar yazilamaz
            bunun disindaki data turleri olabilir String, char, byte, short, int, ...

            switch calismaya basladiginda
            girilen degere uygun olan case' e gider ve calismaya baslar

            eger break; ile karsilasirsa durur
            break ile karsilasmazsa switch' in sonuna kadar calisir

         */

        // Kullanicidan rakam olarak
        // gun numarasini alip gun ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1: // gunNo' nun degerinin 1 olmasi durumunda
                System.out.println("Gunlerden Pazartesi");
                break;
            case 2:
                System.out.println("Gunlerden Sali");
                break;
            case 3:
                System.out.println("Gunlerden Carsamba");
                break;
            case 4:
                System.out.println("Gunlerden Persembe");
                break;
            case 5:
                System.out.println("Gunlerden Cuma");
                break;
            case 6:
                System.out.println("Gunlerden Cumartesi");
                break;
            case 7:
                System.out.println("Gunlerden Pazar");
                break;
            default: // yazilan case' lerden hicbirine uygun olmayan degerler
                System.out.println("Girilen deger gecersiz");

        }

    }

}
