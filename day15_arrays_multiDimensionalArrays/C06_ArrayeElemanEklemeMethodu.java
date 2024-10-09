package day15_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArrayeElemanEklemeMethodu {

    public static void main(String[] args) {

        // Verilen String bir array'in sonuna
        // verilen yeni bir metni eleman olarak ekleyip
        // array'in yeni halini bize donduren bir method olusturun

        String[] isimler = {"Ali", "Hamza"};

        isimler = arrayeElementEkle(isimler, "Can");

        System.out.println("Can eklenmis hali : " + Arrays.toString(isimler));
        // Can eklenmis hali : [Ali, Hamza, Can]

        isimler = arrayeElementEkle(isimler, "Serat");
        System.out.println("Serat eklenmis hali : " + Arrays.toString(isimler));
        // Serat eklenmis hali : [Ali, Hamza, Can, Serat]


    }

    public static String[] arrayeElementEkle(String[] eskiArray, String eklenecekYeniElement) {

        // 1.adim yeni array olustur
        String[] yeniArr = new String[eskiArray.length + 1];

        // 2.adim eski array'deki elementleri yeni array'a kopyala

        for (int i = 0; i < eskiArray.length; i++) {

            yeniArr[i] = eskiArray[i];

        }

        // 3.adim sonda kalan elemana eklenecek yeni element degerini atayalim
        yeniArr[yeniArr.length - 1] = eklenecekYeniElement;

        // 4. eski array'e yeni array degerini atayalim
        eskiArray = yeniArr;

        return eskiArray;

        // 4.adim sart degil. 4.adimi yapmayip yeniArray'i return etsek de olur
    }

}
