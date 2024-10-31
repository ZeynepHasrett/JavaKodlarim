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

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                sonuc = false;
            } else {
                return sonuc;
            }

        }

        return sonuc;

    }

}
