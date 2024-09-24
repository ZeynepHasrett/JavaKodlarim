package day06_nestedIfElseStatements_Ternary;

public class C10_Ternary_AtamaYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // sayi cift ise "Cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin


        // ternary tek basina kullanilmaz
        // ya sout icinde kullanilmali
        // veya bir variable'a atanmalidir

        int sayi = 20;

        // sayi > 30 ? "guzel yaz" : "tuh";
        // ternary sonuc urettigi icin tek basina kullanilamaz

        // ya bir variable'a atanmalidir
        String sonuc = sayi > 30 ? "guzel yaz" : "tuh";

        // veya sout icinde kullanilmali
        System.out.println(sayi > 30 ? "guzel yaz" : "tuh");


        // Verilen bir sayinin degerini kontrol edip
        // sayi cift ise "Cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin

        // Bu soruyu da ternary ile yapamayiz
        // cunku atama ve yazdirma ayri ayri isteniyor

        int verilenSayi = 23;

        if (verilenSayi % 2 == 0) {
            System.out.println("Cift sayilari sevmem");
        } else {
            verilenSayi = verilenSayi + 10;
        }


        // Verilen bir sayinin degerini kontrol edip
        // sayi cift ise "Cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin ve yeni degeri yazdirin

        verilenSayi = 40;

        System.out.println(verilenSayi % 2 == 0 ? "Cift sayilari sevmem" : (verilenSayi += 10));

    }

}
