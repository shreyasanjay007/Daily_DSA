import java.util.Arrays;

public class prob1{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(arr);
    }
    
    static void selectionSort(int[] arr){
        for(int i=0; i < arr.length; i++){
            int maxIndex = 0;
            int lastIndex = arr.length - i - 1;

            for(int j=0; j < arr.length-i; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }
}