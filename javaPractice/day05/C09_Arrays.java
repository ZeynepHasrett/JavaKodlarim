package javaPractice.day05;

public class C09_Arrays {

    public static void main(String[] args) {

        /*
              Verilen bir int Array'de toplamlari istenen degere esit olan sayi ciftlerini
              yazdiran bir method yaziniz
              int[] arr = {5,7,-6,4,2,15,3,8,1};
              int istenenToplam = 9;
        */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};

        int istenenToplam = 9;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (istenenToplam == arr[i] + arr[j]) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + istenenToplam);
                    sayac++;
                }

            }

        }

    }

}
