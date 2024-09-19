package day04_matIslemler_Concatenation_Logical;

import java.sql.SQLOutput;

public class C03_Concatenation {

    public static void main(String[] args) {

        String str1 = "Java";

        String str2 = "Candir";

        String str3 = " ";

        String str4 = "";

        int a = 2;
        int b = 3;

        System.out.println(str1 + str3 + str2 + str3 + str4 + a + b); // Java Candir 23

        System.out.println(str1 + str2 + str3 + str4 + (a + b)); // JavaCandir 5

        // Birkac variable ile yazdirilmak istenilince "CONCATENATION" yapilir.
        // bu islem yapilirken matematiksel islem onceligine dikkat etmek sartıyla
        // String bir deger var ise String diger degerleri String'e cevirerek "CONCAT" eder

        System.out.println(a + b + str3 + str1 + str3 + str2 + str3); // 5 Java Candir

    }
}
