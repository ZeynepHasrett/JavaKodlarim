package day22_immutableClasses_dateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class C05_FarkliLokasyonIcinSaat {

    public static void main(String[] args) {

        /*
            LocalTime class'i ile

            - herhangi bir andaki local zamani kaydedebiliriz
            - herhangi bir anda herhangi bir saat dilimindeki (ZoneId) zamani kaydedebiliriz
            - Verilen iki localtime arasindaki zaman dilimini bulabiliriz
            - localTime'dan
                - get() ile zamanin istenen bolumunu alabilirim
                - with() ile zamanin belirli bir bolumunu istedigimiz deger ile degistirebilirim
                - plus() ile zamani istedigimiz kadar ileri alabiliriz
                - minus() ile zamani istedigimiz kadar geri alabiliriz
            - farkli zamanlari isAfter veya isBefore ile karsilastirabiliriz
         */


        // su anda Japonya'daki saati yazdirin
        LocalTime timeJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(timeJaponya);


        // su anda Londra'daki saati yazdirin
        LocalTime timeLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(timeLondon);


        // su anda New York'daki saati yazdirin
        LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(timeNewYork);


        // su anda Denver'daki saati yazdirin
        LocalTime timeDenver = LocalTime.now(ZoneId.of("America/Denver"));
        System.out.println(timeDenver);


        // saat 11:25:12 00000 icin local saat olusturun
        LocalTime localTime1 = LocalTime.of(11, 25, 12, 0);

        // saat 02:29:19 00000 icin local saat olusturun
        LocalTime localTime2 = LocalTime.of(2, 29, 19, 0);

        // aralarindaki sure farkini bulalim
        System.out.println(Duration.between(localTime2, localTime1)); // PT8H55M53S


        System.out.println(localTime1.isAfter(localTime2)); // true

        System.out.println(localTime1.isBefore(localTime2)); // false

    }

}
