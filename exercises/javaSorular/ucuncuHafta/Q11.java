package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        /*
            Kullanicidan email girmesini isteyin
            @ isareti icermiyorsa "gecerli bir email girin" yazdirin
            @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
            @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
            ORNEK:
            INPUT : techproed.com OUTPUT : "gecerli bir email girin "
            INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
            INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mail adresini giriniz");
        String mail = scanner.nextLine();

        int index = mail.indexOf("@");

        if (!mail.contains("@")) {
            System.out.println("gecerli bir email girin");

        } else if (mail.substring(index + 1).startsWith("gmail.com")) {
            System.out.println("email onaylandi");
        } else {
            System.out.println("Lutfen gmail hesabinizi girin");

        }

    }

}
