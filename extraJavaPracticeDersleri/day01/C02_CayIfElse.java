package extraJavaPracticeDersleri.day01;

import java.util.Scanner;

public class C02_CayIfElse {

    public static void main(String[] args) {

        /*
            Kullaniciya
            * 1 = Gunde kac bardak cay ictigini,
            * 2 = Her bardak icin kac kup seker kullandigini sorup;
            kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
            * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
            (1 kup seker = 2.77 gr)
            * Kullanici negatif deger girisi yaparsa "Negatif deger ile hesaplama yapilamaz." uyarisi verin
            * ve yeniden dogru pozitif degerleri isteyin.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsunuz?");
        double bardak = scan.nextDouble();


        // bardak degeri negatif girilirse
        while (bardak < 0) {
            System.out.println("Negatif deger ile hesaplama yapilamaz.\nGunde kac bardak cay iciyorsunuz?");
            bardak = scan.nextDouble();
        }

        System.out.println("Her bardak icin kac adet kup seker kullaniyorsunuz?");
        double seker = scan.nextDouble();


        // seker degeri negatif girilirse
        while (seker < 0) {
            System.out.println("Negatif deger ile hesaplama yapilamaz.\nHer bardak icin kac adet kup seker kullaniyorsunuz?");
            seker = scan.nextDouble();
        }


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
