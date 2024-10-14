package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        /*
         * Kullanicidan bir kelime isteyin eger kelime 3 ve daha fazla harften olusuyorsa
         * son iki harfini 3 kere yan yana yazdirin
         * degil ise girilen kelimeyi yazdirin

         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        if (kelime.length() >= 3) {

            System.out.println(kelime.substring(kelime.length() - 2).repeat(3));
        } else {

            System.out.println(kelime);
        }

    }

}
