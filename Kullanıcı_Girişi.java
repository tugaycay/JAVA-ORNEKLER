import java.util.Scanner;
public class Kullanıcı_Girişi {
    public static void main(String[]args){
        System.out.println("KULLANICI GİRİŞİ");
        String nickname , password ;
        Scanner inp = new Scanner(System.in);

        System.out.print("KULLANICI ADI : ");
                nickname = inp.nextLine();
        System.out.print("Şifre : ");
            password = inp.nextLine();

            if (nickname.equals("tugay") && password.equals("12345")) {
                System.out.print("giriş başarılı ");
            }
            else {
                System.out.print("giriş başarısız. ");
            }


    }
}