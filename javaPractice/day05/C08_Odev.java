package javaPractice.day05;

import java.sql.Array;
import java.util.Arrays;

public class C08_Odev {

    public static void main(String[] args) {

        /*
              $ ve £ isareti olanlarin toplamlarini ayri ayri bulun

              String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String[] arr = str.split(" ");

        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("$")) {
                arr[i] = arr[i].replace("$", "");
                toplam1 += Integer.parseInt(arr[i]);
            }

            if (arr[i].contains("£")) {
                arr[i] = arr[i].replace("£", "");
                toplam2 += Integer.parseInt(arr[i]);
            }

        }

        System.out.println("$ isareti olanlarin toplami : " + toplam1);
        System.out.println("£ isareti olanlarin toplami : " + toplam2);

    }

}
