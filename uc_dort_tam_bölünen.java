import java.util.Scanner;
public class uc_dort_tam_bölünen {
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int adet=0;
        System.out.print("SAYI GİRİNİZ:");
        sayi=x.nextInt();
        for(int a=0;a<=sayi;a++){
            if (a%3==0 && a%4==0){
                toplam+=a;
                adet++;
                System.out.println(a+" => 3 ve 4 ortak katı ");
            }
        }double ort =toplam/adet;

        System.out.print(ort+ " GİRİLEN SAYILARIN ORTALAMASI .");

    }

}
