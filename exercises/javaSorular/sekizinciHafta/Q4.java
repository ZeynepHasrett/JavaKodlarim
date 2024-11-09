package exercises.javaSorular.sekizinciHafta;

public class Q4 {

    public static void main(String[] args) {

        /*
             String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
             Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
             bu String için sonuç 1 olacak.
             Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndürsün.

            Örnekler:
            duplicates("Hello World!")
            Çıktı : 2
            duplicates("foobar")
            Çıktı : 1
            duplicates("helicopter")
            Çıktı : 1
         */

        duplicates("Merhaba");

        duplicates("Hello World!");

        duplicates("foobar");

        duplicates("helicopter");

    }

    public static void duplicates(String str) {

        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {

            char simdikiChar = str.charAt(i);

            if (str.indexOf(simdikiChar, i + 1) != -1) {
                sayac++;
            }

        }

        System.out.println("Çıktı : " + sayac);

    }

}
