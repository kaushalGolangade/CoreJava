package Constructer;

public class rules {
	//constructor is the specialized method or block within the same class 
   //make object by class name 
	//Constructor  can accept argument
	public rules() {
		this(9);
		System.out.println("kaushal");            
		
	}
     public rules(int x) {
		
		System.out.println("kanchan "+ x);
	}
	public static void main(String[] args) {
		rules ref = new rules();
		
	}
	
}
