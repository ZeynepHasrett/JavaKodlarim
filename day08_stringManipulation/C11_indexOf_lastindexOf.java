package day08_stringManipulation;

import java.util.Scanner;

public class C11_indexOf_lastindexOf {

    public static void main(String[] args) {

        /*
            SORU:   Kullanicidan bir cumle ve aranacak metin alin.
                    Aranan metnin cumle icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
                    yazdirin
                    Aranan metin cumlede yok
                    Aranan metin cumlede sadece 1 kere kullanilmis
                    Aranan metin String’de sadece 1’den fazla kullanilmis
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println("Lutfen cumlede aradiginiz metni giriniz ");
        String metin = scan.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);


        if (ilkIndex == -1) {
            System.out.println("aranan metin cumlede yok");
        } else if (ilkIndex == sonIndex) {
            System.out.println("aranan metin cumlede sadece bir kere kullanilmis");
        } else {
            System.out.println("aranan metin cumlede birden fazla kullanilmis");
        }

    }

}
