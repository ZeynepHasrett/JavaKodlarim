package day12_methodOverloading_WhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {

        /*
            SORU: 1' den 100'e kadar olan sayilarin toplamini yazdirin
        */

        int toplam = 0;

        for (int i = 1; i < 100; i++) {
            toplam += i;
        }

        System.out.println("Toplam2 : " + toplam);


        System.out.println("--------------------");


        int sayi = 1;
        int toplam2 = 0;

        while (sayi < 100) {
            toplam2 += sayi;
            sayi++;
        }

        System.out.println("Toplam : " + toplam2);

    }


    /*
        FOR LOOP : Bize otomatik olarak bir format verir
        artis miktari, baslangic ve bitis degerleri otomatik olarak verir

        WHILE LOOP: Baslangic, bitis degerleri ve artis miktari
        manuel olarak tanimlanir
     */

}
