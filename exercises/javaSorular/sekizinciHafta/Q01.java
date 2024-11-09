package exercises.javaSorular.sekizinciHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {

        /*
            Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

            Örnek
            makeTitle("Bu bir başlıktır")
            Bu Bir Başlıktır

            makeTitle("tüm ilk harfler büyük olacak")
            Tüm İlk Harfler Büyük Olacak
         */

        makeTitle("Bu bir başlıktır");

        makeTitle("tüm ilk harfler büyük olacak");

    }

    public static void makeTitle(String str) {

        String[] arr = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String each : arr)

            if (!each.isEmpty()) {
                sb.append(Character.toUpperCase(each.charAt(0)));
                sb.append(each.substring(1));
                sb.append(" ");

                sb.append(each.replace(each.substring(0, 1), each.substring(0, 1).toUpperCase()));
                sb.append(" ");
            }

        System.out.println(sb);

    }

}
