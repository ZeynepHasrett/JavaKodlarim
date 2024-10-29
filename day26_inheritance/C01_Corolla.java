package day26_inheritance;

import day25_encapsulation_inheritance.C09_Toyota;

public class C01_Corolla extends C09_Toyota {

    /*
        1-  Baslangic itibariyle parent'i olan Toyota
            ve grandparent'i olan araba class'larindaki
            tum ozelliklere sahiptir

        2-  Corolla class'i parent ve grandparent class'larindaki
            istedigi variable'lari kendisine uyarlayabilir

        3-  Corolla class'i butun Corolla araclarda olan
            ama parent class'i Toyota veya grandparent'i olan Araba class2larinda olmayan
            yeni variable'lar ekleyebilir
    */

    String model = "Corolla";
    String kasa = "Corolla kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Turkiye";
    String aku = "Inci aku";
    String renk = "renk secilmedi";
    String yakitTuru = "yakit turu secilmedi";


    C01_Corolla() {
        System.out.println(marka); // Toyota
        System.out.println(motor); // Cevreye duyarli motor
        System.out.println(kasa); // Kasa secilmedi
    }

    public static void main(String[] args) {

        C01_Corolla corolla1 = new C01_Corolla();

        System.out.println(corolla1.sanzuman); // Sanzuman secilmedi (Araba class'indan)
        System.out.println(corolla1.marka); // Toyota (Toyota class'indan)
        System.out.println(corolla1.guvenlik); // DGS 1001 (Toyota class'indan)
        System.out.println(corolla1.fren); // ABS (Toyota class'indan)

        System.out.println(corolla1.model); // Corolla (Corolla class'indan)
        System.out.println(corolla1.kasa); // Corolla Kasasi (Corolla class'indan)
        System.out.println(corolla1.motor); // vvdi (Corolla class'indan)
        System.out.println(corolla1.lastik); // 15 inch Pirelli (Corolla class'indan)
        System.out.println(corolla1.uretimYeri); // Turkiye (Corolla class'indan)
        System.out.println(corolla1.aku); // Inci aku (Corolla class'indan)
        System.out.println(corolla1.renk); // renk secilmedi (Corolla class'indan)
        System.out.println(corolla1.yakitTuru); // yakit turu secilmedi (Corolla class'indan)

        corolla1.sanzuman = "Otomatik";
        corolla1.kasa = "Corolla sedan";
        corolla1.renk = "Kirmizi";
        corolla1.yakitTuru = "Hybrit";

    }

}
