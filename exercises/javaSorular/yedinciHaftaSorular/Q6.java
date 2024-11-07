package exercises.javaSorular.yedinciHaftaSorular;

public class Q6 {

    public static void main(String[] args) {

        /*
            Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

            Test Data:
            isPrime(31)
            true

            isPrime(18)
            false
         */

        System.out.println(isPrime(18));

    }

    public static boolean isPrime(int sayi) {

        boolean sonuc = true;

        for (int i = 2; i <= sayi/2 +1; i++) { // herhangi bir sayinin yarisindan buyuk sayilar, o sayiya tam bolunemez

            if (sayi % i == 0) {
                sonuc = false;
                break;
            }

        }

        return sonuc;

    }

}
