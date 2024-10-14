package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArtirma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 1, 9, 3));

        // sayilar listesindeki tum elementleri 4 artirin

        listeninElementleriniArtir(sayilar, 4);

        System.out.println("Listenin son hali : " + sayilar);
        // [8, 10, 5, 13, 7]

        // elementleri tekrar 1 artirin
        listeninElementleriniArtir(sayilar, 1);

        System.out.println("Listenin son hali : " + sayilar);
        // Listenin son hali : [9, 11, 6, 14, 8]

    }

    // Verilen Integer bir listedeki tum elementleri
    // istenen bir deger kadar artirip donduren bir method olusturun

    public static List<Integer> listeninElementleriniArtir(List<Integer> eskiListe, int artisMiktari) {

        for (int i = 0; i < eskiListe.size(); i++) {

            // i.index'teki elementi alip
            int eskiDeger = eskiListe.get(i);
            // uzerine artis miktari kadar ekleyip
            int yeniDeger = eskiDeger + artisMiktari;
            // i.index'teki elementi bu yeni deger olarak update edecegiz
            eskiListe.set(i, yeniDeger);

        }

        return eskiListe;

    }

}
