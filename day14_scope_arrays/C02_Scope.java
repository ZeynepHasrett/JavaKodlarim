package day14_scope_arrays;

public class C02_Scope {

    public static void main(String[] args) {

        /*
            Static variable'larin en buyuk avantaji erisim kolayligidir
            - Class icerisinden her yerden direkt ulasilabilir
            - Baska class'lardan da ClassIsmı.static variable ismi seklinde kolayca ulasilir

            static variable'larin en buyuk dezavantaji ulasan herkesin degistirebilmesidir
         */

        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(C01_Hastane.hastaneAdresi); // Yenimahalle
        System.out.println(C01_Hastane.bashekim); // Dr Ali

        C01_Hastane.bashekim = "Dr Oguzhan";

        System.out.println(C01_Hastane.bashekim); // Dr Oguzhan

    }

}
