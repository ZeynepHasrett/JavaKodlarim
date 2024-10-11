package exercises;

import java.util.Scanner;

public class E04_Scanner {

    public static void main(String[] args) {

        /*
            SORU: Kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ucgene ait dik kenar uzunluklarini giriniz");

        System.out.print("1. dik kenar: ");

        double dikKenar1 = scan.nextDouble();

        System.out.print("2. dik kenar: ");

        double dikKenar2 = scan.nextDouble();

        double hipotenus = Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);

        System.out.println("Ucgenin hipotenusu: " + hipotenus);

    }
}
