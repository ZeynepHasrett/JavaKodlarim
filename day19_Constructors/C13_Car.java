package day19_Constructors;

public class C13_Car {

    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "renk atanmamis";
    int yil = 1900;
    int fiyat = 0;


    /*
        Parametre isimlerinin daha anlasilir olmasi icin
        instance variable isimleri ile ayni olmasi tercih edilir
    */


    // 1 parametre olarak marka ve model degerleri alan bir constructor olusturun
    C13_Car(String mrk, String mdl) {

        marka = mrk;
        model = mdl;
    }


    // 2 parametre olarak marka, model ve yil degerleri alan bir constructor olusturun
    C13_Car(String marka, String model, int yil) {
        // Eger bir scope'da var olan variable'i degil de
        // class level'daki variable'i kullanmak isterseniz
        // basina this. yazin

        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }


    // 3 Constructor'i intelliJ olusturabilir
    public C13_Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

}
