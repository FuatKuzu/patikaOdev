public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[][] letter= new String[5][3];

        for (int i=0; i< letter.length; i++){
            for (int j=0; j<letter[i].length;j++){
                if ((i==0)||(i==2)||(i==4)){
                    letter[i][j]=" * ";
                } else if ((j==0)||(j==2)) {
                    letter[i][j]=" * ";
                }else {
                    letter[i][j]="   ";
                }
            }
        }
        for (String[] row: letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}