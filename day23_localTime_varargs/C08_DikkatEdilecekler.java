package day23_localTime_varargs;

public class C08_DikkatEdilecekler {

    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // sonuncusu haric geriye kalanlari toplayip
        // bulunan toplam degeri ile son sayinin carpimini yazdiran
        // bir method olusturun

        islemYap(2, 3, 4); // 20
        islemYap(1, 2, 3, 4, 5); // 50
        islemYap(1, 2, 3, 4, 5, 6, 0); // 0

    }
        /*
            public static void islemYap(int... v, int sonSayi){

            // Vararg bir parametre varsa son parametre olmak zorundadir
            // vararg element almada sinir tanimaz, tum elementleri almak ister
         */

    public static void islemYap(int... v) {

        // vararg array alt yapisini kullandigi icin
        // son elementi vararg icinde ayirabiliriz


        // vararg'da son element haric, bastaki elementleri toplayin

        int toplam = 0;

        for (int i = 0; i <= v.length - 2; i++) {
            toplam += v[i];
        }

        System.out.println(toplam * v[v.length - 1]);

    }

}


