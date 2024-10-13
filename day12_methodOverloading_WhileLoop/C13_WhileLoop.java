package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C13_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        // bu negatif sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);

        int pozitifSayilarinToplam = 0;
        int girilenSayi = 10;
        int pozitifSayiAdedi = 0;


        /*
            While loop kullandigimizda DIKKAT etmemiz gereken EN ONEMLI konu :
            normalde kullanicidan almayi planladigimiz "girilenSayi" variable'ina
            basta rastgele bir deger atadik.

            VERDIGIMIZ BU ILK DEGER while loop body'sinin calismasina
            ENGEL OLMAMALIDIR
        */


        while (girilenSayi != 0) {

            System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz\nBitirmek istediginizde 0'a basiniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi < 0) {
                System.out.println("negatif sayi kullanamazsiniz");
            } else if (girilenSayi > 0) {
                pozitifSayilarinToplam += girilenSayi;
                pozitifSayiAdedi++;
            }

        }

        System.out.println("Girdiginiz " + pozitifSayiAdedi + " adet pozitif sayinin toplami: " + pozitifSayilarinToplam);

    }

}


