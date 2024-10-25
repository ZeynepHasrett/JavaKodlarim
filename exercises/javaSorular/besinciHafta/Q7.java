package exercises.javaSorular.besinciHafta;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        /*
            Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

            Test Data:
            java is fun

            Beklenen Çıktı:
            Stringdeki sesli harf sayısı: 4
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        sesliHarfSayisi(metin);

    }

    public static void sesliHarfSayisi(String metin) {

        String[] harfler = metin.split("");

        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if (harfler[i].equalsIgnoreCase("a") || harfler[i].equalsIgnoreCase("e") ||
                    harfler[i].equalsIgnoreCase("i") || harfler[i].equalsIgnoreCase("o") ||
                    harfler[i].equalsIgnoreCase("u")) {
                sayac++;
            }

        }

        System.out.println("Stringdeki sesli harf sayisi : " + sayac);

        /*
        int sayac = 0;

        for (int i = 0; i < metin.length(); i++) {
            char chr = metin.toLowerCase().charAt(i);

            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                sayac++;
            }
        }

        System.out.println("Stringdeki sesli harf sayisi : " + sayac);
        */

    }

}
