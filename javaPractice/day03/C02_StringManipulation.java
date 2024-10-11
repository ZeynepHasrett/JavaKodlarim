package javaPractice.day03;

import javax.swing.*;
import java.util.Scanner;

public class C02_StringManipulation {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        // String isim = JOptionPane.showInputDialog("Lutfen 3 kelimeli bir isim giriniz\n\n\n");
        // System.out.println(isim);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 kelimeli bir isim giriniz\\n\\n\\n");

        String isim = scanner.nextLine();

        String ilkHarf = isim.substring(0, 1);

        String ikinciHarf = isim.substring(isim.indexOf(" ") + 1, isim.indexOf(" ") + 2);

        String ucuncuHarf = isim.substring(isim.lastIndexOf(" ") + 1, isim.lastIndexOf(" ") + 2);

        System.out.println(isim + " -> " + ilkHarf.toUpperCase() + "." + ikinciHarf.toUpperCase() + "." + ucuncuHarf.toUpperCase() + ".");

    }

}
