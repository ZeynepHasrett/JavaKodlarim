package day26_inheritance;

import day25_encapsulation_inheritance.C09_Toyota;

public class C02_YeniToyotaAraba extends C09_Toyota {

    // Class cannot extend multiple classes

    String model = "Yeni model";


    public static void main(String[] args) {

        C02_YeniToyotaAraba obj1 = new C02_YeniToyotaAraba();



    }

    /*
        Bir obje olusturulurken
        objeyi olusturup ilk deger atamasini Constructor yapar

        Constructor calismaya baslamadan once obje yoksa objei olusturur ve
        ait oldugu class'daki instance variable'lar ve degerlerinin birer kopyasini alip
        objeye yapistirir

        Child class'dan obje olusturuldugunda
        objenin parent class(lar)'daki ozelliklere de sahip olabilmesi icin
        parent class constructor'larinin da calismasi ZORUNLUDUR

        Java bunu super() sayesinde otomatik olarak yapar
     */

}
