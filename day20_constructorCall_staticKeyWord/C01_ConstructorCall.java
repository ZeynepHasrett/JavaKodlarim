package day20_constructorCall_staticKeyWord;

public class C01_ConstructorCall {

    C01_ConstructorCall() {
        System.out.println("Parametresiz constructor calisti");
    }


    C01_ConstructorCall(int sayi) {
        C01_ConstructorCall();
        System.out.println("int parametreli constructor calisti");
    }


    C01_ConstructorCall(String str) {
        // this(); constructor call her zaman ilk satirda olmalidir
        // iki farkli yerde birden olmaz
        this(5); // constructor call icin this(ilgili parametreler) kullanilir
        System.out.println("String parametreli constructor calisti");
    }


    public static void main(String[] args) {

        // C01_ConstructorCall obj1 = new C01_ConstructorCall();
        // Parametresiz constructor calisti


        // C01_ConstructorCall obj2 = new C01_ConstructorCall(4);
        // method calisti
        // int parametreli constructor calisti


        C01_ConstructorCall obj3 = new C01_ConstructorCall("Ali");
        // method calisti
        // int parametreli constructor calisti
        // String parametreli constructor calisti

    }

    public static void C01_ConstructorCall() {
        System.out.println("method calisti");
    }

}
