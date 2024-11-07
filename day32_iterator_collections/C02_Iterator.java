package day32_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        /*
            Java index kullaniminin mumkun olmadigi durumlarda
            ya da index kullanmak istemedigimiz durumlarda
            tum elemanlara ulasabilecegimiz ve kalici degisiklik yapabilecegimiz
            Iterator isimli bir interface olusturmustur
         */

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,2,3,36,48,9));

        //index kullanmadan list içindeki çift sayıları silelim

        // 1  2  3  25  36   48   12   23   9

        Iterator iterator= sayilar.iterator();
        System.out.println(iterator.hasNext()); // true

        int sayi=(Integer) iterator.next();
        System.out.println(sayi);

        if(sayi%2==0){

            iterator.remove();
        }
        System.out.println(sayilar);

        sayi=(Integer)iterator.next();
        if(sayi%2==0){
            iterator.remove();
        }
        System.out.println(sayilar);

        sayi=(Integer)iterator.next();
        if(sayi%2==0){
            iterator.remove();
        }
        System.out.println(sayilar);
        sayi=(Integer)iterator.next();
        if(sayi%2==0){
            iterator.remove();
        }
        System.out.println(sayilar);
        sayi=(Integer)iterator.next();
        if(sayi%2==0){
            iterator.remove();
        }
        System.out.println(sayilar);

        sayi=(Integer)iterator.next();
        if(sayi%2==0){
            iterator.remove();
        }
        System.out.println(sayilar);

        System.out.println(iterator.hasNext());

    }

}
