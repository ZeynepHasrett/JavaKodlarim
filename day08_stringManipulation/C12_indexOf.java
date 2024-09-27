package day08_stringManipulation;

import java.util.Scanner;

public class C12_indexOf {

    public static void main(String[] args) {

        /*
            SORU:   Kullanicidan bir cumle ve aranacak metin alin.
                    Aranan metnin cumle icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
                    yazdirin
                    Aranan metin cumlede yok
                    Aranan metin cumlede sadece 1 kere kullanilmis
                    Aranan metin cumlede 2 kere kullanilmis
                    Aranan metin cumlede 2’den fazla kullanilmis
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println("Lutfen cumlede aradiginiz metni giriniz ");
        String metin = scan.nextLine();

        int ilkIndex = -1;
        int ikinciIndex = -1;
        int ucuncuIndex = -1;


        ilkIndex = cumle.indexOf(metin);

        if (ilkIndex != -1) {
            ikinciIndex = cumle.indexOf(metin, ilkIndex + 1);
        }

        if (ikinciIndex != -1) {
            ucuncuIndex = cumle.indexOf(metin, ikinciIndex + 1);
        }

        if (ilkIndex == -1) {
            System.out.println("Aranan metin cumlede yok");
        } else if (ikinciIndex == -1) {
            System.out.println("Aranan metin cumlede sadece 1 kere kullanilmis");
        } else if (ucuncuIndex == -1) {
            System.out.println("Aranan metin cumlede 2 kere kullanilmis");
        } else {
            System.out.println("Aranan metin cumlede 2’den fazla kullanilmis");
        }

    }

}
