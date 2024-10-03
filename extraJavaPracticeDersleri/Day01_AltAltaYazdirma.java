package extraJavaPracticeDersleri;

public class Day01_AltAltaYazdirma {

    public static void main(String[] args) {

        /*
            12345 sayisinin herbir basamagini konsolda alt alta yazdirin.
            input: 12345
            output: 1
                    2
                    3
                    4
                    5
     */

        int sayi = 12345;

        int birlerBasamagi = sayi % 10;

        int onlarBasamagi = (sayi / 10) % 10;

        int yuzlerBasamagi = (sayi / 100) % 10;

        int binlerBasamagi = (sayi / 1000) % 10;

        int onBinlerBasamagi = (sayi / 10000) % 10;

        System.out.println(onBinlerBasamagi + "\n" + binlerBasamagi + "\n" + yuzlerBasamagi + "\n" + onlarBasamagi + "\n" + birlerBasamagi);

    }

}
