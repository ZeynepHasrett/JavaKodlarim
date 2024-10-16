package exercises.javaSorular.dorduncuHafta;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        /*
            Kullanıcıdan bir harf girmesini isteyiniz.
            Girilen harf sesli ise Sesli harf olduğunu,
            değilse sessiz harf olduğunu ekrana yazdırsın.
            Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin.
            (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

            Sesli harfler: a,e,i,o,u

            Test Data:
            a
            Beklenen Çıktı:
            a harfi sesli harfdir.

            Test Data:
            d
            Beklenen Çıktı:
            d harfi sesiz harftir.

            Test Data:
            we  yada %
            Beklenen Çıktı:
            Yanlis karakter girdiniz!
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");
        String str = scanner.next();
        char girilenHarf = str.charAt(0);

        if ((girilenHarf >= 'a' && girilenHarf <= 'z') || (girilenHarf >= 'A' && girilenHarf <= 'Z') && str.length() == 1) {
            if (girilenHarf == 'a' || girilenHarf == 'e' || girilenHarf == 'i' || girilenHarf == 'o' || girilenHarf == 'u') {
                System.out.println(girilenHarf + " harfi sesli harftir");
            } else {
                System.out.println(girilenHarf + " harfi sessiz harftir");
            }
        } else {
            System.out.println("Yanlis karakter girdiniz");
        }

    }

}
