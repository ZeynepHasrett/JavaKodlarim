package day08_stringManipulation;

public class C09_LastIndexOf {

    public static void main(String[] args) {

        /*
            lastIndexOf metodu indexOf metoduna benzer fakat
            bu metod sondan itibaren aranan degerin nerede olduguna bakar
            sondan basa dogru arar fakat bulunca hangi index'te oldugunu bastan sayarak soyler

         */

        String str = "Benim cok calismam lazim cok";

        System.out.println(str.indexOf("cok")); // 6

        System.out.println(str.lastIndexOf("cok")); // 25

        // cok kelimesi ne kadar kullanilmis
        int a = str.indexOf("cok");
        int b = str.lastIndexOf("cok");

        if (a == b) {
            System.out.println("cok kelimesi 1 kere kullanilmis");
        } else {
            System.out.println("cok kelimesi 1'den fazla kullanilmis");
        }

    }

}
