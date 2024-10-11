package exercises.javaSorular.birinciVeIkinciHaftaSorular;

import java.util.Scanner;

public class Q12_KanBagisiYapma {

    public static void main(String[] args) {

        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        if (yas < 18) {
            System.out.println("Kan bagisi yapamazsiniz");
        } else if (kilo < 50) {
            System.out.println("Kan bagisi yapamazsiniz");
        } else {
            System.out.println("Kan bagisi yapabilirsiniz");
        }

    }

}
