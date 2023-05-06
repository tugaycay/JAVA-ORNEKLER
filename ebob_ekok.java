import java.util.Scanner;
public class ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int ebob=1; //burayı 1 eşitlemesek tüm değlerin çıktısını verirdi,1 eşitlediğimiz için son değeri verir.

        System.out.print("1.Sayı Giriniz:");
        a = input.nextInt();
        System.out.print("2.Sayı Giriniz:");
        b = input.nextInt();
        if (a > b) {
            for (int k = 1; k <= b; k++) {
                if (a % k == 0 && b % k == 0) {
                    ebob = k;
                    System.out.println(ebob);
                }

            }
            System.out.println("ebob: "+ebob);
            System.out.print("ekok: " +a*b/ebob);
        }

        if (b > a) {
            for (int k = 1; k <= a; k++) {
                if (a % k == 0 && b % k == 0) {
                    ebob = k;
                }

            }
            System.out.println("ebob: "+ ebob);
            System.out.print("ekok: " +a*b/ebob);


        }
    }
}
