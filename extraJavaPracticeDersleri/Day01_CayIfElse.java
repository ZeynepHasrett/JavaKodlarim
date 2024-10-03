package extraJavaPracticeDersleri;

import java.util.Scanner;

public class Day01_CayIfElse {

    public static void main(String[] args) {

        /*
            Kullaniciya
            * 1 = Gunde kac bardak cay ictigini,
            * 2 = Her bardak icin kac kup seker kullandigini sorup;
            kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
            * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
            (1 kup seker = 2.77 gr)
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsunuz?");
        double bardak = scan.nextDouble();

        System.out.println("Her bardak icin kac adet kup seker kullaniyorsunuz?");
        double seker = scan.nextDouble();


        // seker kullanmayanlar icin
        if (seker == 0) {
            System.out.println("Aferin, boyle devam et :)");
        }


        // seker kullananlar icin
        if (seker > 0) {
            double yillikSekerTuketimi = (bardak * seker * 2.77) * 365 / 1000;
            double kirkYillikSekerTuketimi = yillikSekerTuketimi * 40;

            System.out.println("Yillik seker tuketiminiz : " + yillikSekerTuketimi);
            System.out.println("Kirk yillik seker tuketiminiz : " + kirkYillikSekerTuketimi);
        }

    }

}
