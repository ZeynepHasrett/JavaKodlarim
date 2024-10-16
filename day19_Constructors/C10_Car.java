package day19_Constructors;

public class C10_Car {

    /*
        Eger obje olusturulurken istedigimiz degerlere sahip olmsini istersek
        Constructor icinde atama yapabiliriz

        Bir class'ta signature farkli olmak sartiyla
        istedigimiz kadar constructor olusturabiliriz
     */

    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "renk atanmamis";
    int yil = 1900;
    int fiyat = 0;


    C10_Car() {
        // biz gorunur bir constructor olusturunca
        // Java kendi olusturdugu default constructor'i sildi
        // Daha once yazilan ve default constructor'i kulanan
        // objeler CTE vermesin diye
        // silinen default constructor'in yerine
        // bu constructor'i olusturduk
    }


    C10_Car(String mrk, String mdl, String rnk, int yl, int fyt) {
        marka = mrk;
        model = mdl;
        renk = rnk;
        yil = 2017;
        fiyat = fyt;
    }


    C10_Car(String mrk, String mdl, int yl, int fyt) {
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
    }


    C10_Car(String mrk, String mdl, String rnk, int fyt) {
        marka = mrk;
        renk = rnk;
        model = mdl;
        fiyat = fyt;
    }


    @Override
    public String toString() {
        return "Araba ozellikler ==> " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat
                ;
    }

}
