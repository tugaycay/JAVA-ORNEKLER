import java.util.Scanner;
public class Vücut_Kitle_İndeksi {
    public static void main(String[]args){
        System.out.println("Vücut Kitle İndeksi Hesaplama:");
        double kg , m ;
            Scanner input =new Scanner(System.in);

            System.out.print("KİLONUZU GİRİNİZ:");
            kg = input.nextDouble();

            System.out.print("BOYUNUZU GİRİNİZ:");
            m= input.nextDouble();

            double toplam =  kg/ (m*m) ;
            System.out.print("VUCÜT KİTLE İNDEKSİNİZ:"+ toplam);



    }
}
