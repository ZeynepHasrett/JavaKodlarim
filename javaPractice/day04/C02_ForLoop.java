package javaPractice.day04;

import javax.swing.*;
import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        /*
             Girilen bir Stringdeki a harfi sayısını bulunuz.
             ama c harfine gelirse döngüden çıkılsın.

             Bugün hava oldukca güzel.-> 2
         */


        String cumle = JOptionPane.showInputDialog("\nLutfen bir cumle giriniz:\n\n");
        System.out.println("Girdiginiz cumle: " + cumle);

        int flag = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.toLowerCase().charAt(i) == 'a') {
                flag++;
            }

            if (cumle.toLowerCase().charAt(i) == 'c') {
                break;
            }

        }

        System.out.println("Cumledeki a harfi sayisi: " + flag);

        System.out.println("=======================");


        for (int i = 0; i < 10; i++) {

            if (i == 3) { // i=3 oldugunda islem yapmadan devam eder
                continue;
            }

            System.out.print(i + " ");

        }

    }

}
