import java.util.Scanner;

public class ogrenciders {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       int notlar[]=new int[5];
       int toplam=0;

       for(int i=0;i<notlar.length;i++) {
           System.out.println((i + 1) + ". notları giriniz :");
           notlar[i] = scanner.nextInt();

           toplam+=notlar[i];
       }
int notOrt=toplam/5;
       if(notOrt>50) {
           System.out.println("geçtiniz");
       }
       else {
           System.out.println("kaldınız");

       }
for(int i=0;i<notlar.length;i++) {
    if(notlar[i]<30) {
        System.out.println("düşük notlarınız var");
    }
}
int notMax=notlar[1];
int notMin=notlar[2];
for(int i=0;i<notlar.length;i++) {
    if (notlar[i] > notMax) {
        notMax = notlar[i];
    }
    if (notlar[i] < notMin) {
        notMin = notlar[i];
    }
}
        System.out.println("en yüksek not"+notMax);
        System.out.println("en duşuk not"+notMin);

    }
}
