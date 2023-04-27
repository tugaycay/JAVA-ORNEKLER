import java.util.Scanner;
public class BURÇ_Bulma {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
                int ay,gün;

                System.out.print("KAÇINCI AYDA DOĞDUNUZ:");
                ay=input.nextInt();
                System.out.print("HANGİ GÜN DOĞDUNUZ:");
                gün=input.nextInt();



         if(ay==1){
             if(1<=gün && gün<=21 ){
                System.out.print(gün+ " OCAK " + " OĞLAK BURCU ");
             }
             else if (21<gün) {
                 System.out.print(gün+ " OCAK " + " KOVA BURCU ");
             }
         }
        if(ay==2){
            if(1<=gün && gün<=19 ){
                System.out.print(gün+ " ŞUBAT " + " KOVA BURCU ");
            }
            else if (19<gün) {
                System.out.print(gün+ " ŞUBAT " + " BALIK BURCU ");
            }
        }
        if(ay==3){
            if(1<=gün && gün<=20 ){
                System.out.print(gün+ " MART " + " BALIK BURCU ");
            }
            else if (20<gün) {
                System.out.print(gün+ " MART " + " KOÇ BURCU ");
            }
        }
        if(ay==4){
            if(1<=gün && gün<=20 ){
                System.out.print(gün+ " NİSAN " + " KOÇ BURCU ");
            }
            else if (20<gün) {
                System.out.print(gün+ " NİSAN " + " BOĞA BURCU ");
            }
        }
        if(ay==5){
            if(1<=gün && gün<=21 ){
                System.out.print(gün+ " MAYIS " + " BOĞA BURCU ");
            }
            else if (21<gün) {
                System.out.print(gün+ " MAYIS " + " İKİZLER BURCU ");
            }
        }

        if(ay==6){
            if(1<=gün && gün<=22 ){
                System.out.print(gün+ " HAZİRAN " + " İKİZLER BURCU ");
            }
            else if (22<gün) {
                System.out.print(gün+ " HAZİRAN " + " YENGEÇ BURCU ");
            }
        }

        if(ay==7){
            if(1<=gün && gün<=22 ){
                System.out.print(gün+ " TEMMUZ " + " YENGEÇ BURCU ");
            }
            else if (22<gün) {
                System.out.print(gün+ " TEMMUZ " + " ASLAN BURCU ");
            }
        }
        if(ay==8){
            if(1<=gün && gün<=22 ){
                System.out.print(gün+ " AĞUSTOS " + " ASLAN BURCU ");
            }
            else if (22<gün) {
                System.out.print(gün+ " AĞUSTOS " + " BAŞAK BURCU ");
            }
        }
        if(ay==9){
            if(1<=gün && gün<=22 ){
                System.out.print(gün+ " EYLÜL " + " BAŞAK BURCU ");
            }
            else if (22<gün) {
                System.out.print(gün+ " EYLÜL " + " TERAZİ BURCU ");
            }
        }
        if(ay==10){
            if(1<=gün && gün<=22 ){
                System.out.print(gün+ " EKİM " + " TERAZİ BURCU ");
            }
            else if (22<gün) {
                System.out.print(gün+ " EKİM " + " AKREP BURCU ");
            }
        }
        if(ay==11){
            if(1<=gün && gün<=21 ){
                System.out.print(gün+ " KASIM " + " AKREP BURCU ");
            }
            else if (21<gün) {
                System.out.print(gün+ " KASIM " + " YAY BURCU ");
            }
        }
        if(ay==12){
            if(1<=gün && gün<=21 ){
                System.out.print(gün+ " ARALIK " + " YAY BURCU ");
            }
            else if (21<gün) {
                System.out.print(gün+ " ARALIK " + " OĞLAK BURCU ");
            }
        }







    }
}
