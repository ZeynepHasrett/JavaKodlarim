package day19_Constructors;

public class C12_KodOkumaDikkatEdilecekler {

    /*
        Kod okuma sorularinda
        bizi sasirtmak icin
        bekledigimiz atamalar yerine, farkli ve ilgisiz atamalar yapilabilir

        Kod okuma sorularinda biz misafir oldugumuz icin
        kodda ne islem yapildi ise
        o islemi takip eder
        sonucunu kabul ederiz

        CTE vermedigi surece kod icin yanlis yazilmis diyemeyiz
      */


    int sayi = 23;
    String isim = "Ali";
    char chr = '@';

    C12_KodOkumaDikkatEdilecekler(int sy, String ism) { // 1
        sayi = 34;
        isim = ism.toUpperCase();
    }


    C12_KodOkumaDikkatEdilecekler() { // 2
        chr = '%';
        isim = "Esra";
    }


    C12_KodOkumaDikkatEdilecekler(int sy, String ism, char a) { // 3
        isim = ism;
        sayi = sy;


    }

    public static void main(String[] args) {

        C12_KodOkumaDikkatEdilecekler obj3 = new C12_KodOkumaDikkatEdilecekler(22, "Hamza", 'p');
        // 3 numarali constructor calisir

        System.out.println(obj3.sayi); // 22
        System.out.println(obj3.isim); // Hamza
        System.out.println(obj3.chr); // @


        C12_KodOkumaDikkatEdilecekler obj2 = new C12_KodOkumaDikkatEdilecekler(5, "Cansu");
        // 1 numarali constructor calisir

        System.out.println(obj2.sayi); // 34
        System.out.println(obj2.isim); // CANSU
        System.out.println(obj2.chr); // @


        C12_KodOkumaDikkatEdilecekler obj1 = new C12_KodOkumaDikkatEdilecekler();
        // obj1 icin 2 numarali constructor calisir
        // parametresiz olsa da degerlerinin degismeyecegini garanti edemeyiz

        System.out.println(obj1.sayi); // 23
        System.out.println(obj1.isim); // Esra
        System.out.println(obj1.chr); // %


    }

}
