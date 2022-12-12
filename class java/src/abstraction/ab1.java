package abstraction;

//Abstract class must complete by at least one abstract method  or vice versa
//We need use extend key word to the abstract class to implement the method
public abstract class ab1  {

	public static void main(String[] args) {
		ab2 v = new ab2();
		v.m1();
		v.m2();
		
		
		
		
	}
	 public abstract void m1(); 
	   
	    public abstract void m3();
	      
	    public void m2() {
	    	System.out.println("m2");
	    	
	    }

}
