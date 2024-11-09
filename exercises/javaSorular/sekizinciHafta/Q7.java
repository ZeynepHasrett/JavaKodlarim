package exercises.javaSorular.sekizinciHafta;

public class Q7 {

    public static void main(String[] args) {

        /*
            Ortadaki harfi alabileceğimiz bir program yazın.
            Eğer harf sayısı 2 nin katına eşitse,
            ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

            Examples

            ortadakiHarf("test")
            Çıktı : es
            ortadakiHarf("testing")
            Çıktı : t
            ortadakiHarf("middle")
            Çıktı : dd
            ortadakiHarf("A")
            Çıktı : A
         */

        ortadakiHarf("test");
        ortadakiHarf("testing");
        ortadakiHarf("middle");
        ortadakiHarf("A");

    }

    public static void ortadakiHarf(String str) {

        if (str.length() % 2 == 0) {
            System.out.println("Çıktı : " + (str.substring((str.length() / 2) - 1, (str.length() / 2) + 1)));
        } else {
            System.out.println("Çıktı : " + str.substring((str.length() / 2), (str.length() / 2) + 1));
        }

    }

}
