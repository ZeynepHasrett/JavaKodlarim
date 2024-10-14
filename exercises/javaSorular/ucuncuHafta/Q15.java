package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {

        /*
              Girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.

              input      output
              axyzm  ==   true
              xyz    ==   true
              x.yz   ==   false
              xyaz   ==   false
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine().toLowerCase();

        System.out.println(xyzVarMi(kelime));

    }

    public static boolean xyzVarMi(String kelime) {

        if (kelime.contains("xyz")) {
            return true;
        } else {
            return false;
        }

    }

}
