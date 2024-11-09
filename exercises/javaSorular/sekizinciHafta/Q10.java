package exercises.javaSorular.sekizinciHafta;

public class Q10 {

    public static void main(String[] args) {

        /*
            Youtube video sayfasının urlsinde yer alan video id'sini
            return eden bir method yazınız :

             ÖRNEKLER
            youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
            ID : XPEr1cArWRg

            youtubeId("https://youtu.be/BCDEDi5gDPo")
            ID : BCDEDi5gDPo

            youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
            ID : vxP3bY-XxY4
         */

        youTubeId("https://www.youtube.com/watch?v=XPEr1cArWRg");
        youTubeId("https://youtu.be/BCDEDi5gDPo");
        youTubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4");

    }

    public static String youTubeId(String url) {

        url = url.substring(url.length() - 11);

        System.out.println("ID : " + url);

        return url;

    }

}
