import java.util.Scanner;

public class restoran {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int toplamtutar = 0;
        int secim;
        System.out.println("siparişinizi giriniz:");
        System.out.println("1.  - 100 TL");
        System.out.println("2.  - 80 TL");
        System.out.println("3.  - 50 TL");
        System.out.println("4.  - 40 TL");
        System.out.println("5.  - 60 TL");
        System.out.println("0. siparişi bitir");

        do {

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println(" - 100 TL");
                    toplamtutar += 100;
                    break;
                case 2:
                    System.out.println(" - 20 TL");
                    toplamtutar += 20;
                    break;
                case 3:
                    System.out.println(" - 150 TL");
                    toplamtutar += 150;
                    break;
                case 4:
                    System.out.println(" - 40 TL");
                    toplamtutar += 40;
                    break;
                case 5:
                    System.out.println(" - 90 TL");
                    toplamtutar += 90;
                    break;
                case 0:
                    System.out.println("sipariş bitiriliyor");
                    break;
                default:
                    System.out.println("geçersiz işlem.");
            }
        } while (secim != 0);


        System.out.println("hesabınız :"+toplamtutar);
        scanner.close();
    }
}
