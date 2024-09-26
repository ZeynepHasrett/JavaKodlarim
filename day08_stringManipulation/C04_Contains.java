package day08_stringManipulation;

import java.util.Scanner;

public class C04_Contains {

    public static void main(String[] args) {

        // SORU: Kullanicidan bir metin isteyin
        // metin ev iceriyorsa "Ev gibisi yok"
        // metin is iceriyorsa "Calismak ne guzel"
        // metin hem ev hem is iceriyorsa "Evden calismak ne guzel"
        // her ikisi de yoksa "Calismak lazim" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Gununuzu nasil geciriyorsunuz?: ");
        String metin = scan.nextLine();

        if (metin.toLowerCase().contains("ev") && metin.toLowerCase().contains("is")) {
            System.out.println("Evden calismak ne guzel");
        } else if (metin.toLowerCase().contains("ev")) {
            System.out.println("Ev gibisi yok");
        } else if (metin.toLowerCase().contains("is")) {
            System.out.println("Calismak ne guzel");
        } else {
            System.out.println("Calismak lazim");
        }

    }

}
