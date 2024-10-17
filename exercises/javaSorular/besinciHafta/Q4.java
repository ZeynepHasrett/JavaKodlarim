package exercises.javaSorular.besinciHafta;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        /*
            Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

            Test Data:
            Java is fun

            Beklenen Çıktı
            0. pozisyondaki karakter : J
            5. pozisyondaki karakter : i
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Kacinci siradaki karakteri ogrenmek istiyorsunuz?");
        int index = scanner.nextInt();

        if (index >= 0 && index < metin.length()) {
            System.out.println(index + ". pozisyondaki karakter : " + metin.charAt(index));
        }else{
            System.out.println("Gecersiz index");
        }

    }

}
