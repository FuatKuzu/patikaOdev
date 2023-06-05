import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner inp =new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz:\t");
        int boyut = inp.nextInt();
        int[] arr= new int[boyut];
        int count= 0;
        System.out.println("Dizinin elemanlarını giriniz:\t");
        for (int i=0; i<boyut;i++){

            int nums=inp.nextInt();
           arr[count++] =nums;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}