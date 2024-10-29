package exercises.javaSorular.yedinciHaftaSorular;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        /*
            İki integer sayının eşitliğini kontrol eden Java methodunu yazınız.

            num1 = num2 => true
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int num1 = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2 = scanner.nextInt();

        System.out.println(esitMi(num1, num2));

    }

    public static boolean esitMi(int num1, int num2) {

        boolean sonuc = false;

        if (num1 == num2) {
            sonuc = true;
        }

        return sonuc;

    }

}
