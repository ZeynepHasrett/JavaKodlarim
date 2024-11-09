package day08_stringManipulation;

public class C08_IndexOf {

    public static void main(String[] args) {

        // indexOf metodu tek parametre ile yazilirsa o parametrenin ilk bulundugu index'i
        // iki parametre olarak yazilirsa da verilen index'ten sonraki ilk kullanimin index'ini verir


        String str = "Cok calismam gerekiyor cok";

        // a harfi str'da ilk olarak hangi index'te
        System.out.println(str.indexOf('a')); // 5

        // calis kelimesi hangi index'ten itibaren basliyor
        System.out.println(str.indexOf("calis")); // 4

        // 5. index'ten sonra aradiginda ilk o harfi hangi index'tedir
        System.out.println(str.indexOf('o', 5)); // 20
        // DİKKAT: Aramaya verilen index'ten baslar fakat index yazarken bastan sayar

        // metin icinde olmayan bir harf ya da kelime aranirsa
        System.out.println(str.indexOf('x')); // -1
        System.out.println(str.indexOf("murat")); // -1
        // sonuc -1 yazarsa aranan sey metinde yoktur

    }

}
