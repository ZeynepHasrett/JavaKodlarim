package exercises.javaSorular.ucuncuHafta;

public class Q4 {

    public static void main(String[] args) {

        //        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        //        String str1 = %13.99
        //        String str2 = %10.55
        //        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.


        String str1 = "%13.99";
        String str2 = "%10.55";

        double fiyat1 = Double.parseDouble(str1.replace("%", ""));
        double fiyat2 = Double.parseDouble(str2.replace("%", ""));

        double toplam = fiyat1 + fiyat2;
        System.out.println("Toplam fiyat: $" + toplam);

    }

}
