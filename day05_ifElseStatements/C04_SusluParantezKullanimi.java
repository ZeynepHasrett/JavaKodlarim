package day05_ifElseStatements;

import java.util.Scanner;

public class C04_SusluParantezKullanimi {

    public static void main(String[] args) {

        // SORU: Kullanicidan iki tamsayi isteyin.
        // birinci sayi daha kucukse
        // iki sayiyi yazdirin
        // alt satira gecip "ilk sayi daha kucuk" yazdirin
        // eger 2. sayi cift ise
        // "2.sayi cift" yazdirin
        // alt satira "cift sayilari severim" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        /*
        if (sayi1 < sayi2){
            System.out.println("Girilen sayilar: " + sayi1 + " ve " + sayi2);
            System.out.println("Ilk sayi daha kucuk");
        }

        if (sayi2 % 2 == 0){
            System.out.println("2.sayi cift \ncift sayilari severim");
        }

         */


        /*
            Eger if cumlesinde boolean sarttan sonra { } kullanilmazsa
            Java if body'si olarak ilk noktali virgule kadar olan kismi alir
            sonraki satirlarin if ile ilgisi olmaz

            Kullanimda suna dikkat etmeliyiz

            Eger if body'si sadece bir satir ise
            suslu parantez kullanmasak da olabilir
            ANCAK if body'si bir satirdan daha fazla ise
            mutlaka suslu parantez kullanmaliyiz
         */

        if (sayi1 < sayi2)
            System.out.println("Girilen sayilar: " + sayi1 + " ve " + sayi2);
            System.out.println("Ilk sayi daha kucuk"); // bu satirin yukaridaki if ile hicbir baglantisi yok
                                                       // bu satir her durumda calisir
        if (sayi2 % 2 == 0)
            System.out.println("2.sayi cift \ncift sayilari severim");

    }

}
