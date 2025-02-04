public class prob3{

	public static void main(String[] args){


		int[] arr = {3,1,67,34,20,56,99};
		int ans = search3(arr,6,1,5);
		System.out.println(ans);



	}


	static int search3(int[] arr,int target, int start, int end){

		if(arr.length == 0){
			return -1;
		}

		for(int i=start; i<=end; i++){
			int element = arr[i];
			if(element == target){
				return 1;
			}
		}

		return -1;

	}





}
