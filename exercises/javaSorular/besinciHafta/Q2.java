package exercises.javaSorular.besinciHafta;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        /*
            Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

            Test Data:
            Java is fun
            Beklenen Sonuç:
            JAVA IS FUN
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine().toUpperCase();

        System.out.println(cumle);

    }

}
