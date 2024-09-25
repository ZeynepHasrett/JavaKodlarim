package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C01_NestedTernary {

    public static void main(String[] args) {


        // Kullanicidan bir tamsayi isteyin
        // 0'dan buyukse pozitif
        // 0'dan kucukse negatif
        // 0 ise notr yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();


        // Kullanicidan bir tamsayi isteyin
        // 0'dan buyukse pozitif
        // 0'dan buyuk degilse pozitif degil

        System.out.println(sayi > 0 ? "pozitif" : "pozitif degil");


        // sayi, sifirdan buyukse pozitif
        // 0'dan kucukse negatif
        // 0 ise notr

        System.out.println(sayi > 0 ? "pozitif" : (sayi < 0 ? "negatif" : "notr"));

    }

}
