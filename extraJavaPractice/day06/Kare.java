package extraJavaPractice.day06;

public class Kare extends Sekil{

    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Karenin kenari: " + uzunKenar + "----" +
                " Karenin alani: " + alanHesaplama(uzunKenar, kisaKenar) + "----" +
                " Karenin cevresi: " + cevreHesaplama(uzunKenar, kisaKenar);
    }
}
