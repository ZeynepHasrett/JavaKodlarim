package exercises.javaSorular.ucuncuHafta;

public class Q2 {

    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.


        for (int i = 0; i <= 255; i++) {
            char karakter = (char) i;

            System.out.println("Sayi : " + i + " - Karakter : " + karakter);
        }

    }

}
