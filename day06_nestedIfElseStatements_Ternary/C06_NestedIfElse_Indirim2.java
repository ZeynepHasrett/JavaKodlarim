package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C06_NestedIfElse_Indirim2 {

    public static void main(String[] args) {


        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                                az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                                az alirsa %10 indirim yapin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen urunun indirimsiz fiyatini giriniz");
        double urunFiyati = scan.nextDouble();

        double indirimsizToplamFiyat = urunAdedi * urunFiyati;

        System.out.println("Musteri kartiniz var mi E: evet H: hayir");
        char kartVarMi = scan.next().toUpperCase().charAt(0);

        // Temel degiskenimiz urunAdedi olsun

        if (urunAdedi <= 0) {
            System.out.println("Urun adedi girisi yanlis");

        } else if (urunAdedi <= 10) {
            // 0 - 10 urun alanlar icin karta gore degerlendirme yapabiliriz

            if (kartVarMi == 'E') {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
            } else if (kartVarMi == 'H') {
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat * 90 / 100);
            } else {
                System.out.println("Kart bilgisi icin E veya H girilmelidir");
            }

        } else {
            // 10 urunden fazla alanlar icin karta gore degerlendirme yapabiliriz

            if (kartVarMi == 'E') {
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 / 100);
            } else if (kartVarMi == 'H') {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
            } else {
                System.out.println("Kart bilgisi icin E veya H girilmelidir");
            }

        }

    }
}
