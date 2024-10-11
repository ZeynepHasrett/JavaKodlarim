package javaPractice.day03;

import java.util.Scanner;

public class C01_StringManipulation {

    public static void main(String[] args) {

        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi arada bir bosluk birakarak giriniz");

        String adSoyad = scanner.nextLine();

        String ad = adSoyad.substring(0, adSoyad.indexOf(" ") + 1);

        String soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1);

        System.out.println("Adi:" + ad + "\nSoyadi:" + soyad);

        // substring: metni bolmeye yarar iki farkli bolme yapilabilir
        // 1.si (ilk index, ikinci index) : iki index arasindaki ilki dahil olan ikincisi dahil olmayanlari alir
        // 2.si (index)                   : verilen index dahil sona kadar olantumunu alir

    }

}
