import java.util.Scanner;
public class Ucgen_cevresi {
    public static void main(String[]args){
        System.out.println("Üçgenin Çevresini ve Alanını Hesaplayan Program ");
        Scanner input = new Scanner(System.in);
        int  a , b  , c  ;

        System.out.print("1.kenarı giriniz:");
        a= input.nextInt();

        System.out.print("2.kenarı giriniz:");
        b=input.nextInt();

        System.out.print("3.kenarı giriniz:");
        c=input.nextInt();

        int u = (a+b+c)/2 ;
        System.out.println("ÜÇGENİN ÇEVRESİ:"+ 2*u);


        System.out.print("ÜÇGENİN ALANI:"+ u * (u - a)* (u - b) * (u - c));


        }
    }

