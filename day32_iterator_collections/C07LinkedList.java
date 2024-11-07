package day32_iterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C07LinkedList {

    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        System.out.println(sayilar.hashCode());

    }

}
