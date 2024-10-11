package exercises.javaSorular.birinciVeIkinciHaftaSorular;

public class Q4_ForLoop {

    public static void main(String[] args) {

        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        //        ex: input:12345
        //        output: 1
        //                2
        //                3
        //                4
        //                5

        int sayi = 12345;

        String str = String.valueOf(sayi);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

}
