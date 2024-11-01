package exercises.javaSorular.yedinciHaftaSorular;

import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class Q9 {

    public static void main(String[] args) {

        /*
            Bir dizi içerisindeki pozitif tamsayı sayısını ve
            negatif tamsayıların toplamını return (array olarak) eden bir method yazınız.

            Örnek:
            countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
            [10, -65]
            // Toplam 10 pozitif sayı var.
            // Tüm negatif sayıların toplamı -65'tir.

            Notlar :
            Boş bir dizi verilirse, boş bir dizi döndürür: []
            0 pozitif değil.
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        System.out.println(Arrays.toString(countPositivesSumNegative(arr)));

    }

    public static int[] countPositivesSumNegative(int[] arr) {

        int sayac = 0;
        int toplam = 0;

        if (arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                sayac++;
            } else if (arr[i] < 0) {
                toplam += arr[i];
            }

        }

        int[] arrYeni = new int[2];

        arrYeni[0] = sayac;
        arrYeni[1] = toplam;

        return arrYeni;

    }

}
