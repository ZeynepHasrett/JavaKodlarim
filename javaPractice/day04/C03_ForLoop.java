package javaPractice.day04;

import java.util.Scanner;

public class C03_ForLoop {

    public static void main(String[] args) {

        // Kullanıcıdan 5 adet sayı isteyiniz.
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // Bu soruyu continue kullanarak çözünüz.


        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Sizden 1 ile 20 arasinda 5 adet sayi alacagim.\nLutfen " + i + ". sayiyi giriniz");
            int sayi = scanner.nextInt();

            if (sayi >= 5 && sayi <= 10) {
                continue;
            }

            toplam += sayi;

        }

        System.out.println("Toplam: " + toplam);

    }

}
