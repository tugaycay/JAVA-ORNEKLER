import java.util.Scanner;
public class Taksımetre {
    public static void main(String[]args){
        System.out.println("Taksimetre Hesaplayan Program");
        Scanner input = new Scanner(System.in);
        double km;
        double acılıs=10 , yol=2.20 ;
        System.out.print("KAÇ KM GİDECEKSİNİZ:");
        km=input.nextDouble();

        double toplam = km * yol + acılıs;
        toplam= (toplam<20) ? 20 : toplam ;
        System.out.println("TAKSİMETRE ÜCRETİ:"+toplam);

    }
}
