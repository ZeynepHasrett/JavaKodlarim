package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C11_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        System.out.println( kenar1 == kenar2 & kenar1 == kenar3 ? "Eskenar ucgen" : "Eskenar degil" );

    }

}
