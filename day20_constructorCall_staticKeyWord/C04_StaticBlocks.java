package day20_constructorCall_staticKeyWord;

public class C04_StaticBlocks {

    /*
        static bloklar class calismaya baslarken
        her seyden (hatta main method'dan bile) once calisirlar

        static block'larin yeri onemli degildir
        en altta da olsa once onlar calisir

        birden fazla static block varsa kendi iclerindeonce ustteki calisir
    */


    C04_StaticBlocks() {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        C04_StaticBlocks obj1 = new C04_StaticBlocks();
        C04_StaticBlocks obj2 = new C04_StaticBlocks();
    }

    public static void method1() {
        System.out.println("method calisti");
    }

    static {
        // class calismaya baslamadan once ihtiyac duyulan ayarlamalar icin kullanilir
        System.out.println("static block1 calisti");
    }

    static {
        System.out.println("static block2 calisti");
    }

    {
        // obje olusturulmadan once yapilacak ayarlamalar icin kullanilir
        // her constructor calistirilmasindan once static olmayan blok calisir
        System.out.println("static olmayan kod blogu calisti");
    }

}
