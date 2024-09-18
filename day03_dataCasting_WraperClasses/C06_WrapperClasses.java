package day03_dataCasting_WraperClasses;

public class C06_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        int sayi =20;

        /*
            Primitive'lerin hazir metodlari olmaz
            Java primitive data turlerinin de bazi hazir metodlari kullanabilmeleri icin
            ayni isimlerde Warrer Clas'lar olusturmustur

            boolean - char - byte - short - integer - long - float - double
            Boolean - Character - Byte - Short - Integer - Long - Float - Double
         */

        byte byt1 = 24;

        int sayi1 = byt1; // Auto Widening - Otomatik Genisletme

        short shr1 = (short)sayi1; // Explicit Narrowing - Zorla Daraltma

        int sayi2 = 45;
        Integer sayi3 = sayi2;

        Boolean bl1 = true;
        boolean bl2 = bl1;

        // Sayi barindiran primitive data turleri arasinda casting mumkun
        // Ayni isimdeki primitive ile wrapper class'lar arasinda da gecis mumkundur
        // ANCAK farkli wrapper class'lari
        // ya da farkli isimdeki bir primitive ile Wrapper Class arasinda casting mumkun degildir

        Integer sayi4 = 45;

        // Double sayi6 = sayi4; // Double <== Integer

        int sayi7 = sayi4; // int <== Integer

        // short sayi8 = sayi4; // short <== Integer

    }
}
