package day08_stringManipulation;

public class C03_Contains {

    public static void main(String[] args) {

        // Verilen bir string variable icinde baska bir string variable olup olmadigini kontrol eder
        // kontrol edip sonuc olarak kac tane oldugunu vermez varsa true yoksa false doner
        // yani boolean sonuc doner
        // contains() case sensitive'dir. Buna gore arama yapar
        // parametre olarak sadece string deger kabul eder

        String str = "Ne guzel 1 gun";
        int sayi = 1;


        System.out.println(str.contains("e")); // true
        System.out.println(str.contains("ne")); // false
        System.out.println(str.contains("guzel"));
        ; // true
        System.out.println(str.contains("uz")); // true

        System.out.println(str.contains("1")); //true

        System.out.println(str.contains(1 + "")); // true
        // contains metodu string disinda parametre kabul etmez.
        // bu nedenle int olan 1 degerini stringe cevirmek gerekir
        // yanina string bir hiclik koydugumuzda bu bizim icerideki tum degerleri string algilanmasini saglar


        System.out.println(str.contains(sayi + "")); // true

        System.out.println(str.contains("Ne  guz")); // false

    }

}
