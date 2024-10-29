package day25_encapsulation_inheritance;

public class C09_Toyota extends C08_Araba {

    // Dunyada Toyota olarak adlandirilip
    // modeli olmayan bir arac yok
    // o zaman bu Toyota class'i kendisinden obje olusturmak icin degil
    // alt class'lari bir cati altinda toplamak icinolusturulmustur

    // 1- bu class baslangic itibariyle parent'i olan
    //    C08_Araba class'indaki tum ozelliklere sahiptir
    //    ornegin bu class'da marka, kasa veya motor variable'lari olmasa da
    //    parent class'daki var olan variable'lari kullanabiliriz

    protected C09_Toyota() {
        // System.out.println(marka);
        // System.out.println(kasa);
        // motor = "1.4 benzinli";
    }

    // 2- Toyota class'i isterse parent class'i olan Araba class'indaki
    //    bazi variable'lari kendisine uyarlayabilir

    protected String marka = "Toyota";
    protected String motor = "Cevreye duyarli motor";

    // 3- Toyota class'i isterse parent class'da olmayan
    // yeni ozellikler ekleyebilir

    protected String lastik = "Pirelli";
    protected String guvenlik = "DGS 1001";
    protected String fren = "ABS";

    // bu durumda Toyota class'indan olusturulacak obje olsa
    // Araba class'indan 3 adet (model, sanzuman ve kasa)
    // guncelledigi 2 adet (marka ve motor)
    // yeni ekledigi 3 adet (lastik, guvenlik ve fren)
    // toplam 8 ozellige sahip olur

}
