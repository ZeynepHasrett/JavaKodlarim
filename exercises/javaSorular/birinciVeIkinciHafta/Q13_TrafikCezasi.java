package exercises.javaSorular.birinciVeIkinciHafta;

import java.util.Scanner;

public class Q13_TrafikCezasi {

    public static void main(String[] args) {

        /*
            Kulanicidan aracinin hizini aliniz
            Trafik cezasinin degerini hesaplayin. 45 hiz siniridir.
            * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
            * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
            * Eger Hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
            * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
            * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.

            * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen aracinizin hizini giriniz");
        int hiz = scan.nextInt();

        System.out.println("Ehliyetiniz var mi? Evet: E  Hayir: H");
        char ehliyet = scan.next().toUpperCase().charAt(0);


        if (ehliyet == 'E') {
            if (hiz >= 55 && hiz <= 74) {
                System.out.println("Ceza 100 $");
            } else if (hiz >= 75 && hiz <= 84) {
                System.out.println("Ceza 150 $");
            } else if (hiz >= 85 && hiz <= 94) {
                System.out.println("Ceza 320 $");
            } else {
                System.out.println("Ceza 500 $");
            }
        } else {
            if (hiz >= 55 && hiz <= 74) {
                System.out.println("Ceza 300 $");
            } else if (hiz >= 75 && hiz <= 84) {
                System.out.println("Ceza 350 $");
            } else if (hiz >= 85 && hiz <= 94) {
                System.out.println("Ceza 520 $");
            } else {
                System.out.println("Ceza 700 $");
            }

        }

    }

}
