package javaPractice.day03;

public class C04_StringManipulation {

    public static void main(String[] args) {

        /*
           String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
           String  str 1= %13.99
           String str 2= %10.55
        */


        String str1 = "%13.99";
        String str2 = "%10.55";

        double indirim1 = Double.parseDouble(str1.substring(1));

        double indirim2 = Double.parseDouble(str2.substring(1));

        double toplam = indirim1 + indirim2;

        System.out.println("Toplam Indirim= " + toplam);

    }

}
