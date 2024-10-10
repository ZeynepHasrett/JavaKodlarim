package day15_arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {

    public static void main(String[] args) {

        int[] sayilar = {3, 5, 6};

        // sayilar array'ine 4. element olarak (yani 3. index'e) 8 ekleyin
        // array [3, 5, 6, 8] haline getirin

        // sayilar[3] = 8; // ArrayIndexOutOfBoundsException

        // sayilar = {3, 5, 6, 8};
        // Daha once olusturulmus bir array'e bu sekilde yeni deger atamasi YAPILAMAZ

        // sayilar = new int[4]; // [0, 0, 0, 0]
        // eger direkt deger atamasi olarak new int[4] dersek tum elemanlar 0 olur

        // 1.adim once yeni bir array olusturalim
        //        bu yeni array'in kapasitesi (yani length) eskiden 1 fazla olsun

        int[] yeniArr = new int[sayilar.length + 1]; // [0, 0, 0, 0]

        // 2.adim yeni array 0'lardan olusur
        //        oncelikle eski array'deki elementleri yeni array'a kopyalamaliyiz

        for (int i = 0; i < sayilar.length; i++) {
            yeniArr[i] = sayilar[i];
        } // [3, 5, 6, 0]

        // 3.adim sonda kalan tek 0 yerine eklemek istedigimiz sayiyi atayalim

        yeniArr[yeniArr.length - 1] = 8;

        // 4.adim eklemeyi yeni array'a yaptik
        //         eski array'e yeni array'i deger olarak atayalim

        sayilar = yeniArr;

        System.out.println("sayilar array'inin son hali : " + Arrays.toString(sayilar));

    }

}
