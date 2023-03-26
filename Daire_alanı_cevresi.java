import java.util.Scanner;
public class Daire_alanı_cevresi {
    public static void main(String[]args){
        System.out.println("Dairenin Alanını ve Çevresini Hesaplayan Program");
        Scanner input =new Scanner(System.in);
        double r , pi=3.14 , alfa ;

        System.out.print("Yarı Çapı Giriniz:");
        r=input.nextDouble();

        double toplam =  pi * r * r ;
        System.out.println("DAİRE Alanı:"+toplam);

        double toplam1 = 2* pi * r ;
        System.out.println("DAİRE Çevresi:"+toplam1);


        /* Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.*/

        System.out.print("Merkez Açısı a Giriniz:");
        alfa=input.nextDouble();

        double toplam2 = (pi * r * r * alfa) / 360 ;
        System.out.print("Daire Dilim Alanı :"+toplam2);



    }
}
