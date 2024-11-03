package exercises.javaSorular.yedinciHaftaSorular;

public class Q10 {

    public static void main(String[] args) {

        /*
            Girilen sayının ingilizce yazılışını return eden bir method yazınız.

            Örnek
            numToEng(0)
            zero

            numToEng(18)
            eighteen

            numToEng(126)
            one hundred twenty six

            numToEng(909)
            nine hundred nine
         */

        System.out.println(numToEng(0));
        System.out.println(numToEng(18));
        System.out.println(numToEng(126));
        System.out.println(numToEng(909));

    }

    public static String numToEng(int sayi) {

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = sayi / 100;

        String metin = "";

        switch (sayi) {
            case 10:
                metin = "ten";
                break;
            case 11:
                metin = "eleven";
                break;
            case 12:
                metin = "twelve";
                break;
            case 13:
                metin = "thirteen";
                break;
            case 14:
                metin = "fourteen";
                break;
            case 15:
                metin = "fifteen";
                break;
            case 16:
                metin += "sixteen";
                break;
            case 17:
                metin += "seventeen";
                break;
            case 18:
                metin = "eighteen";
                break;
            case 19:
                metin += "nineteen";
                break;
            case 20:
                metin += "twenty";
        }

        switch (yuzlerBasamagi) {

            case 1:
                metin += "one hundred ";
                break;
            case 2:
                metin += "two hundred ";
                break;
            case 3:
                metin += "three hundred ";
                break;
            case 4:
                metin += "four hundred ";
                break;
            case 5:
                metin += "five hundred ";
                break;
            case 6:
                metin += "six hundred ";
                break;
            case 7:
                metin += "seven hundred ";
                break;
            case 8:
                metin += "eight hundred ";
                break;
            case 9:
                metin += "nine hundred ";
                break;
        }

        switch (onlarBasamagi) {
            case 2:
                metin += "twenty ";
                break;
            case 3:
                metin += "thirty ";
                break;
            case 4:
                metin += "forty ";
                break;
            case 5:
                metin += "fifty ";
                break;
            case 6:
                metin += "sixty ";
                break;
            case 7:
                metin += "seventy ";
                break;
            case 8:
                metin += "eighty ";
                break;
            case 9:
                metin += "ninety ";
                break;
        }

        switch (birlerBasamagi) {
            case 0:
                metin += "zero";
                break;
            case 1:
                metin += "one";
                break;
            case 2:
                metin += "two";
                break;
            case 3:
                metin += "three";
                break;
            case 4:
                metin += "four";
                break;
            case 5:
                metin += "five";
                break;
            case 6:
                metin += "six";
                break;
            case 7:
                metin += "seven";
                break;
            case 8:
                metin += "eight";
                break;
            case 9:
                metin += "nine";
                break;
        }

        return metin;

    }

}





