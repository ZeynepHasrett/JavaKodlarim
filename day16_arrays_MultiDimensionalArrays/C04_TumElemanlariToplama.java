package day16_arrays_MultiDimensionalArrays;

public class C04_TumElemanlariToplama {

    public static void main(String[] args) {

        int[] sayilar = {3, 6, 9, 1};

        // array'in tum elementlerinin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i];

        }

        System.out.println("sayilar array'indeki elementlerin toplami : " + toplam);


        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};
        // array'in tum elementlerinin toplamini yazdirin

        toplam = 0;

        for (int i = 0; i < arr.length; i++) { // outer array'deki inner array'leri kontrol eder

            for (int j = 0; j < arr[i].length; j++) { // her bir inner arra'deki elementleri kontrol eder

                toplam += arr[i][j];

            }

        }

        System.out.println("arr array'indeki elementlerin toplami : " + toplam);

        // EGER iki katli bir array'de tum elementleri gozden gecirmemiz gerekiyorsa
        // yukardaki iki katli loop'u standart olarak kullanabiliriz

    }

}
