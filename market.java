import java.util.Scanner;

import static java.awt.Color.white;
import static java.awt.SystemColor.menu;

public class market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplamFiyat = 0;
        int urun1 = 10;
        int urun2 = 15;
        int urun3 = 20;
        boolean market = true;

        while (market) {
            System.out.println("urununuzu seçiniz ");
            System.out.println("1. Ürün  (10 TL)");
            System.out.println("2. Ürün  (15 TL)");
            System.out.println("3. Ürün  (20 TL)");
            System.out.println("0. alışverişi bitir");

            System.out.println("seçiminizi yapınız: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Seçtiğiniz ürünün fiyatı : " + urun1);
                    toplamFiyat += urun1;
                    System.out.println("Güncel Tutar : " + toplamFiyat);
                    break;

                case 2:
                    System.out.println("Seçtiğiniz ürünün fiyatı : " + urun2);
                    toplamFiyat += urun2;
                    System.out.println("Güncel Tutar : " + toplamFiyat);
                    break;

                case 3:
                    System.out.println("Seçtiğiniz ürünün fiyatı : " + toplamFiyat);
                    toplamFiyat += urun3;
                    System.out.println("Güncel Tutar : " + toplamFiyat);
                    break;

                case 0:
                    System.out.println("Alışverişinizi tamamladınız.");
                    System.out.println("Toplam Tutar : " + toplamFiyat);
                    market = false;
                    break;

                default:
                    System.out.println("geçersiz işlem");
                    break;

            }
            }
        if (!market) {
            System.out.println("kuponunuzu kullanmak için 'EVET'e tıklayınız");
            int kupon = scanner.nextInt();

            if (kupon == 'E') {
                toplamFiyat -= (double) (toplamFiyat*0.1);
                System.out.println("indirimli tutar : " + toplamFiyat);

            }
            else  {
                System.out.println("toplam tutar : " + toplamFiyat);

            }
        }

    }
    }

