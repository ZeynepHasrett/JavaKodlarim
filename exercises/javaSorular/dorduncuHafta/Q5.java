package exercises.javaSorular.dorduncuHafta;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        /*
            Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
            Test Data:
            Yarım elmas uzunluğu : 7
            Beklenen Çıktı:
                  *
                 ***
                *****
               *******
              *********
             ***********
            *************
             ***********
              *********
               *******
                *****
                 ***
                  *
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yarim elmaz uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();

        int sayac = 1;

        for (int i = 1; i <= uzunluk * 2 - 1; i++) { //hem ust ucgen hem alt ucgen var o yuzden "uznluk*2-1" bu sekilde belirleedik.7 ustte 6 altta =>7+6=13

            for (int j = sayac; j <= uzunluk; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= sayac * 2 - 1; k++) {
                System.out.print("*");
            }

            if (i < uzunluk) { // ust ucgen
                sayac++;

            } else sayac--;

            System.out.println();

        }

    }

}
