package exercises.javaSorular.ucuncuHafta;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {

        /*
            powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
            Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
                Örnek 1
                input   : 27
                output  : true
                Örnek 2
                Girdi   : 0
                Çıktı   : false
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(powerOfThree(girilenSayi));

    }

    public static boolean powerOfThree(int girilenSayi) {

        int carpim = 1;

        boolean sonuc = false;

        for (int i = 1; i <= girilenSayi; i++) {

            carpim *= 3;

            if (carpim == girilenSayi) {
                sonuc = true;
                break;
            }

        }

        return sonuc;

    }

}
