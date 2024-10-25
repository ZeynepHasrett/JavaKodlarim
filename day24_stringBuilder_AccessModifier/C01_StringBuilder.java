package day24_stringBuilder_AccessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // 16 karakterli kapasiteye sahip bos bir String Builder olusturuldu

        System.out.println("sb1 =" + sb1); // hiclik
        System.out.println("sb1'in uzunlugu = " + sb1.length()); // sb1'in uzunlugu = 0
        System.out.println("sb1'in kapasitesi = " + sb1.capacity()); // sb1'in kapasitesi = 16


        StringBuilder sb2 = new StringBuilder(7);
        // 7 karakter kapasiteye sahip bir String Builder olusturuldu

        System.out.println("sb2 =" + sb2); // hiclik
        System.out.println("sb2'in uzunlugu = " + sb2.length()); // sb2'in uzunlugu = 0
        System.out.println("sb2'in kapasitesi = " + sb2.capacity()); // sb2'in kapasitesi = 7


        // Burada 7 karakterli bir girise kadar sorun olmaz
        // fakat 7'den 1 tane daha fazla gerekirse
        // kapasite direkt (eski * 2) + 2 kadar artirilir
        sb2.append("Zeynep Kirbas");

        System.out.println("sb2 = " + sb2); // sb2 = Zeynep Kirbas
        System.out.println("sb2'in uzunlugu = " + sb2.length()); // sb2'in uzunlugu = 13
        System.out.println("sb2'in kapasitesi = " + sb2.capacity()); // sb2'in kapasitesi = 16


        StringBuilder sb3 = new StringBuilder(" DOGRU");

        System.out.println("sb3 = " + sb3); // sb3 =  DOGRU
        System.out.println("sb3'in uzunlugu = " + sb3.length()); // sb3'in uzunlugu = 6
        System.out.println("sb3'in kapasitesi = " + sb3.capacity()); // sb3'in kapasitesi = 22
        // Java bu sekilde olusturulan String Builder'larda 16+length kadarlik bir SB olusturur


        StringBuilder sb4 = new StringBuilder("Java");
        System.out.println("sb4 = " + sb4); // sb4 = Java
        System.out.println("sb4'in uzunlugu = " + sb4.length()); // sb4'in uzunlugu = 4
        System.out.println("sb4'in kapasitesi = " + sb4.capacity()); // sb4'in kapasitesi = 20


        sb4.append(" ogrenen pisman olmaz.");

        System.out.println("sb4 = " + sb4); // sb4 = Java ogrenen pisman olmaz.
        System.out.println("sb4'in uzunlugu = " + sb4.length()); // sb4'in uzunlugu = 26
        System.out.println("sb4'in kapasitesi = " + sb4.capacity()); // sb4'in kapasitesi = 42

        // capacity'i length'e indirgemek istersek
        sb4.trimToSize();
        System.out.println("sb4'in uzunlugu = " + sb4.length()); // sb4'in uzunlugu = 26
        System.out.println("sb4'in kapasitesi = " + sb4.capacity()); // sb4'in kapasitesi = 26


        long tcNo = 12356448254L;
        System.out.println("tcNo = " + (tcNo + 1));

        StringBuilder tcNoSb = new StringBuilder(11);
        tcNoSb.append("25698756984");
        System.out.println("tcNoSb =" + tcNoSb);


        StringBuilder sb5 = new StringBuilder();
        sb5.append("Java");
        String str = "Guzeldir";

        sb5.append(str, 0, 5);
        System.out.println(sb5); // JavaGuzel


        // StringBuilder'da olmayip String'de olan methodlari kullanmak istersek
        // oncelikle StringBuilder'i toString() ile String'e ceviririz

        // sb "a" iceriyor mu?
        System.out.println(sb5.toString().contains("A")); // false

        System.out.println(sb5.toString().toUpperCase().contains("A")); // true

    }

}
