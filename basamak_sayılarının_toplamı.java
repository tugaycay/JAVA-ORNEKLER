import java.util.Scanner;
public class basamak_sayılarının_toplamı {
    public static void main(String[]args){
        int sayi,p,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();
        while (sayi!=0){
            p=sayi%10;
            sayi=sayi/10;
            toplam=toplam+p;
        }
        System.out.println("Sayının rakamları toplamı:"+toplam);
    }
}