package day17_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        // bir method olusturun.

        System.out.println(stringListeOlustur());

    }

    public static List<String> stringListeOlustur() {

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String girilenIsim = "";

        do {
            System.out.println("Lutfen listeye eklemek icin isim giriniz\nBitirmek icin Q'ya basiniz");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")) {

                isimler.add(girilenIsim);
            }

        } while (!girilenIsim.equalsIgnoreCase("q"));

        return isimler;

    }

}
