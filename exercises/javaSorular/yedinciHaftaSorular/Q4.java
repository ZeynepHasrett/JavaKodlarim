package exercises.javaSorular.yedinciHaftaSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

        /*
            String array dizisindeki 4 harfli kelimeleri return eden methodu yazınız.

            Test Data:
            isFourLetters(["Tomato", "Potato", "Pair"])
            ["Pair"]
         */

        String[] arr = {"Tomato", "Potato", "Pair"};

        System.out.println(isFourLetters(arr));

    }

    public static List<String> isFourLetters(String[] arr) {

        List<String> dortHarfli = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() == 4) {
                dortHarfli.add(arr[i]);
            }

        }

        return dortHarfli;

    }

}
