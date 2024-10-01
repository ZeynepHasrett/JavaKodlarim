package day10_forLoop;

import java.util.Scanner;

public class C07_AradakiSayilarinToplami {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen baslangic icin bir tamsayi giriniz");

        int baslangic = scan.nextInt();

        System.out.println("Lutfen bitis icin bir tamsayi giriniz");

        int bitis = scan.nextInt();

        int toplam = 0;

        if (baslangic < bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }

        } else {
            for (int i = baslangic; i >= bitis; i--) {
                toplam += i;
            }
        }

        System.out.println("Verilen sinirlar arasindaki tamsayilarin toplami : " + toplam);

    }

}
