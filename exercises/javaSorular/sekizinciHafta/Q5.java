package exercises.javaSorular.sekizinciHafta;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        /*
            Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

            Şartlar:
            * Bir mail adresinde @ karakteri olmalı
            * Bir mail adresinde . (nokta) karakteri olmalı
            * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

            Örnekler
            validateEmail("@gmail.com")
            Çıktı : false

            validateEmail("gmail")
            Çıktı : false

            validateEmail("hello@gmail")
            Çıktı : false

            validateEmail("hello@edabit.com")
            Çıktı : true
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        validateEmail(mail);

    }

    public static void validateEmail(String mail) {

        boolean durum = true;

        if (!mail.contains("@")) {
            durum = false;
        }

        if (!mail.contains(".")) {
            durum = false;
        }

        int index = mail.indexOf("@");

        if (index == 0) {
            durum = false;
        }

        System.out.println("Çıktı : " + durum);

    }

}
