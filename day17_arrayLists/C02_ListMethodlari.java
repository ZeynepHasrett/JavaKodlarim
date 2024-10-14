package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5, 7, 2, 9, 1));

        System.out.println(sayilar); // [5, 7, 2, 9, 1]


        // Listede kac element oldugunu yazdirin
        System.out.println(sayilar.size()); // 5

        // Listede element olarak 'nin var olup olmadigini yazdirin
        System.out.println(sayilar.contains(7)); // true
        System.out.println(sayilar.contains(17)); // false

        // Listede varsa 2'nin ilk index'ini verin
        System.out.println(sayilar.indexOf(2)); // 2

        // Listede varsa 2'nin son kullanilma index'ini verin
        System.out.println(sayilar.lastIndexOf(2)); // 2

        //Listede varsa 8'in ilk index'ini yazdirin
        System.out.println(sayilar.indexOf(8)); // -1

        // Listede 2 icin asagidaki cumlelerden uygun olani yazdirin
        // Listede 2 yok
        // Listede 2 sadece bir tane var
        // Listede 2 1'den fazla var

        if (sayilar.indexOf(2) == -1) {
            System.out.println("Listede 2 yok");
        } else if (sayilar.indexOf(2) == sayilar.lastIndexOf(2)) {
            System.out.println("Listede 2 sadece bir tane var");
        } else {
            System.out.println("Listede 2 1'den fazla var");
        }

        sayilar.clear();
        System.out.println(sayilar); // []



    }

}
