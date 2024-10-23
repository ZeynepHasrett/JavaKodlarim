package extraJavaPractice.day04;

import java.util.Scanner;

public class C02_SicaklikGostergesi2 {

    public static void main(String[] args) {
        
        /*
            Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
            "e" girildiğinde veri girişi sonlandırılsın.
            Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);

        double maxSicaklik = Double.MIN_VALUE;
        double minSicaklik = Double.MAX_VALUE;

        System.out.println("Lutfen sicaklik degerlerini giriniz, veri girisini sonlandirmak icin e'ye basiniz");

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("e")) {
                System.out.println("Veri girisi sonlandirildi.");
                break;
            } else if (!input.matches("-?\\d++(\\.\\d+)?")) {
                System.out.println("Gecersiz giris. Lutfen sadece e giriniz");
                continue;
            }

            /*
                    -?       negatif degerdeki sayilar icin
                    \\d      0-9 arasi rakamlar icin
                    +        basamak kazandirmak icin
                    \\.\\d+  ondalikli kisim icin
            */

            double sicaklik = Double.parseDouble(input);

            if (sicaklik > maxSicaklik) {
                maxSicaklik = sicaklik;
            }

            if (sicaklik < minSicaklik) {
                minSicaklik = sicaklik;
            }

        }

        System.out.println("Gunun en yuksek sicaklik degeri : " + maxSicaklik);
        System.out.println("Gunun en dusuk sicaklik degeri : " + minSicaklik);

    }

}


