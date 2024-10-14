package exercises.javaSorular.birinciVeIkinciHafta;

import java.util.Scanner;

public class Q5_Calculator {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        // dort islemden biri ile isleme koyup sonucun yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 1. sayiyi giriniz");
        double sayi1 = scan.nextDouble();

        System.out.println("Lutfen 2. sayiyi giriniz");
        double sayi2 = scan.nextDouble();

        System.out.print("Lutfen yapmak istediginiz islemi seciniz: \nToplama + , Cikarma - , Carpma * , Bolme /");
        char islemTuru = scan.next().charAt(0);

        double sonuc;

        if (islemTuru == '+') {
            sonuc = sayi1 + sayi2;
            System.out.println("Toplama isleminizin sonucu: " + sonuc);
        }
        if (islemTuru == '-') {
            sonuc = sayi1 - sayi2;
            System.out.println("Cikarma isleminizin sonucu: " + sonuc);
        }
        if (islemTuru == '*') {
            sonuc = sayi1 * sayi2;
            System.out.println("Carpma isleminizin sonucu: " + sonuc);
        }
        if (islemTuru == '/') {
            sonuc = sayi1 / sayi2;
            System.out.println("Bolme isleminizin sonucu: " + sonuc);
        }

    }

}
