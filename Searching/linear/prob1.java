public class prob1{
  public static void main(String[] args){
 	
	  
	int[] arr = {14,2,5,9,1,0,-7};
	int target = 5;
	System.out.println(linearSearch(arr,target));

  }

  static int linearSearch(int[] arr,int target){
	if(arr.length == 0){
		return -1;
	}

	for(int i=0; i<arr.length; i++){
		int element = arr[i];
		if(element == target){
			return i;
		}
	}

	return -1;
		

  }


}
