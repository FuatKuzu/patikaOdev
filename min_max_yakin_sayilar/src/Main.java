import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz!");
        Scanner inp= new Scanner(System.in);
        int[] arr= {15,12,788,40,28,1,-1,-778,2,0};
        int min = arr[0];
        int max = arr[0];
        Arrays.sort(arr);
      int num= inp.nextInt();
        for (int i : arr){
            if (i >num) {
                max = i;
                System.out.println("En yakın maksimum sayı :\t"+max);
                break;
            }
    }
        for (int i= arr.length-1; i>=0; i--){
        if (arr[i]<num){
            min=arr[i];
            System.out.println("En yakın minimum sayı :\t"+min);
            break;
        }
        }
    }
}