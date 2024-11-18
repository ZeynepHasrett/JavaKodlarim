package exercises.javaSorular.sekizinciHafta;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        /*
            Fazla mesaiyi hesaplayan bir program yazınız.
            Yazacağınız program toplam kazancı return etsin.

            Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
            fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

            Daha sonra şu şekilde bir program yazınız :

            Örnek :
            saatlik çalışma ücreti : 40.0
            hangi saat başladı : 9.0
            hangi saat bitti : 20.0
            mesaiyi kaçla katlayacağız : 1.8

            ucretHesapla(9.0,20.0,40.0,1.8);

            9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
            17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

            toplam = 536.0
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen saatlik calisma ucretinizi giriniz");
        double saatlikUcret = scanner.nextDouble();

        System.out.println("Lutfen calismaya basladiginiz saati giriniz");
        double basSaati = scanner.nextDouble();

        System.out.println("Lutfen calismayi bitirdiginiz saati giriniz");
        double bitSaati = scanner.nextDouble();

        System.out.println("Lutfen fazla mesai katsayisini giriniz");
        double mesaiKatSayisi = scanner.nextDouble();

        System.out.println(ucretHesapla(basSaati, bitSaati, saatlikUcret, mesaiKatSayisi));

    }

    public static double ucretHesapla(double basSaati, double bitSaati, double saatlikUcret, double mesaiKatSayisi) {

        /*
            9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
            17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

            toplam = 536.0
         */

        double mesaiBitimi = 17.0;

        double toplamUcret;

        if (bitSaati < mesaiBitimi) {
            toplamUcret = (bitSaati - basSaati) * saatlikUcret;
        } else {
            toplamUcret = ((mesaiBitimi - basSaati) * saatlikUcret) + (bitSaati - mesaiBitimi) * saatlikUcret * mesaiKatSayisi;
        }

        return toplamUcret;

    /*
        double toplamUcret = 0;

        toplamUcret += (bitSaati - basSaati) * saatlikUcret;

        if (bitSaati > 17.00) {
            toplamUcret += (bitSaati - 17.00) * saatlikUcret * (mesaiKatSayisi - 1);
        }
        if (basSaati < 09.00) {
            toplamUcret += (09.00 - basSaati) * saatlikUcret * (mesaiKatSayisi - 1);
        }

        return toplamUcret;

    */

    }

}


