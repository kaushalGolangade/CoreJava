package String;

public class RevString {

	public static void main(String[] args) {
		
		String k = "madam";
		
		String rev = "";
			
		for(int i =k.length()-1; i >= 0; i-- ) {
			
			rev = rev + k.charAt(i);
					
		}
		System.out.println(rev);
	
		
		if(k.equals(rev)) {
			
			System.out.println("yes palendrom");
			
		} else {
			
			System.out.println("no its not");
		}
	}

}
