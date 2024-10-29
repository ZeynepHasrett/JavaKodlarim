package day26_inheritance;

public class C05_Corsa extends C04_Opel {

    C05_Corsa() {
        System.out.println("Corsa parametresiz constructor calisti");

    }

    String model = "Corsa";
    String kasa = "Corsa kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Almanya";
    String aku = "volta aku";

    public static void main(String[] args) {

        C05_Corsa corsa1 = new C05_Corsa();

        System.out.println(corsa1.sanzuman); // Sanzuman secilmedi

        System.out.println(corsa1.marka); // Opel
        System.out.println(corsa1.guvenlik); // DGS 1001
        System.out.println(corsa1.fren); // ABS

        System.out.println(corsa1.model); // Corsa
        System.out.println(corsa1.motor); // vvdi
        System.out.println(corsa1.kasa); // Corsa kasasi
        System.out.println(corsa1.lastik); // 15 inch Pirelli
        System.out.println(corsa1.uretimYeri); // Almanya
        System.out.println(corsa1.aku); // volta aku

    }

}
