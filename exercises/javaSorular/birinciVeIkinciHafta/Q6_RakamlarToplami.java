package exercises.javaSorular.birinciVeIkinciHafta;

import java.util.Scanner;

public class Q6_RakamlarToplami {

    public static void main(String[] args) {

        /* Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlarin toplamini bulunuz
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");

        int sayi = scan.nextInt();

        int birlerBasamagi = sayi % 10;

        int onlarBasamagi = (sayi / 10) % 10;

        int binlerBasamagi = (sayi / 1000) % 10;

        int onBinlerBasamagi = (sayi / 10000) % 10;

        System.out.println("Girdiginiz sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplami : " + (birlerBasamagi + onlarBasamagi + binlerBasamagi + onBinlerBasamagi));

    }

}
