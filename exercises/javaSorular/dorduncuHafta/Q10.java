package exercises.javaSorular.dorduncuHafta;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        /*
            Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

            Test Data:
            Java is easy

            Aranan String: is
            Bektenen Çıktı:
            True

            Aranan String: and
            Beklenen Çıktı:False
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine().toLowerCase();

        System.out.println("Lutfen aranan kelimeyi giriniz");
        String arananKelime = scanner.nextLine().toLowerCase();

        System.out.println(metin.contains(arananKelime));

    }

}
