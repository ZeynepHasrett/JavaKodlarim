package day08_stringManipulation;

public class C05_StartsWith {

    public static void main(String[] args) {

        /*
            bir string'i baska bir string ile baslayip baslamadigini kontrol eder.
            İki kullanimi vardir.
            İlkinde bastan bakar.
            İkinci kullanimda ise istediginiz index'in istediginiz bir string ile baslayip baslamadigini kontrol eder
         */

        String str = "Java Ogrenmek cok guzel, cok";

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java ")); // true
        System.out.println(str.startsWith("Java Ogrenmek cok guzel, cok")); // true
        System.out.println(str.startsWith("Ogrenmek", 5)); // true

    }


}
