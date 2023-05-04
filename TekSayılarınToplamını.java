import java.util.Scanner;
public class TekSayılarınToplamını {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int sayi;
        int sum =0;
        System.out.print("SAYİ GİRİNİZ:");
        sayi = inp.nextInt();

        do{
            System.out.print("SAYİ GİRİNİZ:");
            sayi = inp.nextInt();
            if(sayi%2==1){
                sum+=sayi;
            }

        }while (sayi>0);

        System.out.print(sum);
    }
}