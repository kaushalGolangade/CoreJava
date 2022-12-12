package String;

public class S3 {
//1] print only characters
	//2] print only numerics 
	
	
	
	public static void main(String[] args) {
		String city = "ds4fcrh46816fc";
	
		
		
		for(int i = 0; i < city.length(); i++) {
			char ch = city.charAt(i);
			if (Character.isAlphabetic(ch))                 //characters will print 
				System.out.print(ch );
               
		//	if (Character.isDigit(ch))                              //numerics will print
			
		//	System.out.print(ch );
		}
		

	}

}
