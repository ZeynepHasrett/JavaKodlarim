package day24_stringBuilder_AccessModifier.P2;

import day24_stringBuilder_AccessModifier.P1.Datalar;

public class FarkliPackageChildClass extends Datalar {

    public static void main(String[] args) {

        // System.out.println(Datalar.sayiPrivate);
        // Datalar.methodPrivate();

        // System.out.println(Datalar.strDefault);
        // Datalar.methodDefault();

        System.out.println(Datalar.chrProtected);
        Datalar.methodProtected();

        System.out.println(Datalar.doublePublic);
        Datalar.methodPublic();
    }

}
