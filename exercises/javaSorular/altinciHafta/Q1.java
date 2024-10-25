package exercises.javaSorular.altinciHafta;

public class Q1 {

    public static void main(String[] args) {

        /*
            Array'deki sayıları toplayan Java kodunu yazınız.

            array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

            Beklenen Çıktı:
            Array toplamı: 55
        */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int toplam = 0;

        for (int each : array) {
            toplam += each;
        }

        System.out.println("Array toplami: " + toplam);

    }

}
