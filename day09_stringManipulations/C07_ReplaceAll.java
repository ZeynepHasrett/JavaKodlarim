package day09_stringManipulations;

import java.util.Scanner;

public class C07_ReplaceAll {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen bilgiler : C** D****, **** **** **** 4567

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();

        System.out.println("Lutfen 16 hane olarak kredi karti numaranizi giriniz");
        String kkNo = scan.nextLine();

        System.out.println(
                isim.substring(0, 1).toUpperCase() + // ismin ilk harfi buyuk harf olarak
                        isim.substring(1).replaceAll("\\w", "*") + // kalani yildiza cevirdik
                        " " +
                        soyIsim.substring(0, 1).toUpperCase() +
                        soyIsim.substring(1).replaceAll("\\w", "*") +
                        ", " +
                        "**** **** **** " + // kredi kartinin ilk 12 rakami
                        kkNo.substring(12)
        );

    }

}
