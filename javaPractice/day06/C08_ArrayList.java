package javaPractice.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_ArrayList {

    public static void main(String[] args) {

        /*
            Bir öğretmenden girmek istediği kadar notu alınız, ve
            ortalamayı geçen öğrenci sayısını bulunuz.
         */

        List<Double> notlar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Not girmek istiyor musunuz: (E / H ): ");
        char devam = scanner.next().toUpperCase().charAt(0);

        while (devam == 'E') {
            System.out.print("Notu giriniz: ");
            notlar.add(scanner.nextDouble());
            System.out.print("Yeni not girecek misiniz: (E / H ): ");
            devam = scanner.next().toUpperCase().charAt(0);
        }

        double toplam = 0;

        for (int i = 0; i < notlar.size(); i++) {
            toplam += notlar.get(i);
        }

        double ortalama = toplam / notlar.size();

        System.out.println("Girilen notlarin ortalamasi: " + ortalama);

        List<Double> ortGecen = new ArrayList<>();

        for (Double each : notlar) {
            if (each > ortalama) {
                ortGecen.add(each);
            }

        }

        System.out.println("Ortalamanin ustundeki ogrenci sayisi: " + ortGecen.size());

    }

}
