package practice;

import java.util.Scanner;

public class P02_DataCasting {

    public static void main(String[] args) {

        /*

            SORU: Kullanicidan bir harf alin ve o harften sonra gelene 3 harfi sirasiyla yazdirin

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char girilenHarf = scan.next().charAt(0);

        System.out.println("Girdiginiz " + girilenHarf + " harfinden sonra girilen 3 harf : " +
                (char)(girilenHarf+1) + "," + (char)(girilenHarf+2) + "," + (char)(girilenHarf+3));

        // char degeri olarak girilen harfe karsilik gelen bir decimal (sayisal) deger vardir.
        // sonraki 3 harf ise birer artirarak bulunur.
        // fakat harf olarak cikti almak istersek char icin casting yapilmalidir

    }
}
