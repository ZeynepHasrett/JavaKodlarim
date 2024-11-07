package exercises.javaSorular.yedinciHaftaSorular;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        /*
            Girilen sayının ingilizce yazılışını return eden bir method yazınız.

            Örnek
            numToEng(0)
            zero

            numToEng(18)
            eighteen

            numToEng(126)
            one hundred twenty six

            numToEng(909)
            nine hundred nine
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen max 3 basamakli pozitif bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        numToEng(sayi);

    }

    public static void numToEng(int sayi) {

        if (sayi < 0 || sayi > 999) {
            System.out.println("Lutfen sartlara uyan bir sayi giriniz\nmax 3 basamakli ve pozitif bir sayi :");
        } else {

            int birlerBasamagi = sayi % 10;
            int a = sayi / 10;
            int onlarBasamagi = a % 10;
            int yuzlerBasamagi = sayi / 100;

            String[] birlerBas1 = {"zero", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "Ten", "Eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"};

            String[] onlarBas1 = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

            String yuz = "hundred";

            if (sayi < 20) {
                System.out.println(birlerBas1[sayi]);
            } else if (sayi < 100) {
                System.out.println(onlarBas1[onlarBasamagi] + " " + birlerBas1[birlerBasamagi]);
            } else {
                if (birlerBas1[birlerBasamagi] == "zero") {
                    System.out.println(birlerBas1[yuzlerBasamagi] + " " + yuz + " " + onlarBas1[onlarBasamagi]);
                } else if (birlerBas1[birlerBasamagi] != "zero") {
                    System.out.println(birlerBas1[yuzlerBasamagi] + " " + yuz + " " + onlarBas1[onlarBasamagi] + " " + birlerBas1[birlerBasamagi]);
                }

            }

        }

    }

}









