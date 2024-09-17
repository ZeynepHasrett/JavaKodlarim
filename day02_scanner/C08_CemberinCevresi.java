package day02_scanner;

import java.util.Scanner;

import static java.lang.Math.PI;

public class C08_CemberinCevresi {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip
        // cevresini ve alanini yazdirin
        // cevre = 2 * PI * yaricap     alan = PI * yaricap * yaricap

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi : " + (2 * PI * yaricap));
        System.out.println("Dairenin alani : " + (PI * yaricap * yaricap));

    }
}
