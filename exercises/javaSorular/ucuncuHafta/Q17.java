package exercises.javaSorular.ucuncuHafta;

public class Q17 {

    public static void main(String[] args) {

        // Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        //     Test Data:
        //     input    : "aabbcccccddddaaa"
        //     output   : abcd

        birKereYazdir("aabbcccccddddaaa");

    }

    public static void birKereYazdir(String kelime) {

        String sonuc = "";

        for (int i = 0; i < kelime.length(); i++) {

            if (!sonuc.contains(kelime.substring(i, i + 1))) {
                sonuc += kelime.substring(i, i + 1);

            }

        }

        System.out.println(sonuc);

    }

}
