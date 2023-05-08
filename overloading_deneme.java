public class overloading_deneme {
        static void print(){
            System.out.println("TUGAY BABA");
        }
        static void print(int a){
            System.out.println("TUGAY BABA"+ a);
        }
        static void print(int a,int b ,int c){
            System.out.println("TUGAY BABA"+a +b + c);
        }
        static int print(int a ,int b){
            int top =a+b;
            return top;
        }
        public static void main(String[]args){
            print();
            print(31);
            print(31,2,5);
            System.out.println(print(7,8));

        }
    }

