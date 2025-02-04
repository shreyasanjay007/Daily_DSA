public class prob6{
	public static void main(String[] args){

		int[][] arr = {{1,2},{3,4,5},{6,7,8,9}};
		int ans = searchMax(arr);
		System.out.println(ans);

	}

	static int searchMax(int[][] arr){
		int max = arr[0][0];
		for(int row=0; row<arr.length; row++){
			for(int col=0; col<arr[row].length; col++){
				if(arr[row][col]>max){
					max = arr[row][col];
				}
			}
		}
		return max;
	}



}
