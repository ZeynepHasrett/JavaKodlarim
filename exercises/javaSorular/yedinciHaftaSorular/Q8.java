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

    public static int farkBul(int[] arr){

        int enBuyukSayi = 0;
        int enKucukSayi = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enBuyukSayi){
                enBuyukSayi = arr[i];
            }
            if(arr[i] > enKucukSayi ){

            }

            if (arr[i] < arr[i+1]){
                enKucukSayi = arr[i];
                enBuyukSayi = arr[i+1];
            }

        }

        int fark = enBuyukSayi - enKucukSayi;

        return fark;

    }

}
