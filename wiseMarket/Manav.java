package wiseMarket;

public class Manav {

    public static void manav() {

        System.out.println("**********Manav Reyonuna Hoşgeldiniz**********");
        System.out.println("Lutfen Satın Almak İstediğiniz Ürün Kodunu Giriniz");
        System.out.println("----------Ürün Listesi----------");
        System.out.println("201- Yerli Muz ₺59\n202- Portakal ₺49\n203- Elma ₺49\n204- Patates ₺35\n205- Soğan ₺25");

        while (!AnaMenu.ekUrun) {

            AnaMenu.urunKodu = AnaMenu.scanner.nextInt();

            if (AnaMenu.urunKodu >= 201 && AnaMenu.urunKodu <= 205) {

                System.out.println("Kaç kg Alacaksınız?");
                AnaMenu.urunAdedi = AnaMenu.scanner.nextInt();

                switch (AnaMenu.urunKodu) {
                    case 201:
                        AnaMenu.urunAdi = "Yerli Muz";
                        AnaMenu.urunFiyati = 59;
                        System.out.println(AnaMenu.urunAdedi + " kg " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 202:
                        AnaMenu.urunAdi = "Portakal";
                        AnaMenu.urunFiyati = 49;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 203:
                        AnaMenu.urunAdi = "Elma";
                        AnaMenu.urunFiyati = 49;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 204:
                        AnaMenu.urunAdi = "Patates";
                        AnaMenu.urunFiyati = 35;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 205:
                        AnaMenu.urunAdi = "Soğan";
                        AnaMenu.urunFiyati = 25;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                }

                AnaMenu.urunFiyati = AnaMenu.urunFiyati * AnaMenu.urunAdedi;
                AnaMenu.toplam += AnaMenu.urunFiyati;
                System.out.println("Oluşan Toplam Tutar: ₺" + AnaMenu.urunFiyati);
                AnaMenu.sepet += AnaMenu.urunAdi + " : " + AnaMenu.urunFiyati;
                System.out.println("Başka Bir Ürün Almak İçin Ürün Kodunu Giriniz\nAna Menüye Gitmek İçin 0 Tuşuna Basınız");

            } else if (AnaMenu.urunKodu == 0) {
                GirisEkrani.girisEkrani();
            }

            AnaMenu.ekUrun = false;

        }

    }

}
