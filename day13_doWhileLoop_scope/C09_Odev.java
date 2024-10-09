package day13_doWhileLoop_scope;

public class C09_Odev {

    public static void main(String[] args) {

        /*

            Asagidaki sekli cizdirecek kodu yaziniz

                1
               1 1
              1 2 1
             1 2 2 1
            1 2 3 2 1
           1 2 3 3 2 1


         */

        for (int i = 1; i <= 6; i++) {

            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");

        }

    }

}
