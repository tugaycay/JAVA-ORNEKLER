import java.util.Scanner;
public class uçak_bileti_hesaplama {
    public static void main(String[]args){
        int mesafe,yas,ıslem;
        Scanner input=new Scanner(System.in);


        System.out.print("MESAFE GİRİNİZ=");
        mesafe=input.nextInt();

        System.out.print("YAŞINIZI GİRİNİZ=");
        yas=input.nextInt();
        double tutar = mesafe * 0.10 ;
        double yas1 = tutar /2;
        double yas2= tutar/10;
        double yas3=tutar*0.3;

        System.out.println("YOLCUK TİPİNİ GİRİNİZ \n 1.TEK YÖN \n 2.GİDİŞ DÖNÜŞ");
        System.out.print("İŞLEM SEÇİNİZ:");
        ıslem= input.nextInt();



        switch (ıslem){
            case 1:
                if (yas<12){
                    System.out.println(yas1+" tl yaş İNDİRİM KAZANDINIZ.");
                    System.out.print(tutar-yas1 +" tl bilet fiyatı.");
                }
                else if (12<=yas || yas<=24) {
                    System.out.println(yas2+" tl yaş İNDİRİM KAZANDINIZ.");
                    System.out.print(tutar-yas2 +" tl bilet fiyatı.");

                }
                else if (65<yas) {
                    System.out.println(yas3+" tl yaş İNDİRİM KAZANDINIZ.");
                    System.out.print(tutar-yas3 +" tl bilet fiyatı.");
                }
                break;
            case 2:
                if (yas<12){
                    System.out.println(yas1+" tl  yaş İNDİRİM KAZANDINIZ.");
                    System.out.println((tutar-yas1)*0.2+" tl  gidiş/dönüş İNDİRİM KAZANDINIZ.");
                    System.out.print(((tutar-yas1)-((tutar-yas1)*0.2))*2 +" tl bilet fiyatı.");

                }
                else if (12<=yas || yas<=24) {
                    System.out.println(yas2+" tl yaş  İNDİRİM KAZANDINIZ.");
                    System.out.println((tutar-yas2)*0.2+" tl  gidiş/dönüş İNDİRİM KAZANDINIZ.");
                    System.out.print(((tutar-yas2)-((tutar-yas2)*0.2))*2 +" tl bilet fiyatı.");

                }
                else if (65<yas) {
                    System.out.println(yas3+" tl yaş  İNDİRİM KAZANDINIZ.");
                    System.out.println((tutar-yas3)*0.2+" tl  gidiş/dönüş İNDİRİM KAZANDINIZ.");
                    System.out.print( ((tutar-yas3)-((tutar-yas3)*0.2))*2 +" tl bilet fiyatı.");
                }

                break;
        }




    }
}
