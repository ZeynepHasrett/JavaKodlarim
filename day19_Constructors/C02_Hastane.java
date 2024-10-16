package day19_Constructors;

public class C02_Hastane {


    /*
            C02_Hastane() {

                }

            default constructor parametresizdir
            ve body'sinde kod yoktur

            Gorunur bir constructur olusturuldugunda
            Java default constructor'i siler
     */


    String perIsim = "isim atanmamis";
    String perAdres = "adres atanmamis";
    String perTel = "tel atanmamis";


    C02_Hastane() {
        System.out.println("Parametresiz constructor calisti");
    }

    // Bu default constructor degildir
    // Bu parametresiz constructor'dir

}
