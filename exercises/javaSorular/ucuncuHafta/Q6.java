package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        // Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir
        // Ternary kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
        // Test data: ali eme all


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 harften olusan bir isim giriniz");
        String isim = scanner.nextLine();

        char h1 = isim.charAt(0);
        char h2 = isim.charAt(1);
        char h3 = isim.charAt(2);

        String sonuc = isim.length() == 3 ? ((h1 != h2 && h2 != h3 && h1 != h3) ? "Girilen isim 3 harfli ve unique" : "Girilen isim 3 harfli ama unique degil")
                                          : "Girilen isim 3 harfli degil";

        System.out.println(sonuc);

    }

}
