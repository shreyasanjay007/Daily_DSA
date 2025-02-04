public class prob2{

	public static void main(String[] args){

		String name = "shreya";
		char target = 'y';
		boolean ans = searchString(name,target);
		System.out.println(ans);
	}

	static boolean searchString(String str, char target){
		if(str.length()==0){
			return false;
		}

		for(int i=0; i<str.length(); i++){
			char element = str.charAt(i);
			if(element==target){
				return true;
			}
		}

		return false;

	
	}



}
