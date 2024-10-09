package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class Odev {

    public static void main(String[] args) {

        // While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen metni giriniz");

        String metin = scan.nextLine();

        metniTerstenYaz(metin);

    }

    public static void metniTerstenYaz(String metin) {

        int index = metin.length() - 1;

        while (index >= 0) {

            System.out.print(metin.charAt(index));

            index--;

        }

    }

}







