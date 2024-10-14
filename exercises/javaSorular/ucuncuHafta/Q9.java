package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        // * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
        // * Kredi kartı numarasını kontrol edin, 16 haneden küçük olursa "Geçersiz kredi kartı numarası" yazdırın.
        // * input : John White 1234234534561478
        // * output: Ad : J*** Soyad : W**** kartNo : ***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String ad = scanner.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyAd = scanner.nextLine();

        System.out.println("Lutfen kredi kartı numaranizi giriniz");
        String kkNo = scanner.nextLine();

        if (kkNo.length() < 16) {
            System.out.println("Geçersiz kredi kartı numarası");
        }

        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).replaceAll("\\w", "*");
        soyAd = soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).replaceAll("\\w", "*");
        kkNo = kkNo.substring(kkNo.length() - 4);

        System.out.println("Ad : " + ad + " Soyad : " + soyAd + " kartNo : ************" + kkNo);
        
    }

}
