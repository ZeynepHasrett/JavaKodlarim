package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {

        // reverseString isminde bir method create ediniz.
        // Bu method bir String'i parametre olarak alsın.
        // Ve bu method, girilen String'i tersten print etsin.
        // Örn:
        //      String = "Java'yı Seviyorum."
        //      Print  :  .muroyiveS ıy'avaJ


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        tersMetin(metin);

    }

    public static void tersMetin(String metin) {

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) { // ZEYNEP

            tersMetin += metin.charAt(i);

        }

        System.out.println(tersMetin);

    }

}
