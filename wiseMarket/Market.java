package wiseMarket;

public class Market {

    public static void market() {

        System.out.println("**********Market Reyonuna Hoşgeldiniz**********");
        System.out.println("Lutfen Satın Almak İstediğiniz Ürün Kodunu Giriniz");
        System.out.println("----------Ürün Listesi----------");
        System.out.println("301- Dubai Çikolatası ₺350\n302- Peçete ₺25\n303- 5 lt su ₺35\n304- Nutella ₺180\n305- Tuvalet Kağıdı ₺189");

        while (!AnaMenu.ekUrun) {

            AnaMenu.urunKodu = AnaMenu.scanner.nextInt();

            if (AnaMenu.urunKodu >= 301 && AnaMenu.urunKodu <= 305) {

                System.out.println("Kaç kg Alacaksınız?");
                AnaMenu.urunAdedi = AnaMenu.scanner.nextInt();

                switch (AnaMenu.urunKodu) {
                    case 301:
                        AnaMenu.urunAdi = "Dubai Çikolatası";
                        AnaMenu.urunFiyati = 350;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 302:
                        AnaMenu.urunAdi = "Peçete";
                        AnaMenu.urunFiyati = 25;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 303:
                        AnaMenu.urunAdi = "5 lt su";
                        AnaMenu.urunFiyati = 35;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 304:
                        AnaMenu.urunAdi = "Nutella";
                        AnaMenu.urunFiyati = 180;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 305:
                        AnaMenu.urunAdi = "Tuvalet Kağıdı";
                        AnaMenu.urunFiyati = 189;
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




