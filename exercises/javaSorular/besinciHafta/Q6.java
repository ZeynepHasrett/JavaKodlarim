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

        enKucukSayi();

    }

    public static void enKucukSayi() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir birinci sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen bir ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Lutfen bir ucuncu sayiyi giriniz");
        int sayi3 = scanner.nextInt();
        scanner.nextLine();

        int enKucukSayi = sayi1;

        if (sayi2 < enKucukSayi) {
            enKucukSayi = sayi2;
        }

        if (sayi3 < enKucukSayi) {
            enKucukSayi = sayi3;
        }


        // 2.YONTEM
        System.out.println("En kucuk sayi : " + enKucukSayi);

        if (sayi2 > sayi1 && sayi3 >= sayi2) {
            System.out.println("En kucuk sayi : " + sayi1);
        } else if (sayi1 > sayi2 && sayi2 <= sayi3) {
            System.out.println("En kucuk sayi : " + sayi2);
        } else if (sayi1 > sayi3 && sayi3 <= sayi2) {
            System.out.println("En kucuk sayi : " + sayi3);
        }


        // 3.YONTEM
        System.out.println(sayi1 < sayi2 ? (sayi1 < sayi3 ? sayi1 : sayi3) : (sayi2 < sayi3 ? sayi2 : sayi3));

    }

}
