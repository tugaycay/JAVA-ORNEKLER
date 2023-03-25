import java.util.Scanner;

 /*
    Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak...
     */


public class Hipotenüs_hesaplama {
    public static void main(String[] args) {
        System.out.println("Not Ortalaması Hesaplayan Program");
        Scanner input = new Scanner(System.in);
        //Değişkenler
        int Mat, Fiz, Kim, Turk, Tar, Muz;

        System.out.print("MATEMATİK NOTUNUZ ;");
        Mat=input.nextInt();

        System.out.print("TÜRKÇE NOTUNUZ ;");
        Turk=input.nextInt();

        System.out.print("FİZİK NOTUNUZ ;");
        Fiz=input.nextInt();

        System.out.print("KİMYA NOTUNUZ ;");
        Kim=input.nextInt();

        System.out.print("TARİH NOTUNUZ ;");
        Tar=input.nextInt();

        System.out.print("MÜZİK NOTUNUZ ;");
        Muz=input.nextInt();

        double toplam = Mat + Turk + Fiz + Kim+ Tar+ Muz ;
        double sonuc= toplam/6 ;
        System.out.println("GENEL NOT ORTALMMANIZ:"+ sonuc);

        System.out.print(sonuc < 60 ? "Sınıfta Kaldınız " : "Tebrikler Sınıfı Geçtiniz");

    }
}
