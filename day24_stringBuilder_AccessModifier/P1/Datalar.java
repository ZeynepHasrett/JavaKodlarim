package day24_stringBuilder_AccessModifier.P1;

public class Datalar {

    static private int sayiPrivate = 97; // private

    static String strDefault = "Merhaba";

    static protected char chrProtected = 65;

    static public double doublePublic = 128.32;


    private static void methodPrivate() {
        System.out.println("Private olan method calisti");
    }

    static void methodDefault() {
        System.out.println("Default olan method calisti");
    }

    protected static void methodProtected() {
        System.out.println("Protected olan method calisti");
    }

    public static void methodPublic() {
        System.out.println("Public olan method calisti");
    }

    public static void main(String[] args) {

        System.out.println(sayiPrivate);
        methodPrivate();

        System.out.println(strDefault);
        methodDefault();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(doublePublic);
        methodPublic();

    }

}
