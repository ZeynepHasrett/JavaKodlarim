package extraJavaPractice.day06;

public class Sekil {

        /*
           Cember, dikdortgen ve kare sekillerinin alan ve cevre hesaplamasini yapan bir uygulama gelistiriniz.
           1-asagidaki hiyarasiye gore classlar creat ediniz...
               Sekil class(parent) <--Cember class(child)
               Sekil class(parent) <--Dikdortgen class(child)<--Kare class(child)
           2- Classlara uygun olacak sekilde yaricap, uzunluk ve genislik variable'lar ekleyiniz.
           3- Cember Dikdortgen Karenin alan ve cevre hesaplamalarini yaptirip sonuclari Runner classta yazdiriniz.
        */

    double yaricap;
    double uzunKenar;
    double kisaKenar;

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    double alanHesaplama(double yaricap){
        return (yaricap * yaricap) * 3.14;
    }

    double cevreHesaplama(double yaricap){
        return 2 * 3.14 * yaricap;
    }

    double alanHesaplama(double uzunKenar, double kisaKenar){
        return uzunKenar * kisaKenar;
    }

    double cevreHesaplama(double uzunKenar, double kisaKenar){
        return 2 * (uzunKenar + kisaKenar);
    }

}


