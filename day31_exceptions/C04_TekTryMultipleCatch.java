package day31_exceptions;

public class C04_TekTryMultipleCatch {

    public static void main(String[] args) {

        String str = "Java candir";

        int[] arr = {1, 2, 3, 4, 5, 3, 4, 2, 3, 4, 5, 6, 7, 5, 4, 3, 4, 5, 7, 6, 5, 9};

        // Verilen negatif olmayan bir sayiyi index olarak kabul edip
        // yukaridaki str ve arr'deki o inde'de bulunan harfi ve sayiyi yazdirin
        // eger kullanici inde'ten buyuk sayi girerse
        // hata mesaji ve son indexi yazdirin

        int index = 26;

        if (index < 0) {
            System.out.println("index negatif olamaz");
        } else {
            // 2.yontem : tek try multiple catch
            // iki yontem de hatayi yakalar
            // asil amac kodun exception vermeden calismaya devam etmesi ise ikisi de olur
            // ama 1.yontem HATA AYIKLAMA icin daha elverislidir

            try {
                System.out.println(arr[index]);
                System.out.println(str.charAt(index));


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index Array'in sinirlari disinda, son index : " + (arr.length - 1));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Index String'in sinirlari disinda, son index : " + (str.length() - 1));
            }

        }

    }

}
