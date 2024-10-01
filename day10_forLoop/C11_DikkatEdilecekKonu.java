package day10_forLoop;

import java.util.Scanner;

public class C11_DikkatEdilecekKonu {

    public static void main(String[] args) {

        /*
            Eger yaptigimiz islem sirasinda
            verilen sayiyi degistirmemiz ve atama yapmamiz gerekiyorsa
            islem bittiginde kullanicidan aldigimiz sayi degismis olur
            ve kullanicidan alinan sayiyi bir daha kullanamayiz

            Eger kullanicidan aldigimiz degeri
            birden fazla islemde kullanacaksak
            degerini baska bir variable'a atayip
            degisiklikleri diger variable'da yapmaliyiz
         */

        // Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.
        // Ilk islem bittikten sonra
        // 1'den verilen sayiya kadar 17 ile bolunebilen sayilari yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;

        System.out.println("Girmis oldugunuz sayi : " + sayi);

        int basamakSayisi = (sayi + "").length();

        int rakamlarToplami = 0;


        for (int i = 1; i <= basamakSayisi; i++) {
            rakamlarToplami += sayi % 10;
            sayi = sayi / 10;
        }

        System.out.println("Sayinin rakamlar toplami : " + rakamlarToplami);

        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 17 == 0) {
                System.out.print(i + " ");
            }

        }

    }

}
