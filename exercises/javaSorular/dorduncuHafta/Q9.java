package exercises.javaSorular.dorduncuHafta;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        /*
            2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

            Test Data:
            str1: Java is
            str2: fun
            Beklenen Çıktı:
            java is fun
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci kelimeyi giriniz");
        String str1 = scanner.nextLine();

        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String str2 = scanner.nextLine();

        System.out.println(str1 + " ".concat(str2));

    }

}
