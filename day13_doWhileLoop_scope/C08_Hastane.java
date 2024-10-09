package day13_doWhileLoop_scope;

public class C08_Hastane {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";

    String perIsmi = "Isim atanmadi";
    String perAdresi = "Adres atanmadi";
    String perTelefon = "Telefon atanmadi";


    public static void main(String[] args) {

        C08_Hastane per1 = new C08_Hastane();

        System.out.println(per1.perIsmi); // Isim atanmadi
        System.out.println(per1.perAdresi); // Adres atanmadi
        System.out.println(per1.perTelefon); // Telefon atanmadi

        per1.perIsmi = "Hamza";
        per1.perTelefon = "5443454545";
        per1.perAdresi = "Balgat";


        System.out.println(per1.perIsmi); // Hamza
        System.out.println(per1.perAdresi); // 5443454545
        System.out.println(per1.perTelefon); // Balgat


        C08_Hastane per2 = new C08_Hastane();

        System.out.println(per2.perIsmi); // Isim atanmadi
        System.out.println(per2.perAdresi); // Adres atanmadi
        System.out.println(per2.perTelefon); // Telefon atanmadi

        per2.perIsmi = "Cansu";
        per2.perTelefon = "5343423221";
        per2.perAdresi = "Yenimahalle";

        System.out.println(per2.perIsmi); // Cansu
        System.out.println(per2.perAdresi); // 5343423221
        System.out.println(per2.perTelefon); // Yenimahalle

        System.out.println(per1.perAdresi); // Balgat


        C08_Hastane per3 = new C08_Hastane();

        System.out.println(per1.perIsmi); // Hamza
        System.out.println(per2.perIsmi); // Cansu
        System.out.println(per3.perIsmi); // Isim atanmadi

        // per2 nin adresini Cankaya yapin

        per2.perAdresi = "Cankaya";

        System.out.println(per1.perAdresi); // Balgat
        System.out.println(per2.perAdresi); // Cankaya
        System.out.println(per3.perAdresi); // Adres Atanmadi

    }

}
