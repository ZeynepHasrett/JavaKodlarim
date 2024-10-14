package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip
        // array'i her sayidan sadece bir tane bulunacak şekilde kaydedin
        // ornek input  : {2,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : {1,2,3,4,5}

        int[] arr = {2, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1};


        List<Integer> tekrarsizList = new ArrayList<>();

        // arr'deki tum elementleri gozden gecirip
        // tekrarsiz list'de yoksa ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }

        }

        System.out.println("Tekrarsiz Liste : " + tekrarsizList); // Tekrarsiz Liste : [2, 4, 5, 3, 1]
        // arr'deki tekrar etmeyen sayilari bulduk
        // ama henuz gorev bitmedi
        // arr ile ilgili bir islem yapmadik, tekrarsiz elementler list'e kaydedildi

        Collections.sort(tekrarsizList); // [2, 4, 5, 3, 1]

        arr = new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        Arrays.sort(arr);

        System.out.println("arr'nin son hali : " + Arrays.toString(arr)); // [2, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1]

    }

}
