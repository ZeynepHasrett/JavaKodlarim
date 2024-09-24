package day06_nestedIfElseStatements_Ternary;

public class C02_AndOperatoru {

    public static void main(String[] args) {



        int a = 10;
        int b = 20;


        // && operatoru sonuc odaklidir
        System.out.println(a < b && a % 2 == 0 && b < 0 && b % 3 == 0 && b > a + 5); // false

        // & operatoru ıslem odaklidir
        System.out.println(a < b & a % 2 == 0 & b < 0 & b % 3 == 0 & b > a + 5); // false


        // EGER And ile birlestirilen islemlerde atama yapiliyorsa
        // && operatoru bazi islemleri yapmadigi icin atamalar yapilmamis olabilir

    }

}
