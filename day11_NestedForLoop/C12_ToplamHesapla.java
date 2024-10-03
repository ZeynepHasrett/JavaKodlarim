package day11_NestedForLoop;

public class C12_ToplamHesapla {

    public static void main(String[] args) {

        // Verilen iki tamsayi ve aralarindaki tum tam sayilari toplayip
        // sonucu donduren bir method olusturun

        araliktakiToplamiGetir(4, 6); // calisir ama yazdirmadigimiz icin goremeyiz
                                                     // ve kaydetmedigimiz icin kullanamayiz

        System.out.println(araliktakiToplamiGetir(8, 10));
        // yazdirir ama tekrar kullanamayiz

        int ikiBasSayilarToplami = araliktakiToplamiGetir(10, 99);
        // yazdirmadigimiz icin konsolda gormeyiz ama istedigimiz zaman yazdirabilir veya kullanabiliriz

        // iki basamakli sayilarin toplaminin asal olup olmadigini yazdirin

        C11_AsalSayiMi.asalMiYazdir(ikiBasSayilarToplami); // FALSE



    }


    public static int araliktakiToplamiGetir(int baslangic, int bitis) {

        int toplam = 0;

        if (baslangic < bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }

        } else {
            for (int i = baslangic; i >= bitis; i--) {
                toplam += i;
            }
        }

        return toplam;

    }

}
