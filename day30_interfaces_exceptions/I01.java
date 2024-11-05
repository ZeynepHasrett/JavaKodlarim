package day30_interfaces_exceptions;

public interface I01 {

    String str = "I01 str";
    int sayi = 45;
    boolean izindeMi = true;

    void method1();

    void method3();

    int method4();

    // void method7();
    // Bir interface'e sonradan abstract bir method ekledigimizde
    // o interface'i implement etmis olan tum child class'lar bundan etkilenir
    // tum child class'larin bu method'u kendisine uyarlamasi gerekir
    // bu da bitmis bir projede negatif etkiler olusturabilir

}
