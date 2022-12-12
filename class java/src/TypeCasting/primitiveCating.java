package TypeCasting;

// type casting have two types a] primitive type casting     b] class type casting

public class primitiveCating {
//primitive type casting 
	//a] implicit type casting :- storing the information from higher data type to lower data type
	
	//b]explicit type casting :- storing the information from lower data type to higher data type
	
	
	
	public void m2() {
		System.out.println("m2 parrent");
	}
	
	
	
	
	public static void main(String[] args) {                                                           //use can use this data types also
		System.out.println("implicite type casting");                                                  //      |
		                                                                                               //      |
		int a = 68654;                                                                                    // float
		long b = a;		                                                                                  // double
		System.out.println(" implicite type casting := "+ b );
		
		System.out.println();                           // line space
		
		System.out.println("explicite type casting");		
		long x = 648946;                                                                                  //double
		int y = (int) x;                                                                                 //float

		System.out.println("explicite type casting := " +  y);
	}

}
