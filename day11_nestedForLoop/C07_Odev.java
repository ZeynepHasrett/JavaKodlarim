package day11_nestedForLoop;

public class C07_Odev {

    public static void main(String[] args) {

        /*
            Asagidaki sekli cizdiren kodu yaziniz

                1
               1 2
              1 2 3
             1 2 3 4

        */


        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j < 5 - i; j++) {

                System.out.print(" ");

            }


            for (int j = 1; j <= i; j++) {

                System.out.println(j + " ");

            }

            System.out.println("");

        }

    }

}


