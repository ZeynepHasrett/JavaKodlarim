package exercises.javaSorular.altinciHafta;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        /*
            Yazılan değeri array içerisinde arayan Java Kodu yazınız.

            Array: [1551,1223,1443,1267,1789,1023,2020]

            Aranan Değer:2020
            Beklenen Çıktı:True

            Aranan Değer:2010
            Beklenen Çıktı :False
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen aranacak degeri giriniz");
        int arananDeger = scanner.nextInt();

        int[] array = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        boolean bl = false;

        for (int i = 0; i < array.length; i++) {

            if (arananDeger == array[i]) {
                System.out.println("True");
                bl = true;
            }

        }

        if (!bl) {
            System.out.println("False");
        }

    }

}







