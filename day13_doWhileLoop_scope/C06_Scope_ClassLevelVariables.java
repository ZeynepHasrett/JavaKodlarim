package day13_doWhileLoop_scope;

public class C06_Scope_ClassLevelVariables {

    /*
        1- Class Level'da lusturulan variable'larin scope'u tum class'tir
        yani tum class'tan kullanilabilirler

        2- Class level'da olusturulan variable'lar icin Java 2 alternatif sunar
            - static variable : declarasyonunda static keyword kullanilan variable'lar
            - instance variable : declarasyonunda static keyword kullanilmayan variable'lar

        3- Ancak class level variable'larin kullanim seklinde static keyword'u de etkilidir
            - Eger variable static ise her yerden direkt olarak kullanilabilir
            - variable instance ise (static degil) secim hakki method'a gecer
            - static method'lar sinirlarindan iceri static olmayan hicbir seyin girmesine izin vermezler

        4- Local variable'lar deger atanmdan declare edilebilir
           Ama deger atanmadan kullanilamaz

           Clacc Level Variable'lar deger atanmadan da kullanilabilir
           Biz deger atamamissak Java Class Level Variable'lar icin belirlemis oldugu
           default degerleri atama yapar
           non-primitive'ler icin       ==> null
           sayisal primitive'ler icin   ==> 0
           boolen icin                  ==> false
           char icin                    ==> hiclik

     */

    public String str = "java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi = true;
    public static boolean aktifMi;
    public static char ilkHarf = 'A';
    static char karakter;


    public static void main(String[] args) {
        System.out.println(isim);
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(karakter);

    }

    static void method1() {
        System.out.println(isim);
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(karakter);
    }

    public void method2() {
        System.out.println(isim);
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(karakter);
    }

}
