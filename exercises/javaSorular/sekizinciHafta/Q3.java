package exercises.javaSorular.sekizinciHafta;

public class Q3 {

    public static void main(String[] args) {

        /*
            Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
            Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.

            Örnekler

            kayipHarfler("abdefg")
            Çıktı : c

            kayipHarfler("mnopqs")
            Çıktı : r

            kayipHarfler("abcdefgh")
            Çıktı : Sıralı Harfler

            ilk örnekte :  /// b harfinden sonra c gelmemiş
            ikinci örnekte : /// p harfinden sonra r gelmemiş
         */

        kayipHarfler("abdefg");

        kayipHarfler("mnopqs");

        kayipHarfler("abcdefgh");

    }

    public static void kayipHarfler(String str) {

        StringBuilder sb = new StringBuilder();

        boolean siraliMi = true;

        for (int i = 1; i < str.length(); i++) {

            char oncekiHarf = str.charAt(i - 1);
            char simdikiHarf = str.charAt(i);

            if (simdikiHarf - oncekiHarf != 1) {
                System.out.println("Çıktı : " + (char) (oncekiHarf + 1));
                siraliMi = false;
                break;
            }

        }

        if (siraliMi) {
            System.out.println("Çıktı : Sıralı Harfler");
        }

    }

}
