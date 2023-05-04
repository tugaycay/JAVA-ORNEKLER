import java.util.Scanner;
public class dort_bes_katları {
public static void main(String[]args) {
    Scanner inp = new Scanner(System.in);
    int a;
    System.out.print("sayi giriniz:");
    a = inp.nextInt();

    for (int i = 1; i <= a; i *= 4) {
        System.out.println("4'ün KAtLARI");
        System.out.println(i);
    }

    for (int b=1; b<=a;b*=5){
        System.out.println("5'in KATLARI");
        System.out.println(b);
    }

}
}
