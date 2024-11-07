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

        isFourLetters(arr);

    }

    public static void isFourLetters(String[] arr) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() == 4) {

                list.add("\"" + arr[i] + "\"");
            }

        }

        System.out.println(list);

    }

}
