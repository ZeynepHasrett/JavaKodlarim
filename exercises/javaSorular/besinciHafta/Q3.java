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

        System.out.println("Lutfen bir kelime veya metin giriniz");
        String metin = scanner.nextLine();

        String tersMetin = "";
/*
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.substring(i, i + 1);

        }

        if (metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

*/
        /* 2.YONTEM

        String tersMetin = "";

        String[] arr =metin.split("");

        for (int i = arr.length - 1; i >= 0 ; i--) {
            tersMetin += arr[i];
        }

        if (tersMetin.equalsIgnoreCase(metin)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


         3.YONTEM

        StringBuilder sb = new StringBuilder(metin);

        if (sb.reverse().toString().equalsIgnoreCase(metin)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        */

    }

}
