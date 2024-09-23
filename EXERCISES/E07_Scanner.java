package EXERCISES;

import java.util.Scanner;

public class E07_Scanner {

    public static void main(String[] args) {

        /*
            SORU: Kullanicidan mesafeyi ve gitmek istedigi saati aldıktan sonra gitmesi gereken ortalama hızı hesaplatin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gideceginiz mesafeyi (km) giriniz");
        System.out.print("Gidilecek Mesafe: ");

        double mesafe = scan.nextDouble();

        System.out.println("Lutfen gitmek istediginiz sureyi (saat) giriniz");
        System.out.print("Gidilecek Sure: ");

        double zaman = scan.nextDouble();

        double ortalamaHiz = mesafe / zaman;

        System.out.println("Gitmeniz Gereken Ortalama Hiz: " + ortalamaHiz + " km/s");

    }
}
