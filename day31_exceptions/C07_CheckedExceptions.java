package day31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C07_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        int sayi1 = 10;
        int sayi2 = 0;

        System.out.println(sayi1 / sayi2); //   int / int

        /*
            Exceptions temel olarak 2'ye ayrilir:

            1- Run Time'da ortaya cikan exception'lar RunTimeExceptions, UnCheckedExceptions
                StringIndexOutOfBoundsException
                ArrayIndexOutOfBoundsException
                ArithmeticException

            2- Compile Time sirasinda farkedilenler          CheckedExceptions


            Biz bugune kadar alti kirmizi cizgili olan her seye CTE ya da Compile Time Error dedik
            AMA alti kirmizi olan her kod hata degildir

            Ozellikle dosya okuma ve yazma islemlerinde
            Java exception olasiligini compile time'da kontrol edip
            bize uyari verir

            Unhandled exception: java.io.FileNotFoundException

            Compile Time Exception'lar da Java bize 2 alternatif sunar

            1- Java ile try-catch yapabiliriz
               exception kontrol altina alinip e objesine kaydedilir
               ve kod normal calismaya devam eder

            2- Eger exception'u kontrol altina almak istemiyorsaniz
               (ornegin, dosyaya ulasamiyorsak kodun calismaya devam etmesinin bir anlami kalmiyorsa(
               amacimiz sadece kirmizi cizgiyi kaldirip
               class'i run edilebilir hale getirmek ise
               sorumlulugu aldigimizi Java'ya soylemeli
               ve bu class'i sonradan kullanacak insanlari uyarmaliyiz
               bunun icin method signature'ina "throws FileNotFoundException" ekleyebiliriz
         */

        String dosyaYolu = "day31_exceptions/notlar.txt";

        /*
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            // Unhandled exception: java.io.FileNotFoundException

        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya yolunda bir dosya mevcut degil");
        }
        */

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

    }

}
