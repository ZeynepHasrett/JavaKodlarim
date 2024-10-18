package javaPractice.day04;

import java.util.Scanner;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*
             Aşağıdaki şekilde çıktı veren programı print içerisinde
             sadece bir tane # kullanarak yazdırınız

                        # # # # #
                        # # # # #
                        # # # # #
                        # # # # #
                        # # # # #
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Satir Sayisi: ");
        int row = scanner.nextInt();

        System.out.println("Sutun Sayisi: ");
        int column = scanner.nextInt();

        String symbol = "#";

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(symbol + " ");
            }

            System.out.println("");

        }

    }

}
