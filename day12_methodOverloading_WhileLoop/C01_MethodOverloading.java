package day12_methodOverloading_WhileLoop;

public class C01_MethodOverloading {

    public static void main(String[] args) {

        /*
               Bir class icinde ayni isme sahip
               Fakat farkli signature' a sahip methodlar yer alabilir.
               Bu duruma "Method Overloading" denir.

               Java'da bir method calistirildiginda
               Eğer ayni isimli baska bir method varsa Java argumentlerin uyumuna bakar.
               Uyum %100 olan varsa onu calistirir
               Yoksa en az casting yapacagina bakip onu calistirir
               Casting yaparak calistiracagi yoksa hata verir
               Eger method call ile cagirdigimiz methoda uygun bir method yoksa
               CTE verir ve kod calismaz

               Method Signature : Method adi + Argumentler (Parametreler)
         */


        topla(3, 7);
        topla(185, 325);

        topla(3, 2.1);

        topla(2.59, 125.3) ;
    }

    public static int topla(int sayi1, int sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }


    public static double topla(int sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }


    public static double topla(double sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

}
