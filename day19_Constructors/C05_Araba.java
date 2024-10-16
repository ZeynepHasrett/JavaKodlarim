package day19_Constructors;

public class C05_Araba {

    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "renk atanmamis";
    int yil = 1900;
    int fiyat = 0;

    C05_Araba() {
        // bir kod bloğunun constructor olmasi icin
        // MUTLAKA iki sarti karsilamasi gerekir
        // 1- ismi class ismi ile ayni olmalisdir (buyuk harfle baslar)
        // 2- return type olmaz
    }


    void method1() {
        // return type varsa method'tur
    }

    void C05_Araba() {
        // ismi class ismi ile ayni
        // AMA return type oldugu icin method'tur
    }

    //C005_Araba(){}
    // ismi class ismi ile ayni degil constructor olamaz
    // return type yok, method olamaz
    // CTE verir, calismaz

}
