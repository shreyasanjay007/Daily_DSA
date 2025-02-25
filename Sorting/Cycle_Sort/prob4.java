// import java.util.Arrays;

public class prob4 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        duplicate(arr);
        // System.out.println(Arrays.toString(arr));
    }
    static void duplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else{
                i++;
            }
        }
        
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != (index+1)){
                System.out.println(arr[index]);
            }
        }
    }
}
