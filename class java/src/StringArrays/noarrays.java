package StringArrays;

public class noarrays {

	public static void main(String[] args) {
		int arr [] = {100 ,65 ,6,554689, 654,98};
          
		int ans = arr[0];
		for(int i = 0; i<= arr.length - 1; i++) {			
			
			if(ans < arr[i]) {
				ans = arr[i];
		 } 
		}		
		System.out.println(ans);
	}

}
