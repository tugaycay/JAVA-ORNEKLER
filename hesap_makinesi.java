import java.util.Scanner;
public class hesap_makinesi {
  public static void main(String[]args){
    System.out.println("HESAP_MAKİNESİ");
    Scanner input = new Scanner(System.in);
   int a , b , ıslem ;

    System.out.print("1.SAYIYI GİRİNİZ:");
    a= input.nextInt();

    System.out.print("2.SAYIYI GİRİNİZ:");
    b= input.nextInt();

    System.out.println("\n 1.TOPLAMA \n 2.ÇIKARMA \n 3.ÇARPMA \n 4.BÖLME");
    System.out.print("İŞLEM SEÇİNİZ:");
    ıslem= input.nextInt();

    switch (ıslem){
      case 1 :
        System.out.print("a+b=");
        System.out.print(a+b);
        break;
      case 2 :
        System.out.print("a-b=");
        System.out.print(a-b);
        break;
      case 3 :
        System.out.print("a*b=");
        System.out.print(a*b);
        break;
      case 4 :
        System.out.print("a/b=");
        System.out.print(a/b);
        break;
    }

  }
}