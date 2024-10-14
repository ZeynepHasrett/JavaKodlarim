package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        //       Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
        //       Test Data:
        //       Input the string: The quick brown fox jumps over the lazy dog.
        //       Expected Output: Number of words in the string: 9


        int sonuc = metin("The quick brown fox jumps over the lazy dog.");

        System.out.println("Girdiginiz metindeki kelime sayisi: " + sonuc);


    }

    public static int metin(String metin) {

        int sayac = 0;

        char bosluk = ' ';

        for (int i = 0; i < metin.length(); i++) {

            if (metin.charAt(i) == bosluk) {
                sayac++;
            }

        }

        return sayac + 1;

    }

}
