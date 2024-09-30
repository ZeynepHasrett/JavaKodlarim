package day09_stringManipulations;

import java.util.Scanner;

public class C03_replace {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.replace("a", "A")); // JAvA ogrenmek cok guzel

        System.out.println(str.replace('e', 'E')); // Java ogrEnmEk cok guzEl

        System.out.println(str.replace("ogrenmek", "bilmek")); // Java bilmek cok guzel


        // kullanicidan cumledeki degistirmek istedigi kismi
        // ve yerine koymak istedigi metni alin
        // cumleyi yeni haliyle yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Cumledeki degistirmek istediginiz kismi yaziniz");

        String eskiMetin = scan.nextLine();

        System.out.println("Yerine yazmak istediginiz metni giriniz");

        String yeniMetin = scan.nextLine();

        System.out.println(str.replace(eskiMetin, yeniMetin));

    }

}
