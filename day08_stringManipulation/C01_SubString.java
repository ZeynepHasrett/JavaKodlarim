package day08_stringManipulation;

public class C01_SubString {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.length()); // 30


        // 17. karakteri yazdirin
        System.out.println(str.charAt(19)); // u - bu harfi charAt() kullanarak buyuk yazdiramayiz.
        // Cunku char degerlerde string metodlar calismaz


        System.out.println(str.substring(19, 20).toUpperCase()); // U

        // 10.karakterden basla sona kadar yazdir
        System.out.println(str.substring(9)); //

        // 10. karakter ile 10. index farkli seylerdir.
        // index 0'dan basladigi icn 10. karakter 9.index'teki karakterdir


        // 10.index'ten sonrasini yazdir
        System.out.println(str.substring(10)); // ectikce guzellesiyor

        // 2.kelime hariç kalani yazdir
        System.out.println(str.substring(5)); // gun gectikce guzellesiyor

        // son 6 karakteri yazdir
        System.out.println(str.substring(str.length() - 6)); // esiyor

        // son harfi yazdir
        System.out.println(str.substring(str.length() - 1)); // r
        System.out.println(str.substring(29)); // r


        System.out.println(" "); // bosluk
        System.out.println(str.length()); // hiclik yazdirir
        System.out.println(str.substring(str.length())); // hiclik yazdirir

        // System.out.println(str.substring(str.length()+1)); // hata verir
        // System.out.println(str.substring(5,2));

        // ilk 10 karakteri yazdirin
        System.out.println(str.substring(0, 10)); // Java gun g

        System.out.println(str.substring(12, 12)); // hiclik

    }

}
