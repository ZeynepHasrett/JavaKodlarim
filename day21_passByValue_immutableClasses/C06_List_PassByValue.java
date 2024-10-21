package day21_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu", "Dilan", "Bahadir", "Maya"));

        birsimEkleMethodu(isimler);

        System.out.println("Main method'da method call'dan sonra isimler : " + isimler);
        // Main method'da method call'dan sonra isimler : [Cansu, Dilan, Bahadir, Maya, Nazli]

        yeniListeOlustur(isimler);

        System.out.println("Main method'da 2. method call'dan sonra isimler : " + isimler);

    }

    public static void birsimEkleMethodu(List<String> isimler) {

        // Verilen isimler listesine kullanicidan bir isim isteyip ekleyin
        // ve yeni halini yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen listeye eklenecek bir isim giriniz");
        isimler.add(scanner.nextLine());

        System.out.println("Method'ta listenin yeni hali : " + isimler);

    }

    public static void yeniListeOlustur(List<String> isimler) {

        // Verilen isimler listesine yeni bos bir liste atayan
        // sonra kullanicidan bir isim alip listeye ekleyen
        // ve listenin son halini yazdiran bir method olusturun

        isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen listeye eklenecek bir isim giriniz");
        isimler.add(scanner.nextLine());

        System.out.println("2.Method'ta listenin yeni hali : " + isimler);

    }

}
