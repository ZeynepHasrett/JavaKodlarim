package javaPractice.day04;

public class C01_ForLoop {

    public static void main(String[] args) {

        /*
            for loop döngüsel yapilmasi gereken islemlerde kullanilir
            baslangic ve bitis noktasi belirli ve ilerleme artis/azalisi sabit olan
            ritmik islemler serisinde kullanilir
            eger artis/azalis ritmik degilse yani sabit degilse while kullanilir
        */


        // 1 - 180 arasindaki 4 ile bolunebilen sayilari yazdiriniz


        for (int i = 1; i <= 180; i++) {
            if (i % 4 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }

        }
        System.out.println("");
        System.out.println("Tersten Geliyoruz...");

        for (int i = 180; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }

        }

    }

}
