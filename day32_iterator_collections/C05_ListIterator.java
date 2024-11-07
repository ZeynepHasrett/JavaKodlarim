package day32_iterator_collections;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2,36,12,34,23,25,15,9,203));

        // List icindeki elemanlari her birini 2 artiriniz

        ListIterator lit = list.listIterator();



    }

}
