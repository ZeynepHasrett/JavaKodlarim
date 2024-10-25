package exercises.javaSorular.besinciHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q9 {

    public static void main(String[] args) {

        /*
            Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.
            not: Test datadaki değerleri kullanınız.

            Test Data:
            [1232, 1134,2345,1022]
            [Java, Python, PHP, C#, C Programming, C++]

            Beklenen Çıktı:
            [1022,1134,1232,2345]
            [C Programming, C#, C++, Java, PHP, Python]
         */

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1232, 1134, 2345, 1022));

        List<String> diller = new ArrayList<>(Arrays.asList("Java", "Python", "PHP", "C#", "C Programming", "C++"));

        Collections.sort(sayilar);
        System.out.println(sayilar);

        Collections.sort(diller);
        System.out.println(diller);


        /*
        2.YONTEM

        int[] sayilarList = {1232, 1134, 2345, 1022};
        Arrays.sort(sayilarList);
        System.out.println(Arrays.toString(sayilarList));

        String[] dillerList = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(dillerList);
        System.out.println(Arrays.toString(dillerList));
        */

    }

}
