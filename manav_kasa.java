import java.util.Scanner;
public class manav_kasa {
    public static void main(String[]args){
        System.out.println("Manav Kasa Programı");

        Scanner input=new Scanner(System.in);
        double armut , Elma , Domates , Muz , Patlıcan  ;


        System.out.print("Armut kg:");
        armut=input.nextDouble();

        System.out.print("Elma kg:");
        Elma=input.nextDouble();

        System.out.print("Domates kg:");
        Domates=input.nextDouble();

        System.out.print("Muz kg:");
        Muz=input.nextDouble();

        System.out.print("Patlıcan kg:");
        Patlıcan=input.nextDouble() ;


        double toplam = armut* 2.14  + Elma*3.67 + Domates*1.1 + Muz*0.95 + Patlıcan*5.0 ;
        System.out.print("Toplam fiyat:" +toplam);
    }

}
