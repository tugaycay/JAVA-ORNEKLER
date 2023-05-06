import java.util.Scanner;
public class ebob_ekok_while {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n1,n2;
        int ebob=1;
        int k=1;
        System.out.print("1.SAYI GİRİNİZ:");
        n1= input.nextInt();
        System.out.print("2.SAYI GİRİNİZ:");
        n2= input.nextInt();

        if(n1<n2){
        while (k<=n1){
            k++;
            if(n1%k==0 && n2%k==0){
                ebob=k;
            }
        }
        System.out.println("ebob= "+ebob);
        System.out.print("ekok= "+ n1*n2/ebob);}
        if(n2<n1){
            while (k<=n2){
                k++;
                if(n1%k==0 && n2%k==0){
                    ebob=k;
                }
            }
            System.out.println("ebob= "+ebob);
            System.out.print("ekok= "+ n1*n2/ebob);}

        }





    }

