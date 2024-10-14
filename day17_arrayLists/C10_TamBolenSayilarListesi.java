package day17_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_TamBolenSayilarListesi {

    public static void main(String[] args) {

        // 30 sayisini tam bolebilen pozitif tamsayilari
        // bir liste olarak yazdirin

        System.out.println(tamBolenlerListesi(30));

        // tamBolenlerListesi methodunu kullanarak
        // 2 basamakli asal sayilari yazdirin

        for (int i = 10; i <= 99; i++) {

            int bolenSayisi = tamBolenlerListesi(i).size();

            if (bolenSayisi == 2) {

                System.out.print(i + " ");
            }

        }

    }

    // Verilen pozitif bir tamsayiyi,
    // tam bolebilen tum pozitif tamsayilari bir liste olarak
    // bize donduren bir method olusturun.

    public static List<Integer> tamBolenlerListesi(int sayi) {

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                tamBolenlerListesi.add(i);
            }

        }

        return tamBolenlerListesi;

    }

}
