import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin satır sayısı:\t");
        int x= inp.nextInt();
        System.out.println("Dizinin sütun sayısı:\t");
        int y= inp.nextInt();
        int[][] arr= new int[x][y];
        //int[][] transpose= new arr[y][x];


        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print("Dizinin [" + (i) + "," + (j) + "] indisindeki elemanı giriniz ");
                arr[i][j]=inp.nextInt();
            }
        }
        //print matrix
        System.out.println("Matris:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //print matrix
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i <  arr[i].length; i++) {
            for (int j = 0; j <  arr.length; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.print("\n");
        }
    }
}