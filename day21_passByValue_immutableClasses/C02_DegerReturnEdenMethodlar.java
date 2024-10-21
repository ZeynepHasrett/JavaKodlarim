package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {

    public static void main(String[] args) {

        /*
            Verilen isim ve soyismi duzenleyip
            ilk harfleri buyuk, geriye klan harfler kucuk olacak sekilde
            "Isim Soisim" halinde bize donduren bir method olusturun

            kullanicidan isim ve soyisim alip
            method'ta duzenleyip yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.nextLine();

        System.out.println(ismiDuzenle(isim, soyIsim));

    }

    public static String ismiDuzenle(String isim, String soyisim) {

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

        String duzenlenmisIsim = isim + " " + soyisim;

        return duzenlenmisIsim;
    }

}
