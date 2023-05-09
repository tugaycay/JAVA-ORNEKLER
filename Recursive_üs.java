import  java.util.Scanner;
public class Recursive_üs {
    static int ıslem(int a, int b ){
       int result=1;
        for(int m=1;m<=b;m++){
            result*=a;
        }
        System.out.println("Sonuç :"+ result);
        return result;
    }
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);

        int a, b ;
        while (true){
            System.out.print("Taban değeri giriniz :");
            a = x.nextInt();
            System.out.print("Üs değerini giriniz :");
            b = x.nextInt();
            ıslem(a, b);
        }





    }
}
