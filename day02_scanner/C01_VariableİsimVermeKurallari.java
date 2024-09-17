package day02_scanner;

public class C01_VariableİsimVermeKurallari {

    public static void main(String[] args) {

        // kural 1 : deklarasyon bir kere olur ama istediginiz kadar deger atamasi yapilabilir

        int sayi = 10;

        int not;

        not = 90;

        // int not = 80; // Variable 'not' is already defined in the scope

        // double not = 56.7; //Variable 'not' is already defined in the scope

        // kural 2 : Java'da variable isimleri kucuk harfle baslar
        //           ama buyuk harf kullanilsa da Java itiraz etmez
        //           ONEMLİ : Java case sensitive'dir yani buyuk-kucuk harfe duyarlidir

        int nOT = 56;
        int noT = 67;
        int Not = 23;

        System.out.println(not); // 90
        System.out.println(Not); // 23

        int not_ = 23;
        int no$t = 45;
        int n1o2t3 = 90;
        // int no&t = 67; // Java isimde _ ve $ disinda ozel karaktere izin vermez
        // int n o t = 87; // bosluga da izin vermez

        // int 2not = 32; // isim sayi ile baslayamaz

        int _not = 56; // alt cizgi ile baslamasi tavsiye edilmez
        int $not = 86; // cok da begenilmez

        // int int = 58; // isim olarak keywordler kullanilamaz
        // int class = 34; // isim olarak keywordler kullanilamaz
        // int public = 81; // isim olarak keywordler kullanilamaz


        // camelCase kurali

        char ismin_ilk_harfi = 'a';
        char isminIlkHarfi = 'y'; // camelCase kullanimi
        double sinifinYasOrtalamasi = 12.6; // camelCase kullanimi

    }

}
