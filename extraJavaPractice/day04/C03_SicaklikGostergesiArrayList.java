package extraJavaPractice.day04;

import java.util.*;

public class C03_SicaklikGostergesiArrayList {

    public static void main(String[] args) {

        /*
            Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
            "e" girildiğinde veri girişi sonlandırılsın.
            Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sicaklik degerlerini giriniz, veri girisini sonlandirmak icin e'ye basiniz");

        List<Double> sicakliklar = new ArrayList<>();

        while (true) {

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Veri girisi sonlandirildi.");
                break;
            } else if (input.matches("-?\\d++(\\.\\d+)?")) {
                double girilenSicaklik = Double.parseDouble(input);
                sicakliklar.add(girilenSicaklik);
            } else {
                System.out.println("Gecersiz veri girisi!");
            }

        }

        if (!sicakliklar.isEmpty()) {
            Collections.sort(sicakliklar);
            System.out.println("Gunun en dusuk sicaklik degeri : " + sicakliklar.get(0));
            System.out.println("Gunun en yuksek sicaklik degeri : " + sicakliklar.get(sicakliklar.size() - 1));
        } else {
            System.out.println("Liste bos, hic deger girilmedi");
        }

    }

}
