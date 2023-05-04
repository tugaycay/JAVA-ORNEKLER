import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int n,r;
        int total1=1;
        int total2=1;
        int total3=1;
        System.out.print("N GİRİNİZ:");
        n= inp.nextInt();
        System.out.print("R GİRİNİZ:");
        r= inp.nextInt();

       /* int sayi;
        int total=1;

        System.out.print("SAYİ GİRİNİZ:");
        sayi=inp.nextInt();

        for(int a=1; a<=sayi;a++){
            total=a*total;
        }
        System.out.print(sayi +".faktöriyel " +  total + "   dir."); */

        for(int a=1 ; a<=n ; a++){
            total1=a*total1;
        }
        for(int a=1 ; a<=r ; a++){
            total2=a*total2;
        }

        for(int a=1 ; a<=n-r ; a++){
            total3=a*total3;
        }

        double ort = total1/(total2*total3);
        System.out.print("KOMBİNASYONUN CEVABI   "+ ort);






    }
}
