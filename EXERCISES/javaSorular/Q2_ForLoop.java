package EXERCISES.javaSorular;

public class Q2_ForLoop {

    public static void main(String[] args) {

        // Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.

        String gun = "Pazartesi";

        for (int i = 0; i < gun.length(); i++) {
            System.out.println(gun.charAt(i));
        }

    }

}
