package exercises.javaSorular.yedinciHaftaSorular;

public class Q8 {

    public static void main(String[] args) {

        /*
            Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

            Örnek -
            farkBul([10, 15, 20, 2, 10, 6])
            18
         */

        int[] arr = {10, 15, 20, 2, 10, 6};

        System.out.println(farkBul(arr));

    }

    public static int farkBul(int[] arr) {

        int enBuyukSayi = arr[0];

        int enKucukSayi = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > enBuyukSayi) {
                enBuyukSayi = arr[i];
            } else if (enKucukSayi > arr[i]) {
                enKucukSayi = arr[i];
            }

        }

        int fark = enBuyukSayi - enKucukSayi;

        return fark;

    }

}
