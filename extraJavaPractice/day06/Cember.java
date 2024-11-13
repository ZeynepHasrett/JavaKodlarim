package extraJavaPractice.day06;

public class Cember extends Sekil{

    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "Cemberin yaricapi=" + yaricap + " ----" +
                " Cemberin alani= " + alanHesaplama(yaricap) + "----" +
                " Cemberin cevresi= " + cevreHesaplama(yaricap);
    }

}
