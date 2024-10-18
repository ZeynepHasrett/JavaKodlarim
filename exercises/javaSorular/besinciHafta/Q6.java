package exercises.javaSorular.besinciHafta;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        /*
            Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

            Test data:
            12,24,34

            Beklenen Çıktı:
            12
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir birinci sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen bir ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Lutfen bir ucuncu sayiyi giriniz");
        int sayi3 = scanner.nextInt();

        enKucukSayi(sayi1, sayi2, sayi3);

    }

    public static void enKucukSayi(int sayi1, int sayi2, int sayi3) {

        int enKucukSayi = sayi1;

        if (sayi2 < enKucukSayi) {
            enKucukSayi = sayi2;
        }

        if (sayi3 < enKucukSayi) {
            enKucukSayi = sayi3;
        }

        System.out.println("En kucuk sayi : " + enKucukSayi);

    }

}
