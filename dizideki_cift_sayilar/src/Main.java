import java.util.Arrays;
public class Main {
    static boolean isFind(int[] arr,int value) {
        for (int i : arr){
            if ((i==value) ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr={-2,-8,5,2,87,2,-7,7,9,22,17,13,-8,-2,15,15,2,87,-2,-2,-2,22,22};
        int[] duplicate= new int[arr.length];
        int startIndex=0;
        for (int i=0 ; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if ((i!=j) && (arr[i]==arr[j])&&(arr[i]%2==0)){
                    if (!isFind(duplicate, arr[i])){
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if (value !=0){
                System.out.print(value+" ");
            }
        }
    }
}