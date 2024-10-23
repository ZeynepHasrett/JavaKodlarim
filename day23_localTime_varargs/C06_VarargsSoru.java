package day23_localTime_varargs;

public class C06_VarargsSoru {

    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam degeri ile ilk sayinin carpimini yazdiran
        // bir method olusturun

        islemYap(1, 2, 3); // 5
        islemYap(2, 3, 4, 5, 6); // 36
        islemYap(0, 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5); // 0

        islemYap(3,4); // 12
        islemYap(5); // 0

        // varrgs'a hic eleman atamasak da
        // varargs bos bir array olur ve CTE olusmaz

        // islemYap(); // islemYap method'u ile parametreler uyumlu degil
        // varargs bos kalabilir ama a'ya deger atamak zorundayiz

    }

    public static void islemYap(int a, int... v) {

        int toplam = 0;

        for (int each : v) {
            toplam += each;
        }

        System.out.println("Islem sonucu : " + toplam * a);

    }

}
