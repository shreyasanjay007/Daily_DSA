// import java.util.Arrays;
public class prob2{
    public static void main(String[] args){
        int[] arr = {3,0,1,2,8,9,6,5,4};
        int ans = missingNo(arr);
        System.out.println(ans);
    }

    static int missingNo(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else{
                i++;
            }
        }

        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}