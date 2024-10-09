package day11_nestedForLoop;

public class C11_AsalSayiMi {

    public static void main(String[] args) {

        // Verilen sayi asal ise true,
        // asal sayi degil ise false yazdiran bir method olusturun

        asalMiYazdir(23); // TRUE
        asalMiYazdir(679); // FALSE

    }


    public static void asalMiYazdir(int sayi) {

        int flag = 20;


        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                System.out.println("FALSE");
                flag = 42;
                break;
            }

        }

        // flag icin 2 olasi deger var
        // eger flag == 20 ==> ASALDIR

        if (flag == 20) System.out.println("Girilen sayi TRUE");

    }

}
