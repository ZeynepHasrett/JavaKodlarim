package javaPractice.day03;

import java.util.Scanner;

public class C05_StringMaipulation {

    public static void main(String[] args) {

        /*
             * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
             * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
             * input : John White 1234234534561478
               output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
        */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen adinizi giriniz");

        String isim = scanner.nextLine();

        System.out.print("Lutfen soyadinizi giriniz");

        String soyIsim = scanner.nextLine();

        System.out.print("Lutfen kredi karti numaranizi giriniz");

        String kkNo = scanner.nextLine();

        /*
            \\d --> 0-9 rakamlar
            \\D --> 0-9 haricindeki her sey

            \\w --> harfler
            \\W --> harf disindaki her sey

            \\s --> space
            \\S --> space disindaki her sey
         */

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");

        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");

        kkNo = kkNo.substring(0).replaceAll("\\s", "");

        if (kkNo.length() < 16) {

            System.out.println("Gecersiz kredi karti");

        } else {

            kkNo = kkNo.substring(0, 4).replaceAll("\\d", "*"
                    + kkNo.substring(4, 8).replaceAll("\\d", "*")
                    + kkNo.substring(8, 12).replaceAll("\\d", "*")
                    + kkNo.substring(12, 16));

        }

        System.out.println(isim + " " + soyIsim + " " + kkNo);

    }

}


