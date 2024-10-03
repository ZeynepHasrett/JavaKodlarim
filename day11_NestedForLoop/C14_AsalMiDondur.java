package day11_NestedForLoop;

public class C14_AsalMiDondur {

    public static void main(String[] args) {

        // Verilen sayi asal ise TRUE
        // asal degil ise FALSE donduren bir method olusturun

        System.out.println(asalMi(23)); // true
        System.out.println(asalMi(97)); // true
        System.out.println(asalMi(111)); // false

    }

    public static boolean asalMi(int sayi) {

        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                asalMi = false;
                break;
            }

        }

        // flag icin 2 olasi deger var
        // eger flag == 20 ==> ASALDIR

        return asalMi;

    }

}
