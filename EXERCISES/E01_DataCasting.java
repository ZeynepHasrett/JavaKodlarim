package EXERCISES;

import java.util.Scanner;

public class E01_DataCasting {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun ve
                  bolum isleminin sonucununun tamsayi kismini yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz");

        System.out.print("Girilen sayi: ");

        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        System.out.print("Girilen sayi: ");

        int tamSayi = scan.nextInt();

        System.out.println("Bolme islemine ait sonucun tamsayi kismi: " + (int) (ondalikliSayi / tamSayi));

    }
}
