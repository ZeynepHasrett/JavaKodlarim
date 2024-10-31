package day27_inheritance;

/*
    Java bir vaiable'in degerini bulmak icin
     - once bulundugu scope'a bakar
     - scope'ta yoksa class level'a bakar
     - class level'da da yoksa parent class(lar)'a bakar bakar
    ve ilk buldugu degeri (en guncel degeri) kullanir

    this. ve super. kullanildi ise
    Java aramaya baslama noktasini degistirir
    this. denilmisse aramaya class level'dan
    super. denilmisse aramaya parent class'dan baslar
    ve ilk buldugunu kullanir

    Java aramaya basladiktan sonra hep yukari dogru cikar
    bulursa kullanir, bulamazsa CTE verir (geriye donmez)
 */

public class C02_Child extends C01_Parent {

    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";


    public static void main(String[] args) {

        C02_Child obj = new C02_Child();
        obj.method1();

    }

    public void method1() {

        String str = "Child class method";
        String t = "Cansu";
        String z = "Oguzhan";

    }

}
