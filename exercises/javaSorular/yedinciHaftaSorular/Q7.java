package exercises.javaSorular.yedinciHaftaSorular;

public class Q7 {

    public static void main(String[] args) {

        /*
            Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

            Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
            s -> 5
            a -> 4
            e -> 3
            i -> 1
            o -> 0

            Test data
            hackerDili("javayı severim")
            j4v4yı 53v3r1m

            İpucu harfleri değiştirin ve ekrana yazdırın.
         */

        System.out.println(hackerDili("javayı severim"));

    }

    public static String hackerDili(String metin){

       metin = metin.replace("s", "5").
                     replace("a", "4").
                     replace("e", "3").
                     replace("i", "1").
                     replace("o", "0");

       return metin;

    }

}
