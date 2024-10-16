package extraJavaPractice.day03;

import java.util.Random;
import java.util.Scanner;

public class C01_Tas_Kagit_Makas {

    public static void main(String[] args) {

        /*
            Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
            Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
            Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
            5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

            Kâğıt taşı sarar
            Taş makası kırar
            Makas kağıdı keser
        */

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int kullaniciSecimi = 0;

        int bilgisayarinSecimi = 0;

        int kullanici = 0;
        int bilgisayar = 0;

        do {

            System.out.println("Hosgeldiniz! Lutfen seciminizi sayi olarak yapiniz: Tas icin 1, Kagit icin 2, Makas icin 3 yaziniz ");
            kullaniciSecimi = scanner.nextInt();
            bilgisayarinSecimi = random.nextInt(3) + 1; // 1, 2, 3 (Bilgisayarin seciminin 1 fazlasi)

            if (kullaniciSecimi == 1 && bilgisayarinSecimi == 2) {
                System.out.println("Kagit tasi sarar, bilgisayar +1");
                bilgisayar++;
            } else if (kullaniciSecimi == 1 && bilgisayarinSecimi == 3) {
                System.out.println("Tas makasi kirar, kullanici +1");
                kullanici++;
            } else if (kullaniciSecimi == 2 && bilgisayarinSecimi == 1) {
                System.out.println("Kagit tasi sarar, kullanici +1");
                kullanici++;
            } else if (kullaniciSecimi == 2 && bilgisayarinSecimi == 3) {
                System.out.println("Makas kagidi keser, bilgisayar +1");
                bilgisayar++;
            } else if (kullaniciSecimi == 3 && bilgisayarinSecimi == 1) {
                System.out.println("Tas makasi kirar, bilgisayar +1");
                bilgisayar++;
            } else if (kullaniciSecimi == 3 && bilgisayarinSecimi == 2) {
                System.out.println("Makas kagidi keser, kullanici +1");
                kullanici++;
            } else {
                System.out.println("Berabere kaldiniz!");
                System.out.println("Kullanici skoru : " + kullanici + " " + "Bilgisayar skoru : " + bilgisayar);
            }

        } while (kullanici != 5 && bilgisayar != 5);

        if (kullanici > bilgisayar) {
            System.out.println("Siz kazandiniz! Bugun sansli gunundesin");
        } else {
            System.out.println("Bilgisayar seni yendi!");
        }

    }

}


