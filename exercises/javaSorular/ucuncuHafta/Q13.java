package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        // name1 ve name2 degiskenlerini olusturun.
        // name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        // name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdiran bir method oluşturun
        // e.g:
        //      name1= mehmet
        //      name2= ahmet
        //      Print ==> mehahmetmet


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci ismi giriniz");
        String name1 = scanner.nextLine().toLowerCase();

        System.out.println("Lutfen ikinci ismi giriniz");
        String name2 = scanner.nextLine().toLowerCase();

        isimBirlestir(name1, name2);

    }

    public static void isimBirlestir(String name1, String name2) {

        if (name1.length() % 2 == 0) {
            System.out.println(name1.substring(0, name1.length() / 2) + name2 + name1.substring(3));
        } else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }

    }

}
