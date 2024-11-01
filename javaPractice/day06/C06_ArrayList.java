package javaPractice.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(35);
        list.add(12);
        System.out.println(list);

        System.out.println("====================================");

        List<String> meyveler = new ArrayList<>(Arrays.asList("elma", "armut", "muz", "ananas"));
        System.out.println(meyveler);

        System.out.println("====================================");

        ArrayList<String> sehirler = new ArrayList<>(List.of("Bursa", "Istanbul", "Kirklareli"));
        System.out.println(sehirler);

    }

}
