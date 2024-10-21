package day21_passByValue_immutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
            Bir variable'i argument olarak kullanip
            baska bir method'a gonderdigimizde
            Java variable'in kendisini degil VALUE yani degerini gonderir
         */

        String cumle = "java her gun daha da guzellesiyor";

        //uzunlukYazdir(cumle); // method'da Verilen cumlenin uzunlugu : 33 yazdirir

        buyukHarfeCevir(cumle); // Method'da cumle : JAVA HER GUN DAHA DA GUZELLESİYOR

        System.out.println("main method da cumlenin son hali : " + cumle);
        // main method da cumlenin son hali : java her gun daha da guzellesiyor

    }

    public static void uzunlukYazdir(String cumle) {

        // cumle'nin uzunlugunu yazdirin

        System.out.println("Verilen cumlenin uzunlugu : " + cumle.length());

        /*
            cumle variable'i main method icerisinde olusturuldugu icin
            local bir variable'dir
            scope'u main method'tur
            ve main method disindan kullanilamaz

            Eger cumle variable'inin degerini
            uzunlukYazdir method'unda kullanmak istersek
            parametre olarak yollayabiliriz

         */

    }

    public static void buyukHarfeCevir(String cumle) {

        cumle = cumle.toUpperCase();

        System.out.println("Method'da cumle : " + cumle);

    }

}
