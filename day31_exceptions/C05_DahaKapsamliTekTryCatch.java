package day31_exceptions;

public class C05_DahaKapsamliTekTryCatch {

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
            // 3.yontem : daha kapsamli tek try catch
            //            Bu yontem digerlerine gore daha kisaa
            //            Exception tum hatalari da kapsadigi icin
            //            bizim ongoremedigimiz exception'lar da olursa yakalar
            //            hata ayiklama acisindan yine 1.yontem tercih edilebilir

            // 4.yontem : nested try-catch
            // ama kod acisindan anlasilmasi daha zor olacagi icin tercih edilmez
            // kod okuma sorularinda orenek cozecegiz

            try {
                System.out.println(arr[index]);
                System.out.println(str.charAt(index));


            } catch (RuntimeException e) {
                System.out.println("Index sinirlarin disinda, arr son index : " + (arr.length - 1) + ", String son index : " + (str.length() - 1));
            }

        }

    }

}
