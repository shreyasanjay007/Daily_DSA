import java.util.Arrays;

public class prob1{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr){
            int i = 0;
            while(i < arr.length){
                int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else{
                i++;
            }
             
           }

        }
    }
    
