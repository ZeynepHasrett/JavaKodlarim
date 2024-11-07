package exercises.javaSorular.yedinciHaftaSorular;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        /*
            İki integer sayının eşitliğini kontrol eden Java methodunu yazınız.

            num1 = num2 => true
        */

        int num1 = 25;
        int num2 = 23;

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
