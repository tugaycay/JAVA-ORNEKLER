public class str_eşitlik {
    static boolean ispPalandrom(String Str){
        int a=0;
        int b=Str.length()-1;  // indisler 0 dan başladığı için yaptık yani elaman sayısı - 1
        while(a<b){
            if(Str.charAt(a)!=Str.charAt(b)){ //charAt tüm elemanları yazfur
                return false;
            }

            a++;
            b--;
        }
        return  true;
    }
    public static void main(String[]args){
        System.out.print(ispPalandrom("tugay"));

    }
}
