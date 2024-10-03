package day11_NestedForLoop;

public class C05_NestedForLoop {

    public static void main(String[] args) {

       /*
            Asagidaki sekli cizdirecek kodu yaziniz

            *
            * *
            * * *
            * * * *
            * * * * *
        */


        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("* ");
            }

            System.out.println("");

        }

    }

}
