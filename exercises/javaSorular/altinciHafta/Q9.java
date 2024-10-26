package exercises.javaSorular.altinciHafta;

import javax.lang.model.util.ElementScanner7;
import java.util.Arrays;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        /*
            Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın
            ve tersine çevrilmiş halini String'e atayın.

            Test Data:
            sentence -> "Java is fun"
            reversed -> "fun is Java"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        String[] arr = cumle.split(" ");

        String yeniCumle = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            yeniCumle += arr[i] + " ";
        }

        cumle = yeniCumle;
        System.out.println(cumle);

    }

}
