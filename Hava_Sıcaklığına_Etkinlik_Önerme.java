import java.util.Scanner;
public class Hava_Sıcaklığına_Etkinlik_Önerme {
    public static void main(String[]args){
        System.out.println("Hava Sıcaklığına Göre Etkinlik Önerme");
        int sicaklik ;
       Scanner inp =new Scanner(System.in);
       System.out.print("SICAKLIK GİRİNİZ:");
       sicaklik=inp.nextInt();

       if (sicaklik<5) {
           System.out.println("Kayak");
       }
       else if(5<=sicaklik && sicaklik<=15){
           System.out.println("Sinema");
       }

       else if (15<=sicaklik && sicaklik<=25){
           System.out.println("Mangal");
       }
       else{
           System.out.println("Yüzme");
       }



    }
}
