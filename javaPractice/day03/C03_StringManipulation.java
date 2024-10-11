package javaPractice.day03;

import javax.swing.*;
import java.util.Scanner;

public class C03_StringManipulation {

    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 4 harfli bir kelime giriniz");

        String kelime = scanner.nextLine();

        // String kelime = JOptionPane.showInputDialog("Lutfen 4 harfli bir kelime giriniz");
        // Bu sekilde alinan bilgi String icin gecerlidir
        // Eger int vb deger almak istersek String olarak alip Casting yapilmalidir

        if (kelime.length() > 4) {

            kelime = kelime.substring(0, 4);

        } else if (kelime.length() < 4) {

            System.out.println("4 harfli bir kelime girmelisiniz");

        }

        String tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);

        System.out.println("Girdiginiz kelime: " + kelime);
        System.out.println("Girdiginiz Kelimenin Tersi: " + tersKelime);

        if (kelime.equals(tersKelime)) {

            System.out.println("Girdiginiz kelime palindromiktir");

        }

    }

}
