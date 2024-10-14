package exercises.javaSorular.birinciVeIkinciHafta;

import java.util.Scanner;

public class Q11_UcgenOlusturma {

    public static void main(String[] args) {

        /*
               Kullanicidan 3 tane pozitif  tam sayi aliniz.
               bu uc sayinin ucgen olusturma durumunu kontrol ediniz
               eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz

               üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
               herhangi iki kenar farkı diger kenardan kucuk olmali
               a+b>c>a-b
               a+c>b>a-c
               b+c>a>b-c
               a=b=c ise es kenar ucgen
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("Lutfen ucuncu sayiyi giriniz");
        int sayi3 = scan.nextInt();

        if (sayi1 + sayi2 > sayi3 && sayi1 - sayi2 < sayi3 &&
                sayi1 + sayi3 > sayi2 && sayi1 - sayi3 < sayi2 &&
                sayi2 + sayi3 > sayi1 && sayi2 - sayi3 < sayi1) {
            System.out.println("Bu sayilarla bir ucgen olusturabilirsiniz");

            if (sayi1 == sayi2 && sayi2 == sayi3) {
                System.out.println("Bu ucgen eskenar bir ucgendir");
            } else {
                System.out.println("Bu ucgen eskenar bir ucgen degildir");
            }

        } else {
            System.out.println("Bu sayilarla bir ucgen olusturamazsiniz");
        }

    }

}


