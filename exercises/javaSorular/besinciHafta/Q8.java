package exercises.javaSorular.besinciHafta;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        /*
            Kullanıcı tarafından girilen bir yılın  artık yıl olup
            olmadığını kontrol etmek için bir Java Methodu yazınız.

            Test Data:
            2017

            Beklenen Çıktı:
            false
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir yil giriniz");
        int yil = scanner.nextInt();

        System.out.println(artikYilMi(yil));

    }

    public static boolean artikYilMi(int yil) {

        if (yil % 4 == 0) {

            if (yil % 100 != 0 || yil % 400 == 0) {
                return true;
            }

        }

        return false;

    }

}
