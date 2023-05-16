package Diziler;
public class dizi_harf {
    public static void main(String[]args){

        /*
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * " ;
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        */
        String[][] tugay = new String[6][4];
        for (int a = 0; a < tugay.length; a++){
            for (int b=0;b<tugay[a].length;b++){
                if (a==0 || a==2 || a==5){
                    tugay[a][b] = " * " ;
                } else if (b==0 || b==3) {
                    tugay[a][b] = " * " ;
                }else {
                    tugay[a][b] = "   " ;
                }


            }
        } for (String[] row : tugay){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();


    }}
}
