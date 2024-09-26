package day08_stringManipulation;

public class C10_isEmptyisBlank {

    public static void main(String[] args) {

        /*
            isEmpty: verilen string'in icinin bos olup olmadigini kontrol eder
                     hiclikleri bos derken space ile bosluk birakilirsa bos degil der

            isBlank: isEmpty'den farkli olarak sadece hiclik icin degil
                     space ile birakilan bosluklari da bos olarak kabul eder
          */

        String str1 = "Java cok guzel";

        String str2 = "";

        String str3 = "        ";


        System.out.println(str1.isEmpty()); // false
        System.out.println(str2.isEmpty()); // true
        System.out.println(str3.isEmpty()); // false

        System.out.println(str1.isBlank()); // false
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // true

    }

}
