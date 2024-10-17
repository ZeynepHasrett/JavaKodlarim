package exercises.javaSorular.dorduncuHafta;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        /*
            Girilen String değerde tersten yazan Java kodunu yazınız.

            Test Data:
            java
            avaj
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.print(kelime.charAt(i));
        }

    }

}
