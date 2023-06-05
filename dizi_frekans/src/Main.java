import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int beyond=inp.nextInt();
        int startIndex=0;
        int count=1;
        int[] arr=new int[beyond];

        for (int i=0; i<arr.length ; i++){
            arr[startIndex++]= inp.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0; i< arr.length; i++){
            if (i==0){
                for (int j=0; j< arr.length;j++){
                    if ((i !=j)&&(arr[i] == arr[j])){
                        count++;
                    }

                } System.out.println(arr[i]+" sayısı "+count+" kez tekrar etti.");
            } else if (arr[i] != arr[i-1]) {
                for (int j=0; j< arr.length;j++){
                    if ((i !=j)&&(arr[i] == arr[j])){
                        count++;
                    }
            }System.out.println(arr[i]+" sayısı "+count+" kez tekrar etti.");

        }
        }
    }
}