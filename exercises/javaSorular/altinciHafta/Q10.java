package exercises.javaSorular.altinciHafta;

import java.sql.Array;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        /*
            Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

            Test Data:
            birinci binary number: 100010
            ikinci  binary number: 110010

            Beklenen Çıktı:
            1010100
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci binary sayiyi giriniz");
        String binary1 = scanner.nextLine();

        System.out.println("Lutfen ikinci binary sayiyi giriniz");
        String binary2 = scanner.nextLine();

        // binary sayilari 10luk sisteme cevirme
        int sayi1 = Integer.parseInt(binary1, 2);
        int sayi2 = Integer.parseInt(binary2, 2);

        int toplam = sayi1 + sayi2;

        // int toplam'i  binary'e cevirme
        String binaryToplam = Integer.toBinaryString(toplam);

        System.out.println(binaryToplam);

    }

}
