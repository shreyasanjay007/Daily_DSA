public class prob8 {
    public static void main(String[] args) {
        int[][] arr ={{1,2},{3,4,5},{6,7}};
        int maxResult = maxWealth(arr);
        System.out.println(maxResult);
    }

    static int maxWealth(int[][] arr){
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            int sum = 0;
            for(int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
