package day07_ternary_switchStatements_stringManipulations;

import java.util.Locale;

public class C07_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Candir";

        // buyuk harfe cevirme

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str);

        // kucuk harfe cevirme

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str);


        // str'i kucuk harfe cevirip o haliyle kaydedin

        // bir string' in degerini kalici olarak degistirmek istiyorsak
        // ATAMA yapmaliyiz

        str = str.toLowerCase();

        System.out.println(str); // java candir


        // kalici olarak buyuk harfe cevirin

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

        str = str.toLowerCase(Locale.forLanguageTag("Tr")); // java candır

        System.out.println("Turkce kucuk harf ile : " + str);
        // Turkce kucuk harf ile : java candır

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str = str.toUpperCase();

    }

}
