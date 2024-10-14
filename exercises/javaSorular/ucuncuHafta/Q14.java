package exercises.javaSorular.ucuncuHafta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a ceviren bir method yaziniz.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yapmak istediginiz islemi saat, mil veya kilogram seklinde giriniz : ");
        String islem = scanner.next();

        System.out.println("Lutfen cevirmek istediginiz miktari giriniz : ");
        double miktar = scanner.nextDouble();

        donustur(islem, miktar);

    }

    public static void donustur(String islem, double miktar) {

        switch (islem) {
            case "saat":
                System.out.println("Girdiginiz saat " + miktar * 60 * 60 + " saniyedir");
                break;
            case "mil":
                System.out.println("Girdiginiz mil " + miktar * 1.61 + " kilometredir");
                break;
            case "kilogram":
                System.out.println("Girdiginiz kilogram " + miktar * 1000 + " gramdir");
                break;
            default:
                System.out.println("Girdiginiz bilgiler gecersiz");
                break;
        }

    }

}
