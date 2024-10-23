package day23_localTime_varargs;

public class C05_Varargs {

    public static void main(String[] args) {

        topla(5, 7); // 12
        topla(3, 4, 5); // 12
        topla(3, 4, 5, 6); // ==> int[] a = {3,4,5,6}
        topla(3, 4, 5, 6, 7); // 25
        topla(3, 4, 5, 6, 7, 8); // 33
        topla(3, 4, 5, 6, 7, 8, 9); // 42
        topla(); // 0

        // varargs parametre olarak kullanilmak icin tasarlanmistir
        // method'larin icinde zaten array kullanabiliyoruz

    }

    public static void topla(int... a) {
        // int... icine istedigimiz kadar int koyabilecegimiz bir array olan varargs'i ifade eder
        // var args ==> variety of arguments sayilarinin farkli olabilmesi

        // a tum elementleri icine alan bir array olduguna gore
        // tum elementleri toplamak icin for loop kullanilabilir

        int toplam = 0;

        for (int each : a) {
            toplam += each;
        }

        System.out.println("tum tamsayinin toplami : " + (toplam));

    }

    public static void topla(int a, int b) {
        System.out.println("iki tamsayinin toplami : " + (a + b));
    }

    public static void topla(int a, int b, int c) {
        System.out.println("uc tamsayinin toplami : " + (a + b + c));

    }

}
