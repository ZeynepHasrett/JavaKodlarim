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

        int maxSatir = 7;//n  satir sayisi

        int number = 0;// M =


        for (int satir = 1; satir <= maxSatir; satir++) {

            for (int t = 0; t < maxSatir - satir; t++) {

                System.out.print(" ");

            } // once bastaki bosluklari yaziyor


            if (satir % 2 == 0) { // satir sayisi cift ise


                number = satir / 2;


                for (int i = 1; i <= number; i++) { // ilk for  1'dan satirin yarisina kadar yazdiriyor
                    // orn satir 6 ise  1 2 3
                    System.out.print(i + " ");

                }

                for (int i = number; i >= 1; i--) { // ikinci for  satirin yarisindan 1'e  kadar  yazdiriyor
                    // orn satir 6 ise  3 2 1
                    System.out.print(i + " ");
                }
            } else {   // satir sayisi tekse
                number = (satir + 1) / 2;


                for (int i = 1; i <= number; i++) { // ilk for  1'dan satirin yarisi+1 e kadar yazdiriyor
                    // orn satir 5 ise  1 2 3
                    System.out.print(i + " ");

                }

                for (int i = number - 1; i >= 1; i--) { // ikinci for  satirin yarisindan 1'e kadar  yazdiriyor
                    // orn satir 5 ise  2 1
                    System.out.print(i + " ");

                }

            }
            System.out.println(" ");

        }

    }

}
