package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.


        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Lutfen bir sayi giriniz");
            int girilenSayi = scanner.nextInt();

            if (girilenSayi < 5 || girilenSayi > 10) {
                toplam += girilenSayi;
            }

        }

        System.out.println("5 ile 10 arasındaki sayılar hariç, diğerlerinin toplamı: " + toplam);

    }

}
