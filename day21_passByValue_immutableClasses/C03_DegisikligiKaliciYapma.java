package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {

    public static void main(String[] args) {

        /*
                Verilen bir metin kac kelimeden olusursa olussun
                her kelimenin ilk harfini buyuk, kalan harflerini kucuk olarak duzenleyip
                metnin son halini bize donduren bir method olusturun

                input  : ali okula git
                output : Ali Okula Git
         */

        System.out.println(metniDuzenle("ali okula git"));


        // Kullanicidan ismini ve soyismini isteyin
        // girilen isim ve soyismi metni duzenle method'u ile duzenleyip yeni haliyle kaydedin
        // isim ve soyismi bu haliyle kaydedin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        isim = metniDuzenle(isim);
        soyisim = metniDuzenle(soyisim);

        System.out.println("Duzenli Hali : " + isim + " " + soyisim);

    }

    public static String metniDuzenle(String metin) { // "ali okula git"

        String[] kelimelerArr = metin.split(""); // [ali, okula, git]

        String yeniMetin = "";

        for (int i = 0; i < kelimelerArr.length - 1; i++) { // son kelime haric

            yeniMetin += (kelimelerArr[i].substring(0, 1).toUpperCase() +
                    kelimelerArr[i].substring(1).toLowerCase() +
                    " ");
        }

        yeniMetin += (kelimelerArr[kelimelerArr.length - 1].substring(0, 1).toUpperCase() +
                kelimelerArr[kelimelerArr.length - 1].substring(1).toLowerCase());

        return yeniMetin;

    }

}
