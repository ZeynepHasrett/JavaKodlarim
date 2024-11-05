package day30_interfaces_exceptions;

public interface I03_InterfacedeBodysiOlanMethodOlusturma {

    void method1();
    // Interface'de olusturulan tum method'lar public ve abstract'tir
    // yazsak da yazmasak da farketmez


    public default void method2() {
        // Extension method should have a body

        /*
            Buradaki default keyword 5. default kullanimimiz

            bu default'un access modifier olmadigi acik
            cunku yaninda public var

            Java 8 ile beraber
            developer'larin talebi uzerine
            Java istisnai bir kullanim olusturmustur

            AMAC
            bir interface'e sonradan method eklendiginde
            yeni eklenen method'u
            MECBURI IMPLEMENT EDILECEK METHOD statusunden cikarmaktir

            Bunu saglamak icin
            Java sonradan eklenen method'a
            "static" veya "default" keyword'unun eklenmesi
            ve bu method'un body'e sahip olmasi cozumunu uretmistir
            boylece abstract class'larda opsiyonel olan
            body'li method'lar gibi kullanilabilirler
         */

    }

    public static void method3() {
        // Static methods in interfaces should have a body
    }

}