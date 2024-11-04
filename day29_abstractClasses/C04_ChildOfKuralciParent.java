package day29_abstractClasses;

public class C04_ChildOfKuralciParent extends C03_KuralciParent {
    @Override
    public void method1() {
        System.out.println("C04 method1");
    }

    @Override
    public void method2() {
        System.out.println("C04 method2");
    }

    @Override
    public int method5() {
        System.out.println("C04 method5");
        return 0;
    }

    // C04 ya abstract olarak declare edilmeli
    //     ya da parent class sectigi C03'deki abstract methodlari
    //     kendisine implement etmelidir

}
