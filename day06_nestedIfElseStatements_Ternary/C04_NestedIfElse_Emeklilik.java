package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C04_NestedIfElse_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz K : Kadin, E : Erkek");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        // Eger karar vermek icin birden fazla degiskeni degerlendirmek gerekiyorsa
        // Nested If Else kullanilabilir.
        // Bunun icin once degiskenlerden birini temel degisken secip,
        // Sadece temel degiskene bagli olarak if else olusturalim.

        // Temel degiskenimiz cinsiyet olsun

        if (cinsiyet == 'K') {
            // Bu bolumde sadece kadinlar icin yasa gore degerlendirme yapalim

            if (yas < 20 || yas > 80) {
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas >= 60) {
                System.out.println("Kadinlar 60 yasindan buyuk oldugu icin emekli olabilir");
            } else {
                System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calisman gerekir");
            }

        } else if (cinsiyet == 'E') {
            // Bu bolumde sadece erkekler icin yasa gore degerlendirme yapalim

            if (yas < 20 || yas > 80) {
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas >= 60) {
                System.out.println("Erkekler 65 yasindan buyuk oldugu icin emekli olabilir");
            } else {
                System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calisman gerekir");
            }
        } else {
            System.out.println("Emeklilik hesabinda cinsiyet olarak K veya E secilmelidir");
        }

    }

}
