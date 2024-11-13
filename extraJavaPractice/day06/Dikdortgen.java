package extraJavaPractice.day06;

public class Dikdortgen extends Sekil{

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Dikdortgenin uzunkenari=" + uzunKenar +
                ", Dikdortgenin kisakenari=" + kisaKenar +
                "Dikdortgenin alani: "+alanHesaplama(uzunKenar,kisaKenar)+
                "Dikdortgenin cevresi: " +cevreHesaplama(uzunKenar,kisaKenar);
    }

}
