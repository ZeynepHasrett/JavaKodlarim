package day08_stringManipulation;

import java.util.Scanner;

public class ODEV_indexOf {

    public static void main(String[] args) {

        /*
            ÖDEV: Kullanıcan bir metin alıp metinde birden fazla a harfi varsa a harfinin ikincisinin
            hangi indexte olduğun yazdırın.
            Bir tane varsa bir tane var yazdırın
        */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");

        String metin = scan.nextLine();

        int ilkKullanim = metin.indexOf('a');


        if ((metin.indexOf('a', ilkKullanim + 1) > 0)) {
            System.out.println("Ikinci a harfinin bulundugu index: " + metin.indexOf('a', ilkKullanim + 1));
        } else {
            System.out.println("a harfinden bir tane var");
        }

    }

}
