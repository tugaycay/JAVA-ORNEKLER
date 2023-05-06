import java.util.Scanner;
public class klavyeden_girilen {
    public static void main(String[]args){
        /* Java ile klavyeden girilen
         N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
          bu sayıları ekrana yazan programı yazın.*/

        Scanner input = new Scanner(System.in);
        int adet,sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("KAÇ ADET SAYI GİRCEKSİNİZ:");
        adet=input.nextInt();
        for(int a=1;a<=adet;a++){
            System.out.print(a+"'inci SAYI GİRİNİZ:");
            sayi=input.nextInt();
            if(sayi>max) max=sayi;
            else if(sayi<min) min=sayi;
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);




        }


    }

