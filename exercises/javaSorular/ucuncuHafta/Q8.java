package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        // StringMethods:
        //                Cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
        //                ORNEK:
        //                INPUT      :  Python
        //                OUTPUT     :  Pyt


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        if (kelime.length() % 2 == 0) {

            System.out.println(kelime.substring(0, kelime.length() / 2));
        } else {
            System.out.println("Kelimenin uzunluk degeri tek");
        }

    }

}
