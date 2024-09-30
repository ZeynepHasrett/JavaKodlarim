package day09_stringManipulations;

public class C12_ForLoop {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'in 1. harfini yazdirin

        System.out.println(str.charAt(0));

        // str'in harflerini her satirda 1 harf olacak sekilde
        // alt alta yazdirin

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));


        // Kullanicinin verdigi baslangic degerinden baslayip,
        // verdigi bitis degerine kadar olan sayilari toplayin

        int baslangicDegeri = 1978;

        int bitisDegeri = 2465;

        int toplam = 0;

        for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
            toplam += i;
        }

        System.out.println(toplam);

    }

}
