package exercises.javaSorular.besinciHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        /*
            Kullanıcıdan alınan Stringin son karakterini silip ekrana yazan Java kodunu yazınız.

            Test Data:
            good
            Beklenen Çıktı:
            goo

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        for (int i = 0; i < kelime.length(); i++) {

            if (!(i == kelime.length() - 1)) {
                System.out.print(kelime.charAt(i));
            }

        }

    }

}
