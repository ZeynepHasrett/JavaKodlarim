package day24_stringBuilder_AccessModifier;

public class C02_StringBuilder_Methods {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Nice have a day");

        // sb1' de yer alan degeri tersten yazdiriyoruz
        sb1.reverse();
        System.out.println(sb1); // yad a evah eciN

        // sb1 tersten yazilarak atandigi icin eski haline donmek istersek
        // tekrar reverse() kullanilmalidir
        sb1.reverse();
        System.out.println(sb1); // Nice have a day


        // isim ayni olsa bile String ve StringBuilder' da uygulama farkli olabilir
        String str = "Wise";

        // replace() index alarak istenilen araliktaki metni silip
        // yerine istenilen bir metni koyar
        // ilk index dahil, 2. index harictir
        sb1.replace(0, 4, str);
        System.out.println(sb1); // Wise have a day


        // delete() iki index girilerek iki index arasindaki veriyi siler
        // ilk index dahil, 2. index harictir
        sb1.delete(0, 12);
        System.out.println(sb1); // day


        // deleteCharAt) herhangi bir index'teki veriyi silmek amaciyla kullanilir
        sb1.deleteCharAt(sb1.length() - 1);
        System.out.println(sb1); // da


        // insert() herhangi bir index'e verilen String'i eklemek icin kullanilir
        sb1.insert(sb1.length(), "y");
        System.out.println(sb1); // day


        // insert() verilen index'ten itibaren ilgili str degeri variable'a ekler
        sb1.insert(0, "Wise have a ");
        System.out.println(sb1); // Wise have a day

    }

}
