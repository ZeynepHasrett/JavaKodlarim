package exercises.javaSorular.sekizinciHafta;

public class Q2 {

    public static void main(String[] args) {

        /*
            İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
            küçük yapan bir method yazınız.

            Örnekler
            getKelime("kal", "em") ? "Kalem"
            getWord("gözl", "emlemek") ? "Gözlemlemek"
            getWord("zor", "luk") ? "Zorluk"
         */

        getWord("kal", "em");

        getWord("gözl", "emlemek");

        getWord("zor", "luk");

    }

    public static void getWord(String str1, String str2){

        StringBuilder sb = new StringBuilder();

        sb.append(str1.replace(str1.substring(0,1), str1.substring(0,1).toUpperCase()).concat(str2));

        System.out.println(sb);

    }

}
