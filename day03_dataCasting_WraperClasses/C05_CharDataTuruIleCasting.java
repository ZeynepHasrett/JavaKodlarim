package day03_dataCasting_WraperClasses;

public class C05_CharDataTuruIleCasting {

    public static void main(String[] args) {

        /*
            char data turu ozel bir data turudur
            matematiksel islemlerde kullanildiginda
            ASCII table'daki degerleri ile isleme girerler

            char data turundeki degerler ve variable'lar
            < > gibi matematiksel islemlerde de kullanilabilir
            bu durumda Java ASCII degerlerine bakar
            biz ise bunu once mi veya sonra mi diye dusunebiliriz
         */

        String str1 = "Java";
        String str2 = " Candir";

        System.out.println(str1+str2); // Java Candir

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out.println( chr1 + chr2 + chr3 ); // 294

        int sayi1 = 'c';

        System.out.println("sayi1' in degeri : " + sayi1); // sayi1' in degeri : 99


        System.out.println( 'a' < 'e' ); // true (97 < 101)

        System.out.println('B' < 'b'); // true (66 < 98)

        System.out.println('g' < 't'); // true


        char verilenHarf = 'S';

        // verilen harften sonraki 3 harfi yazdirin

        System.out.println(verilenHarf + 1); // 84

        System.out.println(  (char) (verilenHarf + 1)  ); // T
        System.out.println(  (char) (verilenHarf + 2)  ); // U
        System.out.println(  (char) (verilenHarf + 3)  ); // V

    }
}
