package exercises.javaSorular.altinciHafta;

public class Q2 {

    public static void main(String[] args) {

        /*
             Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

             Array =  [20, 30, 25, 35, -16, 60, -100 ]

             Beklenen Çıktı:
             Array Sayılarının ortalaması: 7.0
        */

        int[] array = {20, 30, 25, 35, -16, 60, -100};

        int toplam = 0;
        double ort = 0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }

        ort = toplam / array.length;

        System.out.println("Array Sayılarının ortalaması: " + ort);

    }

}
