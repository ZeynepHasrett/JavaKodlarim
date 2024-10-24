package day24_stringBuilder_AccessModifier;

public class C03_StringBuilderKarsilastirma {
    public static void main(String[] args) {

        String str1 = "Murat";

        String str2 = "Murat";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        StringBuilder sb1 = new StringBuilder("Murat");
        StringBuilder sb2 = new StringBuilder("Murat");


        System.out.println("-------------------------");
        // Ayni metne sahip yani icerige sahip str1, sb1, sb2 'yi karsilastiralim

        System.out.println(sb1 == sb2); // false
        // Java compile ederken de run ederken de sorun cikarmaz
        // ama hep false der
        System.out.println(sb1.equals(sb2)); // false

        // equals()' un tek true verecegi hali sudur
        System.out.println(sb1.equals(sb1)); // true

        // String Builder' larin metinsel esitligi compareTo() methodu ile karsilastirilir
        // karsilastirma sonucu 0 ise iki String Builder da birbirinin aynidir
        // ikisinin compare edilmesi sonucu 0 degil ise bu biz ikisinin esit olmadigini gosterir
        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("java");
        StringBuilder sb5 = new StringBuilder("Tava");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("Temu");

        System.out.println(sb3.compareTo(sb4)); // -32
        // karsilastirmaya baslarken ilk farkli karakterde durur ve
        // karakterler arasi farki ASCII degeriyle yazar
        // J ile j arasindaki fark 32 oldugu icin

        System.out.println(sb4.compareTo(sb3)); // 32

        System.out.println(sb5.compareTo(sb6)); // -4
        // ilk harf olan T ayni (Tava - Tele) a ile e arasinda 4 fark vardir

        System.out.println(sb6.compareTo(sb7)); // -1

    }

}
