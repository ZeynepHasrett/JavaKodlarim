package day11_nestedForLoop;

public class C08_KendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str = "Java Candir";

        int baslangicIndex = 2;

        int bitisIndex = 6;


        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis indexi metninsinirlari disinda ise hata verin
            2- baslangic indexi bitis indexinden buyuk ise hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */


        if (baslangicIndex > str.length() || bitisIndex > str.length()) {
            System.out.println("Verilen index'ler metnin sinirlari disindadir");
        } else if (baslangicIndex > bitisIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else {

            for (int i = baslangicIndex; i < bitisIndex; i++) {
                System.out.print(str.charAt(i));
            }

        }

        System.out.println(str.substring(baslangicIndex, bitisIndex));


        str = "Ali can";

        System.out.println(str.replace("A", "a")); // ali can

        str.substring(2); // calisir ama ne goruruz ne de sonradan kullanabiliriz
        System.out.println(str.substring(4)); // goruruz ama sonradan kullanamayiz
        String sonuc = str.substring(5); // goremeyiz ama sonradan kullanabiliriz

        /*
            Bize bir sonuc getiren methodlar da
            o sonuc ile ilgili biz de bir islem yapmaliyiz
            45. satirdaki method calisir, b,ze "i can" dondurur
            ama biz yazdirmadigimiz veya kaydetmedigimiz icin "i can" havaya gider

            46. satirdaki method calisir ve bize "can" getirir
            yazdirma islemi yapildigi icin konsolda "can" yazisini goruruz
            ama dondurulen "can" yazisini sonraki satirlarda yeniden kod yazmadan kullanamayiz

            46. satirdaki method calisir ve bize "an" getirir
            yazdirma islemi yapilmadigi icin konsolda "an" yazisini goremeyiz
            ama bir variable'a kaydettigimiz icin
            47. satirdan sonra ne zaman "an" degerine ihtiyacimiz olsa sonuc variable'inin kullanabiliriz
         */

    }

}
