package day22_immutableClasses_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime localTimeBaslangic = LocalTime.now();

        // LocalTime class'i obje olustrudugumuz satir calistiginda
        // calistigi sistemdeki zaman bilgisini alir

        // olusturulan localTime objesi bir kronometre degil
        // olusturukdugu andaki degeri saklayan basit bir variable'dir

        System.out.println("Loop'dan once localtime" + localTimeBaslangic); // Loop'dan once localtime12:52:26.221981200


        for (int i = 0; i < 1000000000; i++) {
            String str = "" + i + 1;
        }

        LocalTime localTimeBitis = LocalTime.now();
        System.out.println("Loop'dan sonra localtime" + localTimeBitis); // Loop'dan sonra localtime12:52:26.228977300

        System.out.println((localTimeBitis.getSecond() - localTimeBaslangic.getSecond())); // 28

        // .get.. localTime degerindeki saat, dakika, saniye veya nanosaniyeyi bize getirir

        System.out.println(Duration.between(localTimeBitis, localTimeBitis)); //

        // .with.. localTime degerindeki saat, dakika, saniye veya nanosaniyeyi
        // istedigimiz deger olarak ayarlar
        System.out.println(localTimeBitis.withHour(20));
        System.out.println(localTimeBitis.withMinute(0));
        System.out.println(localTimeBitis.withSecond(0).withNano(0));

        // .plus.. veya .minus.. localTime degerindeki saat, dakika, saniye veya nanosaniyeyi
        // istedigimiz kadar leri veya geri alir
        System.out.println(localTimeBitis.plusHours(29).plusMinutes(17));

        System.out.println(localTimeBitis.minusHours(217));

        // gunun baslangici olan 00:00'dan localTimeBaslangic zamanina kadar gecen toplam saniye
        System.out.println(localTimeBaslangic.toSecondOfDay());

        // gunun baslangici olan 00:00'dan localTimeBaslangic zamanina kadar gecen toplam nanosaniye
        System.out.println(localTimeBaslangic.toNanoOfDay());


        // yukaridaki loop islem suresinin baslangic ve bitis saniyeleri ile bulalim
        System.out.println(localTimeBitis.toSecondOfDay() - localTimeBaslangic.toSecondOfDay());

        // yukaridaki loop islem suresinin baslangic ve bitis nanosaniyeleri ile bulalim
        System.out.println(localTimeBitis.toNanoOfDay() - localTimeBaslangic.toNanoOfDay());

    }

}
