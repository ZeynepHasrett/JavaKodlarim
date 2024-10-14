package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {

        /*
            addDigits isminde bir method create ediniz.
            Parametresi int
            Return tipi de int
            Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
            Tek basamaklı çıktığında, return etsin
            Örnek1:
                    Girdi: 38
                    Çıktı:  2
                    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                    2 , tek basamaklı olduğundan, bunu döndürün.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(addDigits(girilenSayi));

    }

    public static int addDigits(int girilenSayi) {

        while (girilenSayi >= 10) {
            girilenSayi = rakamTopla(girilenSayi);
        }

        return girilenSayi;

    }

    public static int rakamTopla(int girilenSayi) {

        int rakam = 0;
        int toplam = 0;

        while (girilenSayi > 0) {
            rakam = girilenSayi % 10;
            toplam += rakam;
            girilenSayi /= 10;

        }

        return toplam;

    }

}
