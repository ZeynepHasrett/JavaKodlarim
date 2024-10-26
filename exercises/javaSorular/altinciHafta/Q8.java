package exercises.javaSorular.altinciHafta;

public class Q8 {

    public static void main(String[] args) {

        /*
            Array içerisindeki tek ve çift sayıların
            kaçar tane olduğunu bulan Java Kodu yazınız.

            Array: [1,2,3,4,5,6,7,8,9]

            Beklenen Çıktı:

            Tek Sayilar: 5
            Cift Sayilar: 4
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int tekSayilarTop = 0;
        int ciftSayilarTop = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                ciftSayilarTop++;
            } else {
                tekSayilarTop++;
            }

        }

        System.out.println("Tek sayilar : " + tekSayilarTop);
        System.out.println("Cift sayilar : " + ciftSayilarTop);

    }

}
