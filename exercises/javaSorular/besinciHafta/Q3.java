package exercises.javaSorular.besinciHafta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        /*
            Bir palindrom, madam veya racecar veya 10801 sayısı gibi
            ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

            Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

            Test Data:
            madam
            Beklenen Çıktı:
            True
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        String tersKelime = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.substring(i, i + 1);

        }

        if (kelime.equalsIgnoreCase(tersKelime)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
