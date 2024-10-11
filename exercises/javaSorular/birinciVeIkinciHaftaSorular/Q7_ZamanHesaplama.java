package exercises.javaSorular.birinciVeIkinciHaftaSorular;

import java.util.Scanner;

public class Q7_ZamanHesaplama {

    public static void main(String[] args) {

    /*
            Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.

            Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
            100 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

            Örnek Ekran Çıktısı
            Mesafeyi giriniz: 400
            Hızı giriniz: 100
            Süre 4 saattir.
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gideceginiz mesafeyi (km) giriniz");
        System.out.print("Gidilecek Mesafe: ");

        double mesafe = scan.nextDouble();

        System.out.println("Lutfen hizinizi giriniz");
        System.out.print("Hiziniz: ");

        double hiz = scan.nextDouble();

        double zaman = mesafe / hiz;

        System.out.println("Hedefe varacaginiz sure: " + zaman);

    }

}
