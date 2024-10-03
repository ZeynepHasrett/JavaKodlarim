package day11_NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /*
             Kullanicidan satir sayisini
             ve her satirdaki * sayisini isteyip
             girilen degerlere gore
             Asagidaki sekli olusturacak bir kod yaziniz

             orn: satir 4, satirdaki * sayisi 7

             * * * * * * *
             * * * * * * *
             * * * * * * *
             * * * * * * *

         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen satir sayisini giriniz");
        int satirSayisi = scan.nextInt();

        System.out.println("Lutfen satirdaki yildiz sayisini giriniz");
        int sutunSayisi = scan.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {

            for (int j = 1; j <= sutunSayisi; j++) {

                System.out.print("* ");
            }

            System.out.println("");

        }

    }

}
