package day33_collections_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList();

        // deque double ==> ended queue,
        //                  kuyruk ama iki taraftan da ekleme cikarma yapabilirsin
        // Butun methodlari ...First() ve ...Last'lari vardir

        deque.add(23);
        deque.addFirst(45);

        System.out.println(deque); // [45, 23]

        deque.addLast(34);

        System.out.println(deque); // [45, 23, 34]

        deque.removeFirstOccurrence(23); // en bastaki elemani degil, 23'un ilk kullanimini siler
        deque.removeFirst(); // bastaki degerin ne olduguna bakmadan bastaki elemani siler

        deque.push(67);
        // This method is equivalent to addFirst.
        // Eger kapasite sinirlamasi yoksa deque'in basina ekler

        deque.addFirst(98); // hicbir seye bakmadan 98'i basa ekler

    }

}


