import java.util.Scanner;
public class mat_sınavı_matris_kopya {
    public  static void main(String[]args){
        Scanner inp =new Scanner(System.in);
        int a1 , a2 , a3 , b1 , b2, b3, c1 , c2 , c3  ,s1 ,s2,s3;

        System.out.print("a1 GİRİNİZ:");
        a1= inp.nextInt();

        System.out.print("a2 GİRİNİZ:");
        a2= inp.nextInt();

        System.out.print("a3 GİRİNİZ:");
        a3= inp.nextInt();

        System.out.print("b1 GİRİNİZ:");
        b1= inp.nextInt();

        System.out.print("b2 GİRİNİZ:");
        b2= inp.nextInt();

        System.out.print("b3 GİRİNİZ:");
        b3= inp.nextInt();

        System.out.print("c1 GİRİNİZ:");
        c1= inp.nextInt();

        System.out.print("c2 GİRİNİZ:");
        c2= inp.nextInt();

        System.out.print("c3 GİRİNİZ:");
        c3= inp.nextInt();

        System.out.print("s1 GİRİNİZ:");
        s1= inp.nextInt();

        System.out.print("s2 GİRİNİZ:");
        s2= inp.nextInt();

        System.out.print("s3 GİRİNİZ:");
        s3= inp.nextInt();

        int deter= a1 * ((b2*c3)-(c2*b3)) + ((-1)*a2)*((b1*c3)-(c1*b3)) + a3*((b1*c2)-(c1*b2));
        System.out.println("DETERMİNAT :"+deter);

        int Pa =s1 * ((b2*c3)-(c2*b3)) + ((-1)* a2)*((s2*c3)-(s3*b3))+a3*((s2*c2)-(s3*b2));
        System.out.println("PA pay :"+Pa);
        System.out.println("PA :"+Pa/deter);

        int Pb=a1 *((s2*c3)-(s3*b3)) + ((-1)*s1)*((b1*c3)-(c1*b3))+ a3*((b1*s3)-(c1*s2));
        System.out.println("PB pay :"+Pb);
        System.out.println("PB :"+Pb/deter);


        int Pc=a1*((b2*s3)-(c2*s2))+((-1)*a2)*((b1*s3)-(c1*s2))+ s1 *((b1*c2)-(c1*b2));
        System.out.println("PC pay :"+Pc);
        System.out.print("PC :"+Pc/deter);








    }
}
