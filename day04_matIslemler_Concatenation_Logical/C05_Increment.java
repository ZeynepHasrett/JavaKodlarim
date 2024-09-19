package day04_matIslemler_Concatenation_Logical;

public class C05_Increment {

    public static void main(String[] args) {

        int sayi = 20;
        System.out.println(sayi); // 20

        // sayi = sayi + 3;
        sayi+= 3; // sayinin degerini 3 artir ve yeni deger olarak sayi degiskenini degistir
        System.out.println(sayi); // 23

        int ogrenciNo = 2025001;
        System.out.println("1.Öğrenci : " + ogrenciNo++); // 1. ogrenciye 2025001 degeri atar ve ogrenciNo degerini 2025002 yapar
        System.out.println("2.Öğrenci : " + ogrenciNo++); // 2. ogrenciye 2025002 degeri atar ve ogrenciNo degerini 2025003 yapar
        System.out.println("3.Öğrenci : " + ogrenciNo++); // 3. ogrenciye 2025003 degeri atar ve ogrenciNo degerini 2025004 yapar
        System.out.println("4.Öğrenci : " + ogrenciNo++); // 4. ogrenciye 2025004 degeri atar ve ogrenciNo degerini 2025005 yapar
        System.out.println(ogrenciNo); // 2025005


        int kitapNo = 2025000;
        System.out.println("1.Öğrenci : " + (kitapNo+=5));
        System.out.println("2.Öğrenci : " + (kitapNo+=5));
        System.out.println("3.Öğrenci : " + (kitapNo+=5));
        System.out.println("4.Öğrenci : " + (kitapNo+=5));
        System.out.println(kitapNo); // 2025020


        int a = 50;
        a*=3;
        System.out.println("a : " + a); // 150

        a/=5;
        System.out.println("a = " + a); // 30

        double c = 23.12;
        c-=5; // double integer degerleri kapsadigi icn sorun olmadi yani auto widening yapti
        System.out.println("c = " + c);


        int d = 128;
        d+=10.35;
        System.out.println("d = " + d);

    }
}
