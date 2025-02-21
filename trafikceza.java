import java.util.Scanner;

public class trafikceza {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int maxHiz=90;
System.out.println("hızınızı girin");
int hiz = scanner.nextInt();
int hizDerece=0;

if(hiz<=maxHiz){
    System.out.println("hızınız normal");
}
else if(hiz>maxHiz && hiz<=110){
     hizDerece = 1;
}
    else if(hiz>110 && hiz<=130){
        hizDerece = 2;
}
else if(hiz>130){
    hizDerece = 3;
}
switch(hizDerece){
    case 1:    System.out.println("hızınız 1.derece/1000tl ceza"); break;

    case 2:System.out.println("hızınız 2.derece/2000tl ceza"); break;

    case 3:System.out.println("ehliyetinize el konuldu"); break;

    default:System.out.println("hatalı seçim tekrar deneyin."); break;

}





  }
}
