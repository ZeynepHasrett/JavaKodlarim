package EXERCISES.javaSorular;

import java.util.Scanner;

public class Q8_VucutKitleEndeksiHesaplama {

    public static void main(String[] args) {

        /*
            Kullanicidan kilosunu ve boyunu alip
            Vucut kitle indeksini hesaplayan bir program yaziniz.
            Ipucu :
            Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)

            ORNEK:
            INPUT      : Kilo: 71
                         Boy: 1,72
            OUTPUT     : Vucut Kitle Indeksiniz : 23
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu m olarak giriniz");
        double boy = scan.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz : " + (int) vki);

    }

}
