package javaPractice.day01;

public class P01_HelloWorld {

    public static void main(String[] args) {

        /*
            Asagidaki metni tek bir sout icerisine yazacaginiz kod ile
            asagida gorundugu gibi konsola yazdiriniz

            Hello World
                "Merhaba Dünya"
         */

        System.out.println("Hello World\n\t\"Merhaba Dünya\"");

        /*
            \n alt satira gecme noktasini belirler
            \t bir TAB bosluk birakir
            \ \ isaretinden sonra gelen isareti metin olarak algilar
            \ " yazarsak " metinsel olur
            \  ' yazarsak ' metinsel olur
        */

        System.out.println("Merhaba"); // println kismindaki ln line kisaltmasidir. Kod calisinca alt satira gecer
        System.out.print("Nasilsin"); // ln olmadan sadece print dersek kod calisir ve alt satira gecmez, bir sonraki kod yanindan devam eder
        System.out.println("Murat");

        double a = 23.25;
        System.out.println("a = " + a);

        System.err.println("Team 148 Hosgeldiniz"); // Hata yazdirma kodu, kırmızı yazar

    }
}
