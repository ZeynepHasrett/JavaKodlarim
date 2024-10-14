package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        // Kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        // örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen e-mail adresini giriniz");
        String girilenMail = scanner.nextLine();

        String yeniMail = "";

        if (girilenMail.contains("hotmail")) {

            yeniMail = girilenMail.replace("hotmail", "gmail");
            System.out.println(girilenMail + " ==> " + yeniMail);
        }

    }

}
