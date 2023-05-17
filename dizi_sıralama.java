package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class dizi_sıralama {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.print("Dizinin boyutu n : ");
        int number = sc.nextInt();
        int[] list = new int[number];

        System.out.println("Dizinin elemanlarını giriniz :");
        
        for (int i = 0; i < list.length; i++) {
            counter ++;
            System.out.print(counter +"."+" Eleman: ");
            int numbers = sc.nextInt();
            list[i] =  numbers;

        }

        Arrays.sort(list);

        System.out.println("Sıralama : "+ Arrays.toString(list)+" ");


    }
}
