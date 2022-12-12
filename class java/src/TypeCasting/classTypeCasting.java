package TypeCasting;

public class classTypeCasting extends primitiveCating {
//class type casting has two types 1] upcasting      2]downcasting
	// 1] upcasting :- Conversion of subclass type into Super class type is called as Up casting.
	//  2] downcasting :- doesn't supported by java because subclass reference cannot hold the object of super class it gives compile time error
	
	public void m1() {
		System.out.println("m1 child");
	}
	
	
	public static void main(String[] args) {
		classTypeCasting ref = new  classTypeCasting();
		 
		 primitiveCating var = ref;                                //upcasting (way - 1)
		 ref.m2();
		 
		 
		 
		 primitiveCating var1 = new classTypeCasting();            //upcasting (way - 2)
		 
		 var1.m2();

	}

}
  