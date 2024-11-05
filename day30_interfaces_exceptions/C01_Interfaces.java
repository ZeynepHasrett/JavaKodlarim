package day30_interfaces_exceptions;

import java.util.ArrayList;
import java.util.List;

public class C01_Interfaces {

    static String str = "Ali";


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        /*
            Data turu sectigimiz List Interface'dir
            Interface'ler full abstract'dir ve Constructor'lari yoktur
            Child class'larin mutlaka barindirmasi gereken method'lari belirler

            int size();
            boolean isEmpty();
            boolean contains(Object o);

            Biz List interface'inden obje olusturabilmek icin
            constructor olarak List'in child class'i olan ArrayList'i sectik
            ve o class'da
                            public int size() { return size; }
                            public boolean isEmpty(){ return size == 0; }
                            public boolean contains(Object o) {return indexOf(o) >= 0; }

            yukaridaki abstract method'lar concrete olarak vardir
         */

    }

    public void method1() {
        System.out.println("C01 method1");
    }

    public void method2() {
        System.out.println("C01 method2");
    }

}



