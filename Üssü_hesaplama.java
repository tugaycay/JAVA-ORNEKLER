import java.util.Scanner;
public class Üssü_hesaplama {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        /*
        int a , b;
        System.out.print("ÜSSÜ ALINCAK SAYI:");
        a= inp.nextInt();
        System.out.print("ÜSSÜ:");
        b= inp.nextInt();
        int i=1;
        int total=1;
        while(i<=b){
            i++;
            total*=a;
        }
        System.out.print(total);*/
        int total=1;
        int a,b ;
        System.out.print("ÜSSÜ ALINCAK SAYI:");
        a= inp.nextInt();
        System.out.print("ÜSSÜ:");
        b= inp.nextInt();

        for(int i=1 ; i<=b;i++){
            total*=a;
        }
        System.out.print(total);
    }
}
