package day18_arrayLists_ForEachLoop;

import java.util.*;

public class C06_SayiBulmaca {

    public static void main(String[] args) {

        /*
             0 ile 100 arasinda rastgele bir sayi olusturun
             Kullanicilardan herkesin bir sayi tahmin etmesini isteyin
             girilen sayilari bir liste olarak kaydedin
             Kullanicilar negatif bir sayi girdiginde
             - olusturulan rastgele sayiyi
             - yapilan tahminleri
             - rastgele sayiya en yakin tahmini yazdirin
         */

        Random random = new Random();
        int tutulanSayi = random.nextInt(100);

        int girilenSayi = 0;

        List<Integer> tahminlerListesi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Bir tahmin giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi >= 0) {
                tahminlerListesi.add(girilenSayi);
            }

        } while (girilenSayi >= 0);

        System.out.println("Tuttugum sayi : " + tutulanSayi);
        System.out.println("Yapilan tahminler listesi : " + tahminlerListesi);

        int enYakinTahmin = tahminlerListesi.get(0);
        int enAzFark = enYakinTahmin > tutulanSayi ? enYakinTahmin - tutulanSayi : tutulanSayi - enYakinTahmin;

        for (int each : tahminlerListesi) {

            int eachFark = each > tutulanSayi ? each - tutulanSayi : tutulanSayi - each;

            if (eachFark < enAzFark) {
                enYakinTahmin = each;
                enAzFark = eachFark;
            }

        }

        System.out.println("En yakin Tahmin : " + enYakinTahmin);

    }

}
