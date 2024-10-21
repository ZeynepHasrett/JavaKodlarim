package day21_passByValue_immutableClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_BirdenFazlaElemanBarindiranYapilar {

    public static void main(String[] args) {

        /*
            Java'da array ve arrayList gibi birden fazla element barindiran yapilarda
            Java method'ta yapilan degisikligin
            elementlere mi yoksa array/arrayList'in kendisine mi yapildigina bakar
            Elementler degistiyse Java bu degisikligi kabullenir, hata vermez
            AMA array veya arrayList'in kendisine atama yapilirsa
            bu degisikligi kbul etmez
            main method'ta olusturulan halini kullanir
         */

        int[] arr = {3, 5, 6};

        // array'in elementlerini birer artirip son halini yazdiran bir method olusturun
        elementleriBirArtir(arr); // Method'da [4, 6, 7]

        System.out.println("Main method'da method call'dan sonra arr : " + Arrays.toString(arr));
        // sadece elementler degisirse Java bu degisikligi kabullenir
        // Main method'da method call'dan sonra arr : [4, 6, 7]



        // array'e 5 uzunlugunda ve icinde 4,7,8,3,1 elementleri olan yeni bir array atayip
        // array'i yazdiran method olusturun
        yeniArrAta(arr); // Method'da array'in son hali : [4, 7, 8, 3, 1]

        System.out.println("Main method'da 2. method call'dan sonra arr : " + Arrays.toString(arr));
        // 2.method'da ara'nin elementlerine degil direkt kendisine yeni deger ataniyor
        // Java bu degisikligi kabul etmez
        // main method'daki son halini yazdirir
        // Main method'da 2. method call'dan sonra arr : [4, 6, 7]

    }

    public static void elementleriBirArtir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 1; // array'in elementlerine atama yapiliyor

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void yeniArrAta(int[] arr){

        int[] yeniArr = {4,7,8,3,1};

        arr = yeniArr; // array'in kendisine atama yapiliyor

        System.out.println("Method'da array'in son hali : " + Arrays.toString(arr));

    }

}

