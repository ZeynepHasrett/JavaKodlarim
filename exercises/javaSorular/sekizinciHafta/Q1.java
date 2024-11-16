package exercises.javaSorular.sekizinciHafta;

public class Q1 {

    public static void main(String[] args) {

        /*
            Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(Diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

            Örnek
            makeTitle("Bu bir başlıktır")
            Bu Bir Başlıktır

            makeTitle("tüm ilk harfler büyük olacak")
            Tüm İlk Harfler Büyük Olacak
         */

        makeTitle("Bu bir başlıktır");

        makeTitle("tüm ilk harfler büyük olacak");

        /*
            System.out.println("================2. yol==================");

            Arrays.stream(str).map(t -> t.substring(0, 1).toUpperCase() + t.substring(1)).forEach(t -> System.out.print(t + " "));
        */

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

        /* 3. yol
            public static void makeTitle(String[] str) {

                for (int i = 0; i < str.length; i++) {
                    String m1 = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
                    System.out.print(m1 + " ");

                }

            }
         */

    }

}
