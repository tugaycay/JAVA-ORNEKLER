import java.util.Scanner;
public class SAYILARI_SIRALAMA {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
     int a, b,c;

        System.out.print("1.Sayi giriniz.");
        a=inp.nextInt();
        System.out.print("2.Sayi giriniz.");
        b=inp.nextInt();
        System.out.print("3.Sayi giriniz.");
        c=inp.nextInt();

        if (a>b && a>c){
            if(b>c){
                System.out.print(a+">"+b + ">"+c);}
            else if (c>b) {
                System.out.print("a>c>b");
            }
        }
        if (b>a && b>c){
            if (a>c){
                System.out.print("b>a>c");}
            }
            else if (c>a){
            System.out.print("b>c>a");}

        if (c>a && c>b){
            if (a>b){
                System.out.print("c>a>b");}
        }
        else if (b>a){
            System.out.print("c>b>a");}



        }





}
