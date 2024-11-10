package wiseMarket;

public class Sarkuteri {

    public static void sarkuteri() {

        System.out.println("**********Şarküteri Reyonuna Hoşgeldiniz**********");
        System.out.println("Lutfen Satı01n Almak İstediğiniz Ürün Kodunu Giriniz");
        System.out.println("----------Ürün Listesi----------");
        System.out.println("101- Peynir ₺200\n102- Kaymak ₺150\n103- Sucuk ₺300\n104- Pastırma ₺250\n105- Kavurma ₺275");

        while (!AnaMenu.ekUrun) {

            AnaMenu.urunKodu = AnaMenu.scanner.nextInt();

            if (AnaMenu.urunKodu >= 101 && AnaMenu.urunKodu <= 105) {

                System.out.println("Kaç Paket Alacaksınız?");
                AnaMenu.urunAdedi = AnaMenu.scanner.nextInt();

                switch (AnaMenu.urunKodu) {
                    case 101:
                        AnaMenu.urunAdi = "Peynir";
                        AnaMenu.urunFiyati = 200;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 102:
                        AnaMenu.urunAdi = "Kaymak";
                        AnaMenu.urunFiyati = 150;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 103:
                        AnaMenu.urunAdi = "Sucuk";
                        AnaMenu.urunFiyati = 300;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 104:
                        AnaMenu.urunAdi = "Pastırma";
                        AnaMenu.urunFiyati = 250;
                        System.out.println(AnaMenu.urunAdedi + " paket " + AnaMenu.urunAdi + " fiyatı ₺" + (AnaMenu.urunFiyati * AnaMenu.urunAdedi));
                        break;
                    case 105:
                        AnaMenu.urunAdi = "Kavurma";
                        AnaMenu.urunFiyati = 275;
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
