public class prob7{

	public static void main(String[] args){
		int[] arr = {1,12,342,2222,344};
		int ans = evenCount(arr);
		System.out.println(ans);
	}

	static int evenCount(int[] arr){
		int even = 0;
		for(int index=0; index<arr.length; index++){
			int count = 0;
			int num = arr[index];
			while(num!=0){
			    num = num/10;
			    count++;
			}

			if(count % 2 == 0){
			    even++;
			}
		}
		return even;

	}


}
