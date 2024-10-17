package exercises.javaSorular.besinciHafta;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        /*
                Girilen String'deki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

                Test Data:
                java is fun

                Beklenen Çıktı:
                JAVA IS FUN
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            System.out.print(cumle.toUpperCase().charAt(i));
        }

    }

}
