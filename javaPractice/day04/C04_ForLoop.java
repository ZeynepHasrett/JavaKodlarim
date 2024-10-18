package javaPractice.day04;

import java.util.Scanner;

public class C04_ForLoop {

    public static void main(String[] args) {

        /*
            Bir sayinin mükemmel olup olmadiğini bulan Java kodunu yaziniz.
            Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı,
                            kendisine eşitse o sayi mükemmeldir.
            ORNEK:
            INPUT     : 6
            OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

            mukemmel sayi kontrolu
            1. kullanicidan sayi alalim
            2. bir toplam degiskeni olusturuyoruz
            3. sayinin bolenleri bul
            4. bolenleri toplamla topla
            5. sayiyla toplamin esitligini kontrol et
        */


        System.out.println("====Mukemmel Sayi Kontrol Modulu ====\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kontrol etmek istediginiz sayiyi giriniz");

        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
                System.out.print(i + " ");
            }

        }

        System.out.println("");

        if (toplam == sayi) {
            System.out.println(sayi + " sayisi bir mukemmel sayidir");
        } else {
            System.out.println(sayi + " sayisi bir mukemmel sayi degildir");
        }

    }

}
