import java.util.Scanner;
public class tek_bir_say_girilene_kadar {
    public static void main(String[]args){
        Scanner tgy = new Scanner(System.in);
        int sayi;
        int sum=0;

        do {
             System.out.print("SAYI GİRİNİZ:");
                 sayi = tgy.nextInt();
                 if(sayi%2==0 && sayi%4==0){
                sum=sayi+sum;
                                  }

        }while (sayi%2==0);

            System.out.print(sum);
    }
}
