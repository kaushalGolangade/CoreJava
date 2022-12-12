package String;

public class S4 {
	
	public static void main(String[] args) {
		String s="Madam";
		String rev="";
		
		for(int x=s.length()-1 ; x>=0 ; x--) {
			
		rev=rev+s.charAt(x);
	
		
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome string");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}
}

