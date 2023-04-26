import java.util.Scanner;
public class sınıf_geçme {
    public static void main(String[]args){
        System.out.println("Sınıf Geçme Durumu Hesaplama");
        Scanner input=new Scanner(System.in);
        int Matematik, Fizik, Türkçe, Kimya, Müzik;

        System.out.print("Matematik Notunu Giriniz:");
        Matematik= input.nextInt();
        int mat = (Matematik > 100 || Matematik < 0) ? 0 : Matematik;

        System.out.print("Fizik Notunu Giriniz:");
        Fizik= input.nextInt();
        int fiz = (Fizik > 100 || Fizik < 0) ? 0 : Fizik;

        System.out.print("Türkçe Notunu Giriniz:");
        Türkçe= input.nextInt();
        int tur = (Türkçe > 100 || Türkçe < 0) ? 0 : Türkçe;

        System.out.print("Kimya Notunu Giriniz:");
        Kimya=input.nextInt();
        int kim = (Kimya > 100 || Kimya < 0) ? 0 : Kimya;

        System.out.print("Müzik Notunu Giriniz:");
        Müzik=input.nextInt();
        int muz = (Müzik > 100 || Müzik < 0) ? 0 : Müzik;

        double ortalama = (Matematik+Fizik+Türkçe+Kimya+Müzik)/5;
        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz.");
        }
        else {
            System.out.println("Sınıfta Kaldınız.");
        }


    }
}
