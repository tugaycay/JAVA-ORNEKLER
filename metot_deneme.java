public class metot_deneme {
    static int islem(int a, int b ){
        int top=1;
        for(int i=1;i<=b;i++){
            top*=a;
        }
        return top;
    }



    public static void main(String[]args){

        System.out.print(islem(5,2));

    }

    /*    static int top(int a , int b ,int c){
        int result=a+b+c;
        return result;
    }
    public static void main(String[]args){
        System.out.print(top(5,6,7));
    }*/

}
