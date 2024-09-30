package day09_stringManipulations;

public class C05_replaceAll {

    public static void main(String[] args) {

        String str = "Ali okula gitti. 3 saat sonra gelecek";

        // Tum t'leri buyuk T yapin

        System.out.println(str.replace("t", "T")); // Ali okula giTTi. 3 saaT sonra gelecek

        // 3'un yerine 2 yazin

        System.out.println(str.replace("3", "2")); // Ali okula gitti. 2 saat sonra gelecek

        // replace methodu, verilen metinde aranan char veya String'in
        // tum kullanimlarini bulur ve degistirir

        // replaceAll()'un farki regex kullanilabilmesidir.

        str = "ben 2 veya 3 saat sonra gelirim";

        // tum sayilari 5 yapin

        System.out.println(str.replaceAll("\\d", "5")); // ben 5 veya 5 saat sonra gelirim

    }

}
