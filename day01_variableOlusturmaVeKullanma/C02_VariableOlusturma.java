package day01_variableOlusturmaVeKullanma;

public class C02_VariableOlusturma {

    public static void main(String[] args) {

        // Kullanicinin yasini tutacagim bir variable olusturmak istiyorum

        //int yas ; // java yas variable'ı icin hafizada yer ayirir ama deger henuz yoktur

        int yas = 34; // java variable'ı olusturur ve 34 degerini atama yapar

        // dogum gunu geldi ve yas 1 artacak

        // int yas = 35; // Variable 'yas' is already defined in the scope

        // Java ayni isimde iki farkli variable olusturmanıza izin vermez
        // DEKLARASYON sadece bir kere olur
        // deger ataması ise istediginiz kadar yapılabilir

        // Java sout icerisinde "" arasinda yazdigimiz her seyi konola da yazdirir

        System.out.println("Java Candir"); // Java Candir

        System.out.println("J a v a  C a n d i r"); // J a v a  C a n d i r

        System.out.println(         "Java Candir"           ); // Java Candir

        double boy = 176.4;

        System.out.println(      "boy"     ); // boy

        System.out.println( boy ); // 176.4

        System.out.println("Kullanicinin boyu : " + boy); // Kullanicinin boyu : 176.4




    }

}
