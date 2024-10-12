package day12_methodOverloading_WhileLoop;

public class C04_WhileLoop {

    public static void main(String[] args) {

        /*
            SORU: 2 basamakli 7 ile bolunebilen sayilari yazdirin
         */


        int sayi = 10;

        String sayilar = "";


        while (sayi < 100) {
            if (sayi % 7 == 0) {
                sayilar += sayi + ", ";
            }
            sayi++;

        }

        System.out.println(sayilar);

    }

}
