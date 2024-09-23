package day05_ifElseStatements;

import java.util.Scanner;

public class C14_ElseIleBitmezse {

    public static void main(String[] args) {

        /*
            Bir if else if... cumlesinde
            kodun sonu else ile bitmezse Java kod icin hata vermez
            ANCAK else ile bitmeyen kodlarda
            bazi degerler icin sonuc uretilemeyebilecegini bilmemiz gerekir
         */

        //  SORU: Kullanicidan pozitif bir tamsayi isteyin
        //  sayi hem 3 hem 5 ile bolunuyorsa "super",
        //  sayi sadece 3 ile bolunuyorsa "3'un kati"
        //  sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if ((sayi % 3 == 0) && (sayi % 5 == 0)){
            System.out.println("super");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        }

        /*
            Eger ayni sayiya farkli sonuclar verilmesi mumkun olan bir kod yaziyorsak
            Once en kisitlayici olani yazmaliyiz
            Aksi durumda digerleri verilen degerleri yakalayacagi icin
            en dar olana hicbir deger kalmaz
         */
    }

}
