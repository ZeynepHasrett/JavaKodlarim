package exercises.javaSorular.birinciVeIkinciHaftaSorular;

import java.util.Scanner;

public class Q18_AylarinGunSayisiniHesaplama {

    public static void main(String[] args) {

        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ay numarasini giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
        }

    }

}
