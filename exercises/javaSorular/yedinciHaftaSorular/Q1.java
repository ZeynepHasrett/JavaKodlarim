package exercises.javaSorular.yedinciHaftaSorular;

import java.time.LocalDate;
import java.time.LocalTime;

public class Q1 {

    public static void main(String[] args) {

        /*
            Saati saniyeye çeviren java methodunu yazınız.

            Test Data:
            howManySeconds(2);
            Beklenen çıktı:
            7200
        */

        System.out.println(howManySeconds(2));

    }

    public static int howManySeconds(int saat) {

        int saniye = saat * 60 * 60;
        return saniye;

    }

}
