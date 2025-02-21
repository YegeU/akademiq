import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int pinCode= 9871;
     System.out.println("Bankamıza Hosgeldiniz");
        System.out.println("Bakiyenizi giriniz");
        int bakiye=scanner.nextInt();


for (;;){
    System.out.println("Pin codunuzu giriniz");
    int correctPin= scanner.nextInt();

    if (pinCode==correctPin){
        System.out.println("pin codunuz doğru işleminizi seçiniz");

        System.out.println("1 para çekme");
        System.out.println("2 para yatırma");
        System.out.println("3 bakiye");
        System.out.println("4 çıkış");
        int menu= scanner.nextInt();
        switch (menu){

            case 1:
                System.out.println("çekmek istediğiniz miktarı giriniz");
                int  cekilenMiktar= scanner.nextInt();

                if (cekilenMiktar>bakiye){
                    System.out.println("hatalı işlem bakiyenizden fazla miktar çekemezsiniz");
                }
                else {

                    int  sonBakiye=bakiye-cekilenMiktar;
                    System.out.println("son bakiyeniz :"+sonBakiye);
                }

                break;
                case 2:
                    System.out.println("yatırmak  istediğiniz miktarı giriniz");
                   int yatirilanMiktar= scanner.nextInt();
                   bakiye+=yatirilanMiktar;
                    System.out.println("işleminiz gerçekleştirildi,bakiyeniz :"+bakiye);

                    break;
                    case 3:
                        System.out.println("anlık bakiyeniz :"+bakiye);

                        break;
                        case 4:
                            System.out.println("çıkış yaptınız");
                            System.exit(0);
                            break;

        }



    }
}




























    }
}