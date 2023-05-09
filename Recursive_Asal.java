import java.util.Scanner;
public class Recursive_Asal {
    static int as(int a){
        if(a%10==1 || a%10==3 || a%10==5 || a%10==7  || a==3 || a==5 || a==7 || a==2 ){
            System.out.println(a +" sayısı ASALDIR !");
        }else {
            System.out.println(a +" sayısı ASAL değildir !");
        }
        return a;
    }
    public static void main(String[]args){
    Scanner x=new Scanner(System.in);
    int a;
    while (true) {
        System.out.print("Sayı Giriniz :");
        a = x.nextInt();
        as(a);
    }
    }
}
