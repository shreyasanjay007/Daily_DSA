public class prob4{

	public static void main(String[] args){

		int[] arr = {2,5,1,4,9};
		int ans = minimum(arr);
		System.out.println(ans);
	}


	static int minimum(int[] arr){

		int min = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			
		}
		return min;
			

	}



}
