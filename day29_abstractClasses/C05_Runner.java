package day29_abstractClasses;

import day23_localTime_varargs.C05_Varargs;
import day28_overriding_polymorphism.C02_Kuslar;

public class C05_Runner {

    public static void main(String[] args) {

        C02_Kuslar kus1 = new C02_Kuslar();
        kus1.cogalma(); // yumurtayla cogalirlar

        C05_Varargs obj = new C05_Varargs();

        C01_KuralciOlmayanParent kop1 = new C01_KuralciOlmayanParent();
        kop1.method1();
        System.out.println(kop1.s);

        /*
            Abstract class2lar class olduklari icin
            Constructor'a sahiptirler
            ANCAK abstract class'lar abstract method'lar barindirdigi icin
            Java abstract class'lardan obje olusturulmasina izin vermez

            Cunku bu obje olusturulursa
            obje ile asagidaki gibi abstract method'lar cagirilabilir
            AMA abstract method'larin body'si olmadigindan calisamazlar
         */

        // C03_KuralciParent kp1 = new C03_KuralciParent();
        // C03 Abstract bir class'dir ve bu class'dan obje olusturulamaz
        // kp1.method1();


        C03_KuralciParent kp1 = new C04_ChildOfKuralciParent();
        kp1.method1(); // C04 method1
        kp1.method2(); // C04 method2
        kp1.method5(); // C04 method5

        kp1.method3(); // Parent method3
        kp1.method4(); // Parent method4

    }

    // public abstract void abstractMethod();
    // concrete bir class'da abstract method olmaz

}
