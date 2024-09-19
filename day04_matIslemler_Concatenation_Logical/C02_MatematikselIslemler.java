package day04_matIslemler_Concatenation_Logical;

import java.util.Scanner;

public class C02_MatematikselIslemler {

    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir tamsayi alip toplamini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz");

        int sayi = scan.nextInt();
        System.out.println("Girmis oldugunuz sayi : " + sayi); //4586

        int birlerBasamagi = sayi % 10;

        System.out.println("birlerBasamagi = " + birlerBasamagi);

        sayi = sayi / 10; // sayi: 458 olacak

        int onlarBasamagi = sayi % 10;

        System.out.println("onlarBasamagi = " + onlarBasamagi);

        sayi = sayi / 10; // sayi: 45 olacak

        int yuzlerBasamagi = sayi % 10; // 5 bulunur

        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);

        int binlerBasamagi = sayi / 10; // 4 bulunur

        System.out.println("binlerBasamagi = " + binlerBasamagi);

        int rakamlarToplami = birlerBasamagi + onlarBasamagi + yuzlerBasamagi + binlerBasamagi;

        System.out.println("Girilen Rakamlar Toplami : " + rakamlarToplami);

    }
}
