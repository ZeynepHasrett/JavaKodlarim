package javaPractice.day04;

public class C07_NestedForLoop {

    public static void main(String[] args) {

        /*
              Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.

                   *
                  * *
                 * * *
                * * * *
               * * * * *
       */

        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j < 6 - i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }

            System.out.println("");

        }

    }

}
