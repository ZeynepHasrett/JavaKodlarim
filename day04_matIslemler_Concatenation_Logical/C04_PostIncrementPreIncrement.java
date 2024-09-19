package day04_matIslemler_Concatenation_Logical;

public class C04_PostIncrementPreIncrement {

    public static void main(String[] args) {

        int a = 30;
        int b = 50;
        int x = 40;
        int y = 60;

        System.out.println(x++); // 40
        System.out.println(x); // 41

        System.out.println(++y); // 61
        System.out.println(y); // 61


        a++; // a degerinin bir artirilmasi demek [ a = a + 1 ]
        // Burada once a degerini alir sonra bir artirir
        // Bu olaya "POST-INCREMENT" denir, yani sonradan artirma.

        System.out.println("a = " + a); // 31

        ++a;
        // Burada a degeri once artirilir, sonra a degeri kullanilir
        // Bu olaya "PRE-INCREMENT" denir.

        System.out.println("a = " + a); // 32

    }
}
