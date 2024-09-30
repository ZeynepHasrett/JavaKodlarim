package day09_stringManipulations;

import java.util.Scanner;

public class C01_indexOfSoru {

    public static void main(String[] args) {

        /*
            Kullanicidan bir String ve aranacak metin alin.
            Aranan metnin String icerisinde kullanimini kontrol ederek
            asagidaki cumlelerden uygun olanini yazdirin
            -String aranan metni icermiyor
            -Aranan metin String’de sadece 1 kere kullanilmis
            -Aranan metin String’de 1’den fazla kullanilmis

    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen arama yapilacak metni giriniz");
        String anaMetin = scan.nextLine();

        System.out.println("Lutfen aranacak kelime veya metni giriniz");
        String aranacakMetin = scan.nextLine();


        // anaMetin = "javayi cok sevdik, hem de cok cok sevdik."
        // aranacakMetin = "java"

        int ilkKullanimIndexi = anaMetin.indexOf(aranacakMetin);
        int sonKullanimIndexi = anaMetin.lastIndexOf(aranacakMetin);

        if (ilkKullanimIndexi == -1) {
            System.out.println("Ana metin aranacak metni icermiyor");
        } else if (ilkKullanimIndexi == sonKullanimIndexi) {
            System.out.println("Aranan metin ana metinde sadece 1 kere kullanilmis");
        } else {
            System.out.println("Aranan metin ana metinde 1’den fazla kullanilmis");
        }

    }

}
