package exercises.javaSorular.altinciHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q7 {

    public static void main(String[] args) {

        /*
            Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

            Array: [1232,2345,5467,678,3454,2312,3451]
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(1232, 2345, 5467, 678, 3454, 2312, 3451));

        Collections.sort(list);

        System.out.println(list);

        System.out.println(list.get(list.size() - 2));

    }

}
