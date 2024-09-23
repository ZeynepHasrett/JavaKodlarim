package day05_ifElseStatements;

import java.util.Scanner;

public class C07_FlagMetodu {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int flag = 47;

        if (sayi1 < sayi2) {
            System.out.println("birinci sayi daha kucuk");
            flag = 72;
        }

        if (sayi1 > 0) {
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 72;
        }

        if (sayi2 > 50) {
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 72;
        }

        if (sayi2 % 5 == 0) {
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 72;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // sona gelindiginde flag icin iki ihtimal var
        // flag basta verdigimiz degere esit ise  (47) ==> hicbir sart saglanmamis
        // flag if body'lerinde verilen degere esit ise (72) ==> en az 1 if body calismistir
        //                                                       ama kac tanesinincalistigini bilmiyoruz

        if (flag == 47) System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");

    }

}
