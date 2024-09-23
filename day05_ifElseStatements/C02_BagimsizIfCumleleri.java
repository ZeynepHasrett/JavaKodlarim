package day05_ifElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // SORU: Kullanicidan bir sayi alin
        // sayi 3ile bolunebiliyorsa "Uc ile bolunebilen sayi"
        // 5 ile bolunebiliyorsa "Bes ile bolunebilen sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (girilenSayi % 5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
        }

    }
}
