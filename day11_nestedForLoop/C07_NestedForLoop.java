package day11_nestedForLoop;

public class C07_NestedForLoop {

    public static void main(String[] args) {

        /*
            Asagidaki sekli yazdirin

                 * * * * * * * *
                 * * * * * *
                 * * * *
                 * *
         */


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 8 - (i * 2); j++) {

                System.out.print("* ");

            }

            System.out.println("");

        }

    }

}
