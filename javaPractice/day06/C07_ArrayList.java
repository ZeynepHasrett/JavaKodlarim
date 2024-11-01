package javaPractice.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArrayList {

    public static void main(String[] args) {

        /*
            Input olarak verilen listteki isimlerden
            icinde 'a' harfi bulunanlari silen bir program yaziniz

            INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
            OUTPUT : [Veli,Omer]
         */

        List<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        System.out.println(list);
        System.out.println("==================================");

        List<String> yeniList = new ArrayList<>();

        for (String each : list) {
            if (!each.toLowerCase().contains("a")) {
                yeniList.add(each);
            }
        }

        System.out.println("OUTPUT : " + yeniList);

    }

}
