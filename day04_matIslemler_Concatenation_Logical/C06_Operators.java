package day04_matIslemler_Concatenation_Logical;

import java.util.Scanner;

public class C06_Operators {

    public static void main(String[] args) {


        // Atama operatoru =

        int a = 3;

        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        // b neye esittir? b icin atama yapilmasi isteniyor

        int c = a; // Bu islemde a, c'ye esittir denilemez. c'ye a'nin degeri atama yapilmistir

        // Esitlik operatoru ==

        int d = 12;
        int e = 24;
        int f = 9+3;
        String m = "12";
        // System.out.println(m==d); Data turu ayni degilse esit denilemez


        System.out.println(d==e); // Burada d ile e degerini esit olup olmadigi kontrol edilir
        // false yazdirir

        System.out.println(d == f); // true


        // Degildir operatoru  !

        System.out.println(d!=e); // Burada d, e'ye esit deildir sorgulamasi yaptik
        // true yazdirir

        System.out.println(d!=f); // false


        String s1 = "Ali";
        String s2 = "Ali";
        System.out.println(s1==s2); // true
        String s3 = "A" + "l" + "i";
        System.out.println(s1==s3); // true
        String s4 = "A";
        String s5 = "li";
        String  s6 = s4 + s5; // Ali
        System.out.println(s1==s6); // false

        // Simdilik string iki degeri karsilastirmak icin == kullanilmaz
        // iki metinsel ifadeyi karsilastirmak icin equals() metodunu kullanacagiz


        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s6)); // true


        // Karsilastirma Operatorleri

        int x = 15;
        int y = 20;
        int z = y - x + 10; // 15
        int r = y - 5;

        System.out.println(x < y); // true
        System.out.println(x > y); // false
        System.out.println(x <= z); // true
        System.out.println(z < y); // true
        System.out.println(y >= x); // true
        System.out.println(!(x < y)); // false


        // Mantiksal Operatorler

        // "VE" operatoru &&
        System.out.println(x < y && z < y);
        // Burada ve kullanildigi icin sorgulanan sartlarin tamami dogru ise TRUE olur
        // Sorgulanan sartlardan en az biri yanlis ise FALSE verir

        System.out.println(x < y && z < y && r < y); // true

        System.out.println(x < y && z < y && r == y); // false

        // "VEYA" Operatoru ||

        System.out.println(x < y || z < y || r == y); // true

        // VEYA operatorunde sorgulanan sartlardan en az birinin dogru olmasi true verdirir
        // False verebilmesi icin tum kosullarin yanlis olmasi gerekir

        System.out.println(x == y || z  > y || r > y); // false


    }
}
