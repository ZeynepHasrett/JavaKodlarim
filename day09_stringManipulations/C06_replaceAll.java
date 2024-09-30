package day09_stringManipulations;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan her seyi silin
        // ornek: J1a4v*a )G*&^56uzel_!dir.
        //        Java Guzeldir


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");

        String metin = scan.nextLine(); // J1a4v*a )G*&^56uzel_!dir.

        // once sayilardan kurtulalim
        metin = metin.replaceAll("\\d", ""); // Jav*a )G*&^uzel_!dir. W ==> harf, rakam ve _ disindaki her sey

        // ozel karakterleri silmeden once
        // " " bosluklari korumaya almamiz gerekiyor
        // yukarida sayilari yok etmistik, space yerine herhangi bir rakam yazalim

        metin = metin.replace(" ", "6"); // Java6Guzel_dir


        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W", "");

        // _'yi yok edelim
        metin = metin.replaceAll("_", "");

        // space yerine yukarida 6 yazmistik onu yeniden space yapalim

        metin = metin.replaceAll("6", " "); // Java Guzeldir

        // en sona bir nokta ekleyelim

        metin += "."; // Java Guzeldir.

        System.out.println(metin);

    }

}
