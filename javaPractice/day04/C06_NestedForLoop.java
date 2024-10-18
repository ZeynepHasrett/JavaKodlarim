package javaPractice.day04;

public class C06_NestedForLoop {

    public static void main(String[] args) {

        /*
            Asagidaki sekli yazdiracak kodu yaziniz.

                      1
                     1 1
                    1 2 1
                   1 2 2 1
                  1 2 3 2 1
                 1 2 3 3 2 1
         */

        int row = 6;

        for (int i = 1; i < row; i++) {

            for (int j = 0; j < row; j++) {
                System.out.print(" ");
            }

            int number = 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");

                if (j <= i / 2) {
                    number++;
                } else {
                    number--;
                }

            }

            System.out.println();

        }

    }

}
