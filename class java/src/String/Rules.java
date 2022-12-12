package String;

public class Rules {

	public static void main(String[] args) {
		//by different  variable with same data type and same name  (data value)
	String n = "kaushal";
	String m = "kaushal";
	
	System.out.println(n.equals(m));         //true
	 
	System.out.println(n == m);                //true
	
	//by different object with same data type and same name  (data value)
	//by using new key word	
	
		String A = new String ("ram");
		String B = new String ("ram");
		

		System.out.println(A.equals(B));       //true
		 
		System.out.println(A == B);         // ----> False (because of new object)
		
		
		
		
		
	 
	}

}
