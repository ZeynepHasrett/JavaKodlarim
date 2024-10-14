package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

        /*
            String girildiginde ilk iki karakteri haric string return eden Java method yaziniz
            Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
            ORNEK:
            INPUT      :  goat
                          photo
                          ghost
                          kalem
            OUTPUT     :  gat
                          hoto
                          ghost
                          lem
        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        System.out.println(ilkIkiHarfsizDondur(kelime));

    }

    public static String ilkIkiHarfsizDondur(String kelime) {

        String kalanHarfler = "";

        if (kelime.substring(0, 1).equals("g") && kelime.substring(1, 2).equals("h")) {
            kalanHarfler = kelime.substring(0);

        } else if (kelime.substring(0, 1).equals("g")) {
            kalanHarfler = kelime.substring(0, 1) + kelime.substring(2);

        } else if (kelime.substring(1, 2).equals("h")) {
            kalanHarfler = kelime.substring(1);

        } else {
            kalanHarfler = kelime.substring(2);

        }

        return kalanHarfler;

    }

}
