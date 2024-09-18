package day03_dataCasting_WraperClasses;

import java.util.Scanner;

public class C03_Ornek {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // birinci tamsayiyi alip ikinci tamsayiya bolun
        // ve sonucu ondalikli olarak yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 tamsayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Iki sayinin bolum sonucu : " + sayi1 / sayi2); // 123 / 10 = 12
        // Java iki tamsayiyi boldugunde sonucun sadece tamsayi kismini yazdirir

        System.out.println("Iki sayinin bolum sonucu : " + (double)(sayi1 / sayi2)); //12.0
        // Java once bolme islemini yapip sonra cast ettigi icin 12.0 yazdirdi

        System.out.println("Iki sayinin bolum sonucu : " + ((double)sayi1 / sayi2)); // 12.3

        System.out.println("Iki sayiyi da double yapinca bolum double sonucu : " + ((double)sayi1 / (double)sayi2)); // 12.3

    }
}
