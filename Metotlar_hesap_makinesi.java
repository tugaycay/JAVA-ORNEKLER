import java.util.Scanner;
public class Metotlar_hesap_makinesi {
    static int top(int a ,int b){
        int result=a+b;
        System.out.print(a+"+"+b+"="+result);
        return result;
    }
    static int çık(int a , int b){
        int result =a-b;
        System.out.print(a+"-"+b+"="+result);
        return  result;
    }
    static int çarp(int a ,int b){
        int result=a*b;
        System.out.print(a+"x"+b+"="+result);
        return result;
    }
    static int böl(int a ,int b){
        int result=a*b;
        System.out.print(a+"/"+b+"="+result);
        return result;
    }
    static int üs(int a ,int b){
        int result=1;
        for(int m=1;m<=b;m++){
            result*=a;
        }
        System.out.print(a+"/"+b+"="+result);
        return result;
    }
    static int fak(int a ){
        int result=1;
        for (int l=1;l<=a;l++){
            result*=l;
        }
        System.out.print(a+"!"+"="+result);
        return result;
    }
    static int mod(int a , int b){
        int result =a%b;
        return result;
    }
    static int dik(int a , int b){
        int result=1 ;
        System.out.println("Dikdörtgenin Çevresi ="+result*2*a*b);
        System.out.println("Dikdörtgenin Alanı ="+result*a*b);
        return result;
    }



    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,k;
        System.out.print("1.Sayıyı Giriniz: ");
        a=input.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        b=input.nextInt();

     System.out.println("1- Toplama İşlemi\n" +
             "2- Çıkarma İşlemi\n" +
             "3- Çarpma İşlemi\n" +
             "4- Bölme işlemi\n" +
             "5- Üslü Sayı Hesaplama\n" +
             "6- Faktoriyel Hesaplama\n" +
             "7- Mod Alma\n" +
             "8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.print("İŞLEM SEÇİİNİZ=");
        k= input.nextInt();
        switch (k){
            case 1:
                top(a,b);
                break;
            case 2:
                çık(a,b);
                break;
            case 3:
                çarp(a,b);
                break;
            case 4:
                böl(a,b);
                break;
            case 5:
                üs(a,b);
                break;
            case 6:
                fak(a);
                break;
            case 7:
                mod(a,b);
                break;
            case 8:
                dik(a,b);
                break;


        }



}
}
