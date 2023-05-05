import java.util.Scanner;
public class Harmonik_Seri_Formul {
    public static void main(String[]args){
        int sayi;
        double result=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        sayi= input.nextInt();

        /*     for(double i=1;i<=sayi;i++){
             result+=1/i;
        }
        System.out.print("Girilen sayının harmonik değeri: " + result);   */

        for(int i=1;i<=sayi;i++){
             result+=1.0/i;
        }
        System.out.print("Girilen sayının harmonik değeri: " + result);
    }
}
