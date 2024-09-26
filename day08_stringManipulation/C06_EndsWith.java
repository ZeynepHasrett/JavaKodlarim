package day08_stringManipulation;

public class C06_EndsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        System.out.println(str.endsWith("i")); // true
        System.out.println(str.endsWith("zevkli")); // true
        System.out.println(str.endsWith("cok zevkli")); // true

    }

}
