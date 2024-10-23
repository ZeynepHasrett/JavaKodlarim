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

            if (input.equals("e")) {
                System.out.println("Veri girisi sonlandirildi.");
                break;
            } else {
                double sicaklik = Double.parseDouble(input);
                sicakliklar.add(sicaklik);
            }

        }

        Collections.sort(sicakliklar);

        System.out.println("Gunun en dusuk sicaklik degeri : " + sicakliklar.get(0));
        System.out.println("Gunun en yuksek sicaklik degeri : " + sicakliklar.get(sicakliklar.size() - 1));

    }

}
