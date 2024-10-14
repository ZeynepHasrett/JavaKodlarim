package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        if (metin != "") {
            System.out.println(metin.contains(" "));
        } else {
            System.out.println("Herhangi bir deger girilmedi");
        }

    }

}
